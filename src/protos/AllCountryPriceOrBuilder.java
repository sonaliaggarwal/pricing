// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: price_service.proto

package protos;

public interface AllCountryPriceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:AllCountryPrice)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .CountryPrice countryPrice = 1;</code>
   */
  java.util.List<protos.CountryPrice> 
      getCountryPriceList();
  /**
   * <code>repeated .CountryPrice countryPrice = 1;</code>
   */
  protos.CountryPrice getCountryPrice(int index);
  /**
   * <code>repeated .CountryPrice countryPrice = 1;</code>
   */
  int getCountryPriceCount();
  /**
   * <code>repeated .CountryPrice countryPrice = 1;</code>
   */
  java.util.List<? extends protos.CountryPriceOrBuilder> 
      getCountryPriceOrBuilderList();
  /**
   * <code>repeated .CountryPrice countryPrice = 1;</code>
   */
  protos.CountryPriceOrBuilder getCountryPriceOrBuilder(
      int index);
}
