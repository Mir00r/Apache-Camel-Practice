package com.mir00r.practiceApacheCamel.domains.mqinteg.controllers;

import com.mir00r.practiceApacheCamel.domains.mqinteg.models.ProductRequest;
import com.mir00r.practiceApacheCamel.domains.mqinteg.routes.ProductRequestRoute;
import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProductController {

  private final ProducerTemplate producerTemplate;

  @Autowired
  public ProductController(ProducerTemplate producerTemplate) {
    this.producerTemplate = producerTemplate;
  }

  // API to create an order and send it to the queue
  @PostMapping("/v1/products/req")
  public ResponseEntity<String> createOrder(@RequestBody ProductRequest productRequest) {
    // Sending message to RabbitMQ via Camel route
    this.producerTemplate.sendBody(ProductRequestRoute.DIRECT_SEND_TO_MQ, productRequest);

    return ResponseEntity.ok("Product request placed successfully and sent to the queue.");
  }
}
