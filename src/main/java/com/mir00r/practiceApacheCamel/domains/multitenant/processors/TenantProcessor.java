package com.mir00r.practiceApacheCamel.domains.multitenant.processors;

import com.mir00r.practiceApacheCamel.domains.multitenant.services.TenantService;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.LinkedHashMap;

@Component
public class TenantProcessor implements Processor {

  private final TenantService tenantService;

  @Autowired
  public TenantProcessor(TenantService tenantService) {this.tenantService = tenantService;}

  @Override
  public void process(Exchange exchange) {
    String tenantId = exchange.getIn().getHeader("tenantId", String.class);

    this.tenantService.findByTenantId(tenantId, new LinkedHashMap<>()).ifPresent(tenant -> {
      exchange.setProperty("tenant", tenant);
      exchange.setProperty("rateLimit", tenant.getRateLimit());
      exchange.setProperty("backendUrl", tenant.getBackendUrl());
    });
  }
}
