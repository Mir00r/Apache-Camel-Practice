package com.mir00r.practiceApacheCamel.domains.etlprocess.routes;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.stereotype.Component;

@Component
public class EtlRoute extends RouteBuilder {

  public final static String DIRECT_ETL_PROCESS = "direct:startEtlProcess";

  @Override
  public void configure() {

    // Error handling configuration
    errorHandler(deadLetterChannel("direct:errorQueue")
      .maximumRedeliveries(3)  // Retry 3 times before moving to error queue
      .redeliveryDelay(2000)   // Delay of 2 seconds between retries
      .retryAttemptedLogLevel(org.apache.camel.LoggingLevel.WARN)
      .useOriginalMessage()    // Keep the original message
    );

    // Define the ETL route
    from(DIRECT_ETL_PROCESS)
      .routeId("etlProcessRoute")
      .log("Starting ETL process...")

      // Step 1: Extract - Read from a database or file system
//      .to("jdbc:dataSource?useHeadersAsParameters=true")
//      .log("Data extracted from the source")

      // Extract - Read from a database (this will use the configured DataSource)
//      .to("jdbc:dataSource")  // dataSource should match the bean name in the context
      .log("Data extracted from the source")

      // Step 2: Transform - Convert data format (e.g., CSV to JSON)
      .marshal().json(JsonLibrary.Jackson)
      .log("Data transformed to JSON")

      // Step 3: Load - Write data to a destination (e.g., a file or another database)
      .to("file://{{output.directory}}?fileName=data-processed.json")
      .log("Data loaded to target destination")

      .end();

    // Route for handling errors
    from("direct:errorQueue")
      .routeId("errorHandlerRoute")
      .log("Error encountered: ${exception.message}")
      .log("Moving message to error queue for manual intervention")
      .to("file://{{error.directory}}?fileName=error-${date:now:yyyyMMddHHmmss}.json");
  }
}
