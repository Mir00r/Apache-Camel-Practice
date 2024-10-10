package com.mir00r.practiceApacheCamel.domains.ratelimiting.controllers;

import com.mir00r.practiceApacheCamel.domains.ratelimiting.routes.ApiRateLimitingRoute;
import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class ApiRateLimitingController {

  @Autowired
  private ProducerTemplate producerTemplate;

  @PostMapping("/v1/throttle")
  public String throttleApiRequest(@RequestParam int rateLimit, @RequestParam String apiUrl) {

    // Sending the rate limit and API URL to the Camel route
    String response =
      producerTemplate.requestBodyAndHeaders(ApiRateLimitingRoute.DIRECT_RATE_LIMITING, null,
        Map.of("rateLimit", rateLimit, "apiUrl", apiUrl),
        String.class);
    return "Third Party API Response: " + response;
  }
}
