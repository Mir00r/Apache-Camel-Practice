package com.mir00r.practiceApacheCamel.domains.era.routes;

import com.mir00r.practiceApacheCamel.domains.era.aggregations.OrderAggregationStrategy;
import com.mir00r.practiceApacheCamel.domains.era.processors.OrderProcessor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ERARouteConfig extends RouteBuilder {

  public static final String DIRECT_ERA_START = "direct:eraStart";

  private final OrderProcessor orderProcessor;

  @Autowired
  public ERARouteConfig(OrderProcessor orderProcessor) {this.orderProcessor = orderProcessor;}

  @Override
  public void configure() throws Exception {

    // REST Order Route
    from(DIRECT_ERA_START)
      .routeId("rest-order-route")
      .log("Received order from REST API: ${body}")
      .process(this.orderProcessor)
      .to("direct:processOrder");

    // FTP Order Route (Example, you'd use proper FTP URI)
//    from("ftp://yourFtpServer?username=user&password=pass&noop=true")
//      .routeId("ftp-order-route")
//      .log("Received order from FTP: ${body}")
//      .process(this.orderProcessor)
//      .to("direct:processOrder");

    // Email Order Route (Example using IMAP)
//    from("imaps://mail.example.com?username=user@example.com&password=pass&delete=false")
//      .routeId("email-order-route")
//      .log("Received order from Email: ${body}")
//      .process(this.orderProcessor)
//      .to("direct:processOrder");

    // Process and aggregate orders to the order-processing system
    from("direct:processOrder")
      .routeId("order-processing-route")
      .aggregate(constant(true), new OrderAggregationStrategy()) // Aggregation strategy define
      .completionSize(3)  // Aggregate every 3 orders
      .log("Aggregated Order: ${body}")
      .to("log:orderProcessed"); // Replace this with a real order processing system
  }
}
