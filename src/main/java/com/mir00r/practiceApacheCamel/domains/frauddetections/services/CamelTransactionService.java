package com.mir00r.practiceApacheCamel.domains.frauddetections.services;

import com.mir00r.practiceApacheCamel.domains.frauddetections.models.Transaction;
import com.mir00r.practiceApacheCamel.domains.frauddetections.routes.TransactionRoute;
import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CamelTransactionService {

  private final ProducerTemplate producerTemplate;

  @Autowired
  public CamelTransactionService(ProducerTemplate producerTemplate) {
    this.producerTemplate = producerTemplate;
  }

  public void processTransactionSync(Transaction transaction) {
    // Synchronous processing using direct endpoint
    producerTemplate.sendBody(TransactionRoute.DIRECT_PROCESS_TRANSACTION, transaction);
  }

  public void processTransactionAsync(Transaction transaction) {
    // Asynchronous processing using SEDA endpoint
    producerTemplate.sendBody(TransactionRoute.DIRECT_ASYNC_TRANSACTION, transaction);
  }

  public void sendToKafka(Transaction transaction) {
    // Send to Kafka topic
    producerTemplate.sendBody(TransactionRoute.DIRECT_KAFKA_TRANSACTION, transaction);
  }
}
