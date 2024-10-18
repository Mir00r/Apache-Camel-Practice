package com.mir00r.practiceApacheCamel.domains.thirdpartyinteg.controllers;

import com.mir00r.practiceApacheCamel.domains.thirdpartyinteg.routes.ApiGatewayRoute;
import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiGatewayController {

  private final ProducerTemplate producerTemplate;

  @Autowired
  public ApiGatewayController(ProducerTemplate producerTemplate) {
    this.producerTemplate = producerTemplate;
  }

  @GetMapping("/v1/third-party/process-request")
  public String processRequest() {
    // Trigger the Camel route
    return this.producerTemplate.requestBody(ApiGatewayRoute.DIRECT_THIRD_PARTY_API_PROCESS, null,
      String.class);
  }
}
