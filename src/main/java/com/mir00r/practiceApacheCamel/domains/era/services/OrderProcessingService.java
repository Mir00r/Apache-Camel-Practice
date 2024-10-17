package com.mir00r.practiceApacheCamel.domains.era.services;

import com.mir00r.practiceApacheCamel.domains.era.models.Order;
import com.mir00r.practiceApacheCamel.domains.era.routes.ERARouteConfig;
import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderProcessingService {

  private final ProducerTemplate producerTemplate;

  @Autowired
  public OrderProcessingService(ProducerTemplate producerTemplate) {
    this.producerTemplate = producerTemplate;
  }

  public void processOrder(Order order) {
    // Send the order to the direct:start route
    this.producerTemplate.sendBody(ERARouteConfig.DIRECT_ERA_START, order);
  }
}
