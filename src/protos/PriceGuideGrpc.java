package protos;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
//@javax.annotation.Generated(
 //   value = "by gRPC proto compiler (version 1.12.0)",
 //   comments = "Source: price_service.proto")
public final class PriceGuideGrpc {

  private PriceGuideGrpc() {}

  public static final String SERVICE_NAME = "PriceGuide";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getUpdateGlobalPricesMethod()} instead. 
  public static final io.grpc.MethodDescriptor<protos.AllCountryPrice,
      protos.Status> METHOD_UPDATE_GLOBAL_PRICES = getUpdateGlobalPricesMethodHelper();

  private static volatile io.grpc.MethodDescriptor<protos.AllCountryPrice,
      protos.Status> getUpdateGlobalPricesMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<protos.AllCountryPrice,
      protos.Status> getUpdateGlobalPricesMethod() {
    return getUpdateGlobalPricesMethodHelper();
  }

  private static io.grpc.MethodDescriptor<protos.AllCountryPrice,
      protos.Status> getUpdateGlobalPricesMethodHelper() {
    io.grpc.MethodDescriptor<protos.AllCountryPrice, protos.Status> getUpdateGlobalPricesMethod;
    if ((getUpdateGlobalPricesMethod = PriceGuideGrpc.getUpdateGlobalPricesMethod) == null) {
      synchronized (PriceGuideGrpc.class) {
        if ((getUpdateGlobalPricesMethod = PriceGuideGrpc.getUpdateGlobalPricesMethod) == null) {
          PriceGuideGrpc.getUpdateGlobalPricesMethod = getUpdateGlobalPricesMethod = 
              io.grpc.MethodDescriptor.<protos.AllCountryPrice, protos.Status>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "PriceGuide", "updateGlobalPrices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.AllCountryPrice.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.Status.getDefaultInstance()))
                  .setSchemaDescriptor(new PriceGuideMethodDescriptorSupplier("updateGlobalPrices"))
                  .build();
          }
        }
     }
     return getUpdateGlobalPricesMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetPriceForCountryMethod()} instead. 
  public static final io.grpc.MethodDescriptor<protos.CountryRequest,
      protos.CountryPrice> METHOD_GET_PRICE_FOR_COUNTRY = getGetPriceForCountryMethodHelper();

  private static volatile io.grpc.MethodDescriptor<protos.CountryRequest,
      protos.CountryPrice> getGetPriceForCountryMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<protos.CountryRequest,
      protos.CountryPrice> getGetPriceForCountryMethod() {
    return getGetPriceForCountryMethodHelper();
  }

  private static io.grpc.MethodDescriptor<protos.CountryRequest,
      protos.CountryPrice> getGetPriceForCountryMethodHelper() {
    io.grpc.MethodDescriptor<protos.CountryRequest, protos.CountryPrice> getGetPriceForCountryMethod;
    if ((getGetPriceForCountryMethod = PriceGuideGrpc.getGetPriceForCountryMethod) == null) {
      synchronized (PriceGuideGrpc.class) {
        if ((getGetPriceForCountryMethod = PriceGuideGrpc.getGetPriceForCountryMethod) == null) {
          PriceGuideGrpc.getGetPriceForCountryMethod = getGetPriceForCountryMethod = 
              io.grpc.MethodDescriptor.<protos.CountryRequest, protos.CountryPrice>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "PriceGuide", "getPriceForCountry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.CountryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.CountryPrice.getDefaultInstance()))
                  .setSchemaDescriptor(new PriceGuideMethodDescriptorSupplier("getPriceForCountry"))
                  .build();
          }
        }
     }
     return getGetPriceForCountryMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetPriceForCustomerMethod()} instead. 
  public static final io.grpc.MethodDescriptor<protos.CustomerRequest,
      protos.CustomerPrice> METHOD_GET_PRICE_FOR_CUSTOMER = getGetPriceForCustomerMethodHelper();

  private static volatile io.grpc.MethodDescriptor<protos.CustomerRequest,
      protos.CustomerPrice> getGetPriceForCustomerMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<protos.CustomerRequest,
      protos.CustomerPrice> getGetPriceForCustomerMethod() {
    return getGetPriceForCustomerMethodHelper();
  }

  private static io.grpc.MethodDescriptor<protos.CustomerRequest,
      protos.CustomerPrice> getGetPriceForCustomerMethodHelper() {
    io.grpc.MethodDescriptor<protos.CustomerRequest, protos.CustomerPrice> getGetPriceForCustomerMethod;
    if ((getGetPriceForCustomerMethod = PriceGuideGrpc.getGetPriceForCustomerMethod) == null) {
      synchronized (PriceGuideGrpc.class) {
        if ((getGetPriceForCustomerMethod = PriceGuideGrpc.getGetPriceForCustomerMethod) == null) {
          PriceGuideGrpc.getGetPriceForCustomerMethod = getGetPriceForCustomerMethod = 
              io.grpc.MethodDescriptor.<protos.CustomerRequest, protos.CustomerPrice>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "PriceGuide", "getPriceForCustomer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.CustomerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.CustomerPrice.getDefaultInstance()))
                  .setSchemaDescriptor(new PriceGuideMethodDescriptorSupplier("getPriceForCustomer"))
                  .build();
          }
        }
     }
     return getGetPriceForCustomerMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PriceGuideStub newStub(io.grpc.Channel channel) {
    return new PriceGuideStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PriceGuideBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PriceGuideBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PriceGuideFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PriceGuideFutureStub(channel);
  }

  /**
   */
  public static abstract class PriceGuideImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * A client-to-server streaming RPC.
     * </pre>
     */
    public void updateGlobalPrices(protos.AllCountryPrice request,
        io.grpc.stub.StreamObserver<protos.Status> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateGlobalPricesMethodHelper(), responseObserver);
    }

    /**
     */
    public void getPriceForCountry(protos.CountryRequest request,
        io.grpc.stub.StreamObserver<protos.CountryPrice> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPriceForCountryMethodHelper(), responseObserver);
    }

    /**
     */
    public void getPriceForCustomer(protos.CustomerRequest request,
        io.grpc.stub.StreamObserver<protos.CustomerPrice> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPriceForCustomerMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUpdateGlobalPricesMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                protos.AllCountryPrice,
                protos.Status>(
                  this, METHODID_UPDATE_GLOBAL_PRICES)))
          .addMethod(
            getGetPriceForCountryMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                protos.CountryRequest,
                protos.CountryPrice>(
                  this, METHODID_GET_PRICE_FOR_COUNTRY)))
          .addMethod(
            getGetPriceForCustomerMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                protos.CustomerRequest,
                protos.CustomerPrice>(
                  this, METHODID_GET_PRICE_FOR_CUSTOMER)))
          .build();
    }
  }

  /**
   */
  public static final class PriceGuideStub extends io.grpc.stub.AbstractStub<PriceGuideStub> {
    private PriceGuideStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PriceGuideStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PriceGuideStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PriceGuideStub(channel, callOptions);
    }

    /**
     * <pre>
     * A client-to-server streaming RPC.
     * </pre>
     */
    public void updateGlobalPrices(protos.AllCountryPrice request,
        io.grpc.stub.StreamObserver<protos.Status> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateGlobalPricesMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPriceForCountry(protos.CountryRequest request,
        io.grpc.stub.StreamObserver<protos.CountryPrice> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPriceForCountryMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPriceForCustomer(protos.CustomerRequest request,
        io.grpc.stub.StreamObserver<protos.CustomerPrice> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPriceForCustomerMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PriceGuideBlockingStub extends io.grpc.stub.AbstractStub<PriceGuideBlockingStub> {
    private PriceGuideBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PriceGuideBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PriceGuideBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PriceGuideBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * A client-to-server streaming RPC.
     * </pre>
     */
    public protos.Status updateGlobalPrices(protos.AllCountryPrice request) {
      return blockingUnaryCall(
          getChannel(), getUpdateGlobalPricesMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public protos.CountryPrice getPriceForCountry(protos.CountryRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPriceForCountryMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public protos.CustomerPrice getPriceForCustomer(protos.CustomerRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPriceForCustomerMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PriceGuideFutureStub extends io.grpc.stub.AbstractStub<PriceGuideFutureStub> {
    private PriceGuideFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PriceGuideFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PriceGuideFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PriceGuideFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * A client-to-server streaming RPC.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<protos.Status> updateGlobalPrices(
        protos.AllCountryPrice request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateGlobalPricesMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protos.CountryPrice> getPriceForCountry(
        protos.CountryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPriceForCountryMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protos.CustomerPrice> getPriceForCustomer(
        protos.CustomerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPriceForCustomerMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPDATE_GLOBAL_PRICES = 0;
  private static final int METHODID_GET_PRICE_FOR_COUNTRY = 1;
  private static final int METHODID_GET_PRICE_FOR_CUSTOMER = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PriceGuideImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PriceGuideImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPDATE_GLOBAL_PRICES:
          serviceImpl.updateGlobalPrices((protos.AllCountryPrice) request,
              (io.grpc.stub.StreamObserver<protos.Status>) responseObserver);
          break;
        case METHODID_GET_PRICE_FOR_COUNTRY:
          serviceImpl.getPriceForCountry((protos.CountryRequest) request,
              (io.grpc.stub.StreamObserver<protos.CountryPrice>) responseObserver);
          break;
        case METHODID_GET_PRICE_FOR_CUSTOMER:
          serviceImpl.getPriceForCustomer((protos.CustomerRequest) request,
              (io.grpc.stub.StreamObserver<protos.CustomerPrice>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class PriceGuideBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PriceGuideBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return protos.PriceGuideProtos.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PriceGuide");
    }
  }

  private static final class PriceGuideFileDescriptorSupplier
      extends PriceGuideBaseDescriptorSupplier {
    PriceGuideFileDescriptorSupplier() {}
  }

  private static final class PriceGuideMethodDescriptorSupplier
      extends PriceGuideBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PriceGuideMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PriceGuideGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PriceGuideFileDescriptorSupplier())
              .addMethod(getUpdateGlobalPricesMethodHelper())
              .addMethod(getGetPriceForCountryMethodHelper())
              .addMethod(getGetPriceForCustomerMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
