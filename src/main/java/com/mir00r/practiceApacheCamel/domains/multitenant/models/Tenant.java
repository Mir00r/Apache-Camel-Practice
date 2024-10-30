package com.mir00r.practiceApacheCamel.domains.multitenant.models;

import lombok.Data;

@Data
public class Tenant {

  private Long id;
  private String tenantId;
  private String name;
  private String apiKey;
  private Integer rateLimit;
  private String backendUrl;
  private Boolean requiresJwt;
  private String jwtSecret;
}
