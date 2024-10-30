package com.mir00r.practiceApacheCamel.domains.multitenant.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

@Component
public class JwtValidationProcessor implements Processor {

  @Override
  public void process(Exchange exchange) throws Exception {
    String token = exchange.getIn().getHeader("Authorization", String.class);
    if (token == null || !token.startsWith("Bearer ")) {
      throw new RuntimeException("Invalid JWT token");
    }
    // Implement JWT validation logic here
  }
}
