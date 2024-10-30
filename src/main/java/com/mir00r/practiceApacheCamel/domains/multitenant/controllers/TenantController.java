package com.mir00r.practiceApacheCamel.domains.multitenant.controllers;

import com.mir00r.practiceApacheCamel.domains.multitenant.routes.MultiTenantRoute;
import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class TenantController {

  private final ProducerTemplate producerTemplate;

  @Autowired
  public TenantController(ProducerTemplate producerTemplate) {
    this.producerTemplate = producerTemplate;
  }


  @GetMapping("/v1/throttle/{tenantId}/{resource}")
  public String throttleGet(@PathVariable int tenantId, @PathVariable String resource) {

    String response =
      this.producerTemplate.requestBodyAndHeaders(MultiTenantRoute.DIRECT_THROTTLE_GET_WITH_TENANT_ID,
        null,
        Map.of("tenantId", tenantId, "resource", resource),
        String.class);
    return "Third Party API Response: " + response;
  }

  @PostMapping("/v1/throttle/{tenantId}/{resource}")
  public String throttlePost(@PathVariable int tenantId, @PathVariable String resource) {

    String response =
      this.producerTemplate.requestBodyAndHeaders(MultiTenantRoute.DIRECT_THROTTLE_POST_WITH_TENANT_ID,
        null,
        Map.of("tenantId", tenantId, "resource", resource),
        String.class);
    return "Third Party API Response: " + response;
  }
}
