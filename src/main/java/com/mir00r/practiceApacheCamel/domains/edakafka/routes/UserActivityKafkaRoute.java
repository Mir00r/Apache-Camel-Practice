package com.mir00r.practiceApacheCamel.domains.edakafka.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
//public class UserActivityKafkaRoute extends RouteBuilder {
//
//  @Value("${spring.kafka.consumer.group-id}")
//  private static String groupId;
//
//  @Value("${camel.component.kafka.brokers}")
//  private static String brokerUrl;
//
//  public static final String USER_SIGNUP_KAFKA_TOPIC = "kafka:topic-user-signup";
//  public static final String USER_SIGNUP_KAFKA_TOPIC_WITH_BROKERS =
//    String.format("%s?brokers=%s", USER_SIGNUP_KAFKA_TOPIC, brokerUrl);
//  public static final String USER_SIGNUP_KAFKA_TOPIC_WITH_BROKERS_WITH_GROUP_ID =
//    String.format("%s&groupId=%s", USER_SIGNUP_KAFKA_TOPIC_WITH_BROKERS, groupId);
//
//  public static final String USER_SEARCH_KAFKA_TOPIC = "kafka:topic-user-search";
//  public static final String USER_SEARCH_KAFKA_TOPIC_WITH_BROKERS =
//    String.format("%s?brokers=%s", USER_SEARCH_KAFKA_TOPIC, brokerUrl);
//  public static final String USER_SEARCH_KAFKA_TOPIC_WITH_BROKERS_WITH_GROUP_ID =
//    String.format("%s&groupId=%s", USER_SEARCH_KAFKA_TOPIC_WITH_BROKERS, groupId);
//
//  @Override
//  public void configure() throws Exception {
//    // Route for consuming user sign-up events from Kafka and triggering further processing
//    from(USER_SIGNUP_KAFKA_TOPIC_WITH_BROKERS_WITH_GROUP_ID)
//      .log("Received user sign-up event: ${body}")
//      .process(exchange -> {
//        // Custom logic for processing sign-up events, e.g., sending a welcome email
//        String userSignupData = exchange.getIn().getBody(String.class);
//        System.out.println("Processing sign-up event: " + userSignupData);
//      });
//
//    // Route for consuming user search events from Kafka
//    from(USER_SEARCH_KAFKA_TOPIC_WITH_BROKERS_WITH_GROUP_ID)
//      .log("Received user search event: ${body}")
//      .process(exchange -> {
//        // Custom logic for processing search events
//        String userSearchData = exchange.getIn().getBody(String.class);
//        System.out.println("Processing search event: " + userSearchData);
//      });
//  }
//}
