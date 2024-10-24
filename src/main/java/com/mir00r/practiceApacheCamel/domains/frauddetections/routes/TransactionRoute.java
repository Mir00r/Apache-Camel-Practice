package com.mir00r.practiceApacheCamel.domains.frauddetections.routes;

import com.mir00r.practiceApacheCamel.domains.frauddetections.models.Transaction;
import com.mir00r.practiceApacheCamel.domains.frauddetections.processors.TransactionProcessor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TransactionRoute extends RouteBuilder {

  public static final String DIRECT_PROCESS_TRANSACTION = "direct:processTransaction";
  public static final String DIRECT_ASYNC_TRANSACTION = "seda:asyncTransaction";
  public static final String DIRECT_KAFKA_TRANSACTION = "kafka:transactions";
  private final TransactionProcessor transactionProcessor;

  @Autowired
  public TransactionRoute(TransactionProcessor transactionProcessor) {
    this.transactionProcessor = transactionProcessor;
  }

  @Override
  public void configure() throws Exception {

    // Direct endpoint for synchronous calls
    from(DIRECT_PROCESS_TRANSACTION)
      .routeId("direct-transaction-processing")
      .log("Processing transaction via direct endpoint: ${body}")
      .process(this.transactionProcessor)
      .to("direct:notification");

    // Seda endpoint for asynchronous calls
    from(DIRECT_ASYNC_TRANSACTION)
      .routeId("async-transaction-processing")
      .log("Processing transaction via SEDA endpoint: ${body}")
      .process(this.transactionProcessor)
      .to("direct:notification");

    // Kafka consumer route
    from(DIRECT_KAFKA_TRANSACTION)
      .routeId("kafka-transaction-processing")
      .unmarshal().json(JsonLibrary.Jackson, Transaction.class)
      .log("Processing transaction from Kafka: ${body}")
      .process(this.transactionProcessor)
      .to("direct:notification");

    // REST endpoint route
    rest("/api/v1/transactions")
      .post()
      .type(Transaction.class)
//      .route()
      .routeId("rest-transaction-processing")
//      .log("Processing transaction via REST: ${body}")
//      .process(this.transactionProcessor)
      .to("direct:notification")
      ;

    // Notification route
    from("direct:notification")
      .routeId("notification")
      .choice()
      .when(header("fraudDetected").isEqualTo(true))
      .to("kafka:fraud-alerts")
      .otherwise()
      .to("kafka:processed-transactions");
  }

  private void processConfig1() {
    // Error handling
    errorHandler(deadLetterChannel("direct:error")
      .maximumRedeliveries(3)
      .redeliveryDelay(1000)
      .backOffMultiplier(2)
      .useExponentialBackOff());

    // Main transaction processing route
    from("kafka:transactions")
      .routeId("transaction-processing")
      .unmarshal().json(JsonLibrary.Jackson, Transaction.class)
      .log("Processing transaction: ${body}")
      .process(this.transactionProcessor)
      .to("direct:notification");

    // Error handling route
    from("direct:error")
      .routeId("error-handling")
      .log("Error processing transaction: ${exception.message}")
      .to("kafka:failed-transactions");

    // Notification route
    from("direct:notification")
      .routeId("notification")
      .choice()
      .when(header("fraudDetected").isEqualTo(true))
      .to("kafka:fraud-alerts")
      .otherwise()
      .to("kafka:processed-transactions");
  }
}
