package netflix;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import java.util.*;
import java.io.*;
import protos.Status;
import protos.*;
import java.util.concurrent.ConcurrentMap;

public class PricingServer {
	private final int port;
	private Server server = null;
	private final String countryPriceFileName = "countrypricing";
	private final String customerInfoFileName = "customerinfo";

	public PricingServer(int port) throws IOException {
		this.port = port;
		ConcurrentMap<String, CountryPrice> cp = Utility.parseCountryPricing(countryPriceFileName);
		ConcurrentMap<String, CustomerInfo> cm = Utility.parseCustomerInfo(customerInfoFileName);

		server = ServerBuilder.forPort(port).addService(new PriceService(cp, cm, countryPriceFileName)).build();
	}

	/** Start serving requests. */
	public void start() throws IOException {
		server.start();
		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run() {
				// Use stderr here since the logger may has been reset by its JVM shutdown hook.
				System.err.println("*** shutting down gRPC server since JVM is shutting down");
				PricingServer.this.stop();
				System.err.println("*** server shut down");
			}
		});
	}

	/** Stop serving requests and shutdown resources. */
	public void stop() {
		if (server != null) {
			server.shutdown();
		}
	}

	/**
	 * Await termination on the main thread since the grpc library uses daemon
	 * threads.
	 */
	private void blockUntilShutdown() throws InterruptedException {
		if (server != null) {
			server.awaitTermination();
		}
	}

	/**
	 * Main method. This comment makes the linter happy.
	 */

	public static void main(String[] args) throws Exception {
		PricingServer server = new PricingServer(8901);
		server.start();
		server.blockUntilShutdown();
	}
}

/**
 * Implementation of Price service.
 *
 * <p>
 * See price_service.proto for details of the methods.
 */
class PriceService extends PriceGuideGrpc.PriceGuideImplBase {

	ConcurrentMap<String, CountryPrice> cmap;
	ConcurrentMap<String, CustomerInfo> cmmap;
	String countryPriceFileName;

	public PriceService(ConcurrentMap<String, CountryPrice> cp, ConcurrentMap<String, CustomerInfo> cmmap,
			String countryPriceFileName) {
		this.cmap = cp;
		this.cmmap = cmmap;
		this.countryPriceFileName = countryPriceFileName;
	}

	@Override
	public void updateGlobalPrices(AllCountryPrice price, StreamObserver<Status> responseObserver) {
		responseObserver.onNext(updateCountryPrices(price));
		responseObserver.onCompleted();
	}

	private Status updateCountryPrices(AllCountryPrice prices) {
		Iterator<CountryPrice> iter = prices.getCountryPriceList().iterator();
		while (iter.hasNext()) {
			CountryPrice cp = iter.next();
			if (cmap.containsKey(cp.getCountry())) {
				cmap.put(cp.getCountry(), cp);
			} else {
				Utility.writeToFile(cmap, countryPriceFileName);
				return Status.newBuilder().setStatValue(1).build();
			}
		}
		return Status.newBuilder().setStatValue(0).build();
	}

	@Override
	public void getPriceForCountry(CountryRequest country, StreamObserver<CountryPrice> responseObserver) {
		responseObserver.onNext(getCountryPrice(country));
		responseObserver.onCompleted();
	}

	private CountryPrice getCountryPrice(CountryRequest request) {
		if (cmap.containsKey(request.getCountry())) {
			return cmap.get(request.getCountry());
		}
		return CountryPrice.newBuilder().build();
	}

	@Override
	public void getPriceForCustomer(CustomerRequest customer, StreamObserver<CustomerPrice> responseObserver) {
		responseObserver.onNext(getCustomerPrice(customer));
		responseObserver.onCompleted();
	}

	private CustomerPrice getCustomerPrice(CustomerRequest request) {
		int price = -1;
		if (cmmap.containsKey(request.getId())) {
			CustomerInfo info = cmmap.get(request.getId());
			if (cmap.containsKey(info.getCountry())) {
				CountryPrice cp = cmap.get(info.getCountry());
				if (info.getPlan().equals("1s")) {
					price = cp.getPrice1S();
				} else if (info.getPlan().equals("2s")) {
					price = cp.getPrice2S();
				} else if (info.getPlan().equals("4s")) {
					price = cp.getPrice4S();
				}
			}
		}
		return CustomerPrice.newBuilder().setPrice(price).build();
	}

}