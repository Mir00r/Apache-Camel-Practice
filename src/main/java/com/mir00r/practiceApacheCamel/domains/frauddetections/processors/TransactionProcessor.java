package com.mir00r.practiceApacheCamel.domains.frauddetections.processors;

import com.mir00r.practiceApacheCamel.domains.frauddetections.models.Transaction;
import com.mir00r.practiceApacheCamel.domains.frauddetections.services.FraudDetectionService;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TransactionProcessor implements Processor {

  private final FraudDetectionService fraudDetectionService;

  @Autowired
  public TransactionProcessor(FraudDetectionService fraudDetectionService) {
    this.fraudDetectionService = fraudDetectionService;
  }

  @Override
  public void process(Exchange exchange) throws Exception {
    Transaction transaction = exchange.getIn().getBody(Transaction.class);
    this.fraudDetectionService.analyzeTransaction(transaction);
  }
}
