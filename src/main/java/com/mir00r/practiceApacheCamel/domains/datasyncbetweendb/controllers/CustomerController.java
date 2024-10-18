package com.mir00r.practiceApacheCamel.domains.datasyncbetweendb.controllers;

import com.mir00r.practiceApacheCamel.domains.datasyncbetweendb.routes.DatabaseSyncRoute;
import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CustomerController {

  private final ProducerTemplate producerTemplate;

  @Autowired
  public CustomerController(ProducerTemplate producerTemplate) {
    this.producerTemplate = producerTemplate;
  }

  // For adding/updating customers in MySQL and triggering MongoDB sync
  @PostMapping("/v1/customers/sync/mysql")
  public String syncFromMySQL(@RequestParam("lastPollTime") String lastPollTime) {
    this.producerTemplate.sendBodyAndHeader(DatabaseSyncRoute.DIRECT_MYSQL_TO_MONGODB, null,
      "lastPollTime",
      lastPollTime);
    return "Synchronization from MySQL to MongoDB triggered.";
  }

  // For adding/updating customers in MongoDB and triggering MySQL sync
  @PostMapping("/v1/customers/sync/mongodb")
  public String syncFromMongoDB() {
    this.producerTemplate.sendBody(DatabaseSyncRoute.DIRECT_MONGODB_TO_MYSQL, null);
    return "Synchronization from MongoDB to MySQL triggered.";
  }
}
