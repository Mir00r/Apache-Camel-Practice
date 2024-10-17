package com.mir00r.practiceApacheCamel.domains.etlprocess.controllers;

import com.mir00r.practiceApacheCamel.domains.etlprocess.routes.EtlRoute;
import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EtlController {

  private final ProducerTemplate producerTemplate;

  @Autowired
  public EtlController(ProducerTemplate producerTemplate) {
    this.producerTemplate = producerTemplate;
  }

  @GetMapping("/v1/etl/start")
  public ResponseEntity<String> startEtlProcess() {
    try {
      // Trigger the ETL route
      this.producerTemplate.sendBody(EtlRoute.DIRECT_ETL_PROCESS, null);
      return ResponseEntity.ok("ETL process started successfully");
    } catch (Exception e) {
      // Handle the error case
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
        .body("Failed to start ETL process: " + e.getMessage());
    }
  }
}
