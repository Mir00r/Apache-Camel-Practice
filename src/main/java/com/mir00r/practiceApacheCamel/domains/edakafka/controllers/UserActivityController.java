package com.mir00r.practiceApacheCamel.domains.edakafka.controllers;

import com.mir00r.practiceApacheCamel.domains.edakafka.models.UserSearchRequest;
import com.mir00r.practiceApacheCamel.domains.edakafka.models.UserSignUpRequest;
//import com.mir00r.practiceApacheCamel.domains.edakafka.routes.UserActivityKafkaRoute;
import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserActivityController {

  private final ProducerTemplate producerTemplate;

  @Autowired
  public UserActivityController(ProducerTemplate producerTemplate) {
    this.producerTemplate = producerTemplate;
  }

  @PostMapping("/v1/users/signup")
  public ResponseEntity<String> signUpUser(@RequestBody UserSignUpRequest request) {
    // Publish the user signup event to the Kafka topic
    this.producerTemplate.sendBody("UserActivityKafkaRoute.USER_SIGNUP_KAFKA_TOPIC_WITH_BROKERS",
      request);
    return ResponseEntity.ok("User sign-up event published successfully!");
  }

  @PostMapping("/v1/users/search")
  public ResponseEntity<String> userSearch(@RequestBody UserSearchRequest request) {
    // Publish the user search event to the Kafka topic
    this.producerTemplate.sendBody("UserActivityKafkaRoute.USER_SEARCH_KAFKA_TOPIC_WITH_BROKERS",
      request);
    return ResponseEntity.ok("User search event published successfully!");
  }
}
