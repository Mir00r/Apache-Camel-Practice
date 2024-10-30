package com.mir00r.practiceApacheCamel.domains.multitenant.routes;

import com.mir00r.practiceApacheCamel.domains.multitenant.processors.JwtValidationProcessor;
import com.mir00r.practiceApacheCamel.domains.multitenant.processors.TenantProcessor;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MultiTenantRoute extends RouteBuilder {

  public static final String DIRECT_THROTTLE_POST_WITH_TENANT_ID = "direct:startTenantPost";
  public static final String DIRECT_THROTTLE_GET_WITH_TENANT_ID = "direct:startTenantGet";
  private final TenantProcessor tenantProcessor;
  private final JwtValidationProcessor jwtValidationProcessor;

  @Autowired
  public MultiTenantRoute(TenantProcessor tenantProcessor,
    JwtValidationProcessor jwtValidationProcessor) {this.tenantProcessor = tenantProcessor;
    this.jwtValidationProcessor = jwtValidationProcessor;
  }

  @Override
  public void configure() throws Exception {
    // Error handling
    onException(Exception.class)
      .handled(true)
      .setHeader(Exchange.HTTP_RESPONSE_CODE, constant(500))
      .setBody(simple("${exception.message}"));

    // REST configuration
    restConfiguration()
      .component("servlet")
      .bindingMode(RestBindingMode.json)
      .dataFormatProperty("prettyPrint", "true");

    // Main API GET route
    from(DIRECT_THROTTLE_GET_WITH_TENANT_ID)
      .routeId("api-gateway-get-route")
      // Process tenant information
      .process(this.tenantProcessor)
      // Rate limiting
      .throttle(simple("${exchangeProperty.rateLimit}"))
      .timePeriodMillis(60000)
      // JWT validation if required
      .choice()
      .when(simple("${exchangeProperty.tenant.requiresJwt} == true"))
      .to("direct:validateJwt")
      .end()
      // Forward to backend service
      .toD("${exchangeProperty.backendUrl}/${header.resource}");

    // Main API POST route
    from(DIRECT_THROTTLE_POST_WITH_TENANT_ID)
      .routeId("api-gateway-post-route")
      .process(this.tenantProcessor)
      .throttle(simple("${exchangeProperty.rateLimit}"))
      .timePeriodMillis(60000)
      .choice()
      .when(simple("${exchangeProperty.tenant.requiresJwt} == true"))
      .to("direct:validateJwt")
      .end()
      .toD("${exchangeProperty.backendUrl}/${header.resource}");


    // JWT validation route
    from("direct:validateJwt")
      .routeId("jwt-validation-route")
      .process(this.jwtValidationProcessor);
  }
}
