package com.mir00r.practiceApacheCamel.domains.frauddetections.models;

import com.mir00r.practiceApacheCamel.domains.frauddetections.enums.FraudStatus;
import com.mir00r.practiceApacheCamel.domains.frauddetections.enums.RiskLevels;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class FraudAlert {

  private Long id;
  private Long transactionId;
  private RiskLevels riskLevel; // HIGH, MEDIUM, LOW
  private String reason;
  private LocalDateTime detectionTime;
  private FraudStatus status; // PENDING, INVESTIGATED, CLOSED
}
