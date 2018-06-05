Background Information: 	
Netflix offers customers 3 service plans (1S, 2S, & 4S) based on the number of concurrent streams and priced accordingly.  As we are a global service, we have defined prices for each service plan for country we support.  For each customer we store the service plan (1S, 2S, or 4S), the price for the chosen plan and the country of the customer. 

Problem Statement:
Netflix rolls out price changes for our service periodically.  In order to accurately and effective change the prices of 100M+ customers, we need to have a systematic solution for changing prices.  

Objective:
Design and implement a system that hosts Netflix pricing which will enable us to systematically change prices across all our global customers.  We want to see how your system supports price changes pushed by country.

Choice of Technology Solution
I decided to use gRPC to solve the problem. gRPC uses protocol buffers as the Interface Definition Language (IDL) for describing both the service interface and the structure of the payload messages.

Alternate Technology considered
I considered using RESTful APIs to solve the problem.

Service Interface design
service PriceGuide {
  // A client-to-server streaming RPC.
  rpc updateGlobalPrices(AllCountryPrice) returns (Status) {};
  rpc getPriceForCountry(CountryRequest) returns (CountryPrice) {};
  rpc getPriceForCustomer(CustomerRequest) returns (CustomerPrice) {};
}


rpc updateGlobalPrices uses as input the repeated list of countries and their prices for three different plans and returns a status (success, no error) to determine if the operation succeeded.
rpc getPriceForCountry returns the pricing information of the three different plans for the requested country 
rpc getPriceForCustomer returns the pricing information for the customer depending on his country and his plan type.

Design decisions
1. Country Pricing info is stored in a Concurrent HashMap, which is read from a serialized protocol buffer input file when the server starts. Once the api call updateGlobalPrices is made, the hashmap is updated and updated to file as well. Since there are 195 countries in the world, this information can easily be stored in memory. The size of each record is 4 bytes for the country, and 4*3 bytes . So the total size is 195*16 bytes ~ 3 KB.
2. The customer information is also stored in a hashmap. however for 100M+ customers that is not a wise choice, and should be stored on a disk to which the calls are made.

Further improvements to be made
1. I would like to store currency in countryPricing protobuf.
2. I would like to store customer info in a database like MySQL instead of storing in an in-memory data-structure like HashMap.
3. When the api call for changing pricing globally is done, the customers within their current billing cycle will not immediately be updated. Hence, the old pricing must also be stored.


