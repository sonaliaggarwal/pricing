package netflix;

import java.io.*;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import protos.*; 

public class Utility {

   public static ConcurrentMap<String, CustomerInfo> parseCustomerInfo(String fileName) throws IOException {
	   ConcurrentMap<String, CustomerInfo> map = new ConcurrentHashMap<String, CustomerInfo>();
		try {
			FileInputStream file = new FileInputStream(fileName);
			while (true) {
				CustomerInfo msg = CustomerInfo.parseDelimitedFrom(file);
				if (msg == null)
		            break;
				map.put(msg.getId(), msg);
			}
			file.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
		} 
		return map;
   }
	
	/**
	 * Parses the Proto serilalized input file containing the pricing list of countries.
	 */
	public static ConcurrentMap<String, CountryPrice> parseCountryPricing(String fileName) throws IOException {
		ConcurrentMap<String, CountryPrice> map = new ConcurrentHashMap<String, CountryPrice>();
		try {
			FileInputStream file = new FileInputStream(fileName);
			while (true) {
				CountryPrice msg = CountryPrice.parseDelimitedFrom(file);
				if (msg == null)
		            break;
				map.put(msg.getCountry(), msg);
			}
			file.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
		} 
		return map;
	}

	public static void writeToFile(Map<String, CountryPrice> cps, String filename) {
		FileOutputStream output;
		try {
			output = new FileOutputStream(filename);
			for (CountryPrice cp : cps.values()) {
				cp.writeDelimitedTo(output);
			}
			output.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
