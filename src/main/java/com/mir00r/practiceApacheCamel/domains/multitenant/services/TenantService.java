package com.mir00r.practiceApacheCamel.domains.multitenant.services;

import com.mir00r.practiceApacheCamel.domains.multitenant.models.Tenant;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;

@Service
public class TenantService {

  public Optional<Tenant> findByApiKey(String apiKey, Map<String, Optional<Tenant>> tenantMap) {
    return tenantMap.get(apiKey);
  }

  public Optional<Tenant> findByTenantId(String tenantId, Map<String, Optional<Tenant>> tenantMap) {
    return tenantMap.get(tenantId);
  }
}
