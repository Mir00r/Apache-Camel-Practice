package com.mir00r.practiceApacheCamel.domains.era.controllers;

import com.mir00r.practiceApacheCamel.domains.era.models.Order;
import com.mir00r.practiceApacheCamel.domains.era.services.OrderProcessingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class OrderController {

  private final OrderProcessingService orderProcessingService;

  @Autowired
  public OrderController(OrderProcessingService orderProcessingService) {
    this.orderProcessingService = orderProcessingService;
  }

  @PostMapping("/v1/orders/submit")
  public ResponseEntity<String> submitOrder(@RequestBody Order order) {
    this.orderProcessingService.processOrder(order);
    return ResponseEntity.ok("Order submitted successfully");
  }
}
