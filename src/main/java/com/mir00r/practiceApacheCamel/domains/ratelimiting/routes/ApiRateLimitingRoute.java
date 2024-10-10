package com.mir00r.practiceApacheCamel.domains.ratelimiting.routes;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.metrics.routepolicy.MetricsRoutePolicyFactory;
import org.springframework.stereotype.Component;

@Component
public class ApiRateLimitingRoute extends RouteBuilder {

  private static final int MAX_REQUESTS_PER_MINUTE = 60;  // Limit of requests per minute
  public static final String DIRECT_RATE_LIMITING = "direct:startRateLimit";

  @Override
  public void configure() throws Exception {

    // Apply a route policy to track metrics (Optional)
    MetricsRoutePolicyFactory routePolicyFactory = new MetricsRoutePolicyFactory();
    getContext().addRoutePolicyFactory(routePolicyFactory);

//    from("direct:start")
//      .routeId("api-rate-limiting-route")
//      .throttle(MAX_REQUESTS_PER_MINUTE)
//      .timePeriodMillis(60000) // Throttle the rate to 60 requests per minute
//      .log("Processing API Request: ${header.CamelHttpUri}")
//      .to("https://jsonplaceholder.typicode.com/posts") // Replace with the actual third-party API URL
//      .log("Received response: ${body}");

    // Define the route
    from(DIRECT_RATE_LIMITING)
      .routeId("api-rate-limiting-route")
      .process(exchange -> {
        // Get the rate limit and API URL from the incoming request
        int rateLimit = exchange.getIn().getHeader("rateLimit", Integer.class);
        String apiUrl = exchange.getIn().getHeader("apiUrl", String.class);
        exchange.getIn().setBody(null);  // Clear the body if needed
        exchange.getIn().setHeader("CamelHttpUri", apiUrl); // Set the third-party API URL
      })
      .throttle(simple("${header.rateLimit}"))  // Apply the throttling dynamically
      .timePeriodMillis(60000) // Limit requests per minute (time period in milliseconds)
      .log("Sending request to third-party API: ${header.CamelHttpUri}")
      .toD("${header.CamelHttpUri}")  // Dynamic toD to use the provided API URL
      .log("Received response: ${body}");
  }
}
