package com.mir00r.practiceApacheCamel.domains.frauddetections.services;

import com.mir00r.practiceApacheCamel.domains.frauddetections.enums.FraudStatus;
import com.mir00r.practiceApacheCamel.domains.frauddetections.enums.RiskLevels;
import com.mir00r.practiceApacheCamel.domains.frauddetections.models.FraudAlert;
import com.mir00r.practiceApacheCamel.domains.frauddetections.models.Transaction;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class FraudDetectionService {

  private static final BigDecimal HIGH_AMOUNT_THRESHOLD = new BigDecimal("1000");
  private static final BigDecimal SUSPICIOUS_AMOUNT_THRESHOLD = new BigDecimal("5000");

  List<FraudAlert> fraudAlertList = new ArrayList<>();
  List<Transaction> transactionList = new ArrayList<>();

  public void analyzeTransaction(Transaction transaction) {
    // Store transaction
    //    transactionRepository.save(transaction);
    transactionList.add(transaction);
    System.out.println(transaction.toString());

    // Perform various fraud detection rules
    if (isHighValueTransaction(transaction)) {
      createFraudAlert(transaction, RiskLevels.HIGH, "High value transaction detected");
    }

    if (isFrequentTransaction(transaction)) {
      createFraudAlert(transaction, RiskLevels.MEDIUM,
        "Multiple transactions in short time period");
    }

    if (isUnusualLocation(transaction)) {
      createFraudAlert(transaction, RiskLevels.HIGH, "Unusual transaction location");
    }
  }

  private boolean isHighValueTransaction(Transaction transaction) {
    return transaction.getAmount().compareTo(HIGH_AMOUNT_THRESHOLD) > 0;
  }

  private boolean isFrequentTransaction(Transaction transaction) {
    LocalDateTime oneHourAgo = transaction.getTimestamp().minusHours(1);
    List<Transaction> recentTransactions = transactionList.stream()
      .filter(trx -> trx.getAccountId().equals(transaction.getAccountId()) &&
        trx.getTimestamp().isAfter(oneHourAgo) &&
        trx.getTimestamp().isBefore(transaction.getTimestamp()))
      .toList();

    //      transactionRepository
    //      .findByAccountIdAndTimestampBetween(
    //        transaction.getAccountId(),
    //        oneHourAgo,
    //        transaction.getTimestamp()
    //      );
    return recentTransactions.size() >= 5;
  }

  private boolean isUnusualLocation(Transaction transaction) {
    // Implement location-based fraud detection logic
    // This could involve checking if the location is different from usual patterns
    return false; // Placeholder implementation
  }

  private void createFraudAlert(Transaction transaction, RiskLevels riskLevel, String reason) {
    FraudAlert alert = new FraudAlert();
    alert.setTransactionId(transaction.getId());
    alert.setRiskLevel(riskLevel);
    alert.setReason(reason);
    alert.setDetectionTime(LocalDateTime.now());
    alert.setStatus(FraudStatus.PENDING);

    //    fraudAlertRepository.save(alert);
    this.fraudAlertList.add(alert);
    System.out.printf("Creating Fraud Alert! Reason: %s, Risk Level: %s, Transactions: %s%n", reason, riskLevel, transaction);
  }
}
