package com.mir00r.practiceApacheCamel.domains.thirdpartyinteg.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ApiGatewayRoute extends RouteBuilder {

  public static final String DIRECT_THIRD_PARTY_API_PROCESS = "direct:thirdPartyApiProcess";

  @Override
  public void configure() throws Exception {
    // Handle rate-limiting to third-party services
    int requestLimit = 5;  // Allow 5 requests per minute
    int timePeriodMillis = 60000;

    // Start the Camel route
    from(DIRECT_THIRD_PARTY_API_PROCESS)
      .routeId("api-gateway-route")

      // Call the payment gateway (simulated)
      .to("direct:payment-service") // this could separate service for payment

      // Call the shipping provider (simulated)
      .to("direct:shipping-service") // this could separate service for shipping the product after successful payment

      // Call the SMS service (simulated)
      .to("direct:sms-service") // this could separate service for sending sms after shipping the product successfully

      // Aggregate responses and send back
      .setBody(simple(
        "Payment response: ${header.paymentResponse}, Shipping response: ${header.shippingResponse}, SMS response: ${header.smsResponse}"));

    // Payment service route
    from("direct:payment-service")
      .routeId("payment-service-route")
      .throttle(requestLimit).timePeriodMillis(timePeriodMillis)  // Apply rate limiting
      .log("Calling payment service")
      .setHeader("paymentResponse", constant("Payment processed successfully"))
      .setBody(simple("Payment processed successfully"));

    // Shipping service route
    from("direct:shipping-service")
      .routeId("shipping-service-route")
      .throttle(requestLimit).timePeriodMillis(timePeriodMillis)  // Apply rate limiting
      .log("Calling shipping provider")
      .setHeader("shippingResponse", constant("Shipping arranged"))
      .setBody(simple("Shipping arranged"));

    // SMS service route
    from("direct:sms-service")
      .routeId("sms-service-route")
      .throttle(requestLimit).timePeriodMillis(timePeriodMillis)  // Apply rate limiting
      .log("Calling SMS service")
      .setHeader("smsResponse", constant("SMS sent"))
      .setBody(simple("SMS sent"));
  }
}
