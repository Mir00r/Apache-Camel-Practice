package com.mir00r.practiceApacheCamel.domains.frauddetections.controllers;

import com.mir00r.practiceApacheCamel.domains.frauddetections.models.Transaction;
import com.mir00r.practiceApacheCamel.domains.frauddetections.services.CamelTransactionService;
import com.mir00r.practiceApacheCamel.domains.frauddetections.services.FraudDetectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TransactionController {

  private final FraudDetectionService fraudDetectionService;
  private final CamelTransactionService camelTransactionService;

  @Autowired
  public TransactionController(FraudDetectionService fraudDetectionService,
    CamelTransactionService camelTransactionService) {
    this.fraudDetectionService = fraudDetectionService;
    this.camelTransactionService = camelTransactionService;
  }

  @PostMapping("/v1/transactions")
  public ResponseEntity<Void> processTransaction(@RequestBody Transaction transaction) {
    this.fraudDetectionService.analyzeTransaction(transaction);
    return ResponseEntity.ok().build();
  }

  @PostMapping("/v1/transactions/sync")
  public ResponseEntity<String> processTransactionSync(@RequestBody Transaction transaction) {
    this.camelTransactionService.processTransactionSync(transaction);
    return ResponseEntity.ok("Transaction processed synchronously");
  }

  @PostMapping("/v1/transactions/async")
  public ResponseEntity<String> processTransactionAsync(@RequestBody Transaction transaction) {
    this.camelTransactionService.processTransactionAsync(transaction);
    return ResponseEntity.ok("Transaction submitted for async processing");
  }

  @PostMapping("/v1/transactions/kafka")
  public ResponseEntity<String> sendToKafka(@RequestBody Transaction transaction) {
    this.camelTransactionService.sendToKafka(transaction);
    return ResponseEntity.ok("Transaction sent to Kafka");
  }
}
