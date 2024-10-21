package com.mir00r.practiceApacheCamel.domains.mqinteg.routes;

import com.mir00r.practiceApacheCamel.domains.mqinteg.processors.ProductProcessor;
import com.mir00r.practiceApacheCamel.domains.mqinteg.processors.ProductRequestProcessor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductRequestRoute extends RouteBuilder {

  public static final String DIRECT_SEND_TO_MQ = "direct:sendToRabbit";

  private final ProductRequestProcessor productRequestProcessor;

  @Autowired
  public ProductRequestRoute(ProductRequestProcessor productRequestProcessor) {
    this.productRequestProcessor = productRequestProcessor;
  }

  @Override
  public void configure() throws Exception {
    String queueUriFormat = "spring-rabbitmq:productsExchange?routingKey=productKey";

    // Error handler: Send failed messages to the dead letter queue (DLQ)
    errorHandler(deadLetterChannel("spring-rabbitmq:deadLetterExchange?routingKey=dlq")
      .maximumRedeliveries(5)
      .redeliveryDelay(1000)
      .retryAttemptedLogLevel(org.apache.camel.LoggingLevel.WARN));

    // Route to send messages to RabbitMQ using spring-rabbitmq component
    from(DIRECT_SEND_TO_MQ)
      .routeId("send-to-rabbit-route")
      // Serialize ProductRequest to JSON
      .process(this.productRequestProcessor)
      .log("Sending message to RabbitMQ: ${body}")
      .to(queueUriFormat);

    // Route to consume messages from RabbitMQ using spring-rabbitmq component
    from(queueUriFormat)
      .routeId("receive-from-rabbit-route")
      .log("Received message from RabbitMQ: ${body}")
      // Further processing of the message
      .bean(ProductProcessor.class, "processProduct");

    // Dead Letter Queue handler route
    from("spring-rabbitmq:deadLetterExchange?routingKey=dlq")
      .routeId("dlq-handler-route")
      .log("Message received in Dead Letter Queue: ${body}")
      .to("log:dlq");
  }
}
