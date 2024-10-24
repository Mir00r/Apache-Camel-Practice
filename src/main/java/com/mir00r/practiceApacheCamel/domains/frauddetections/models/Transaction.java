package com.mir00r.practiceApacheCamel.domains.frauddetections.models;

import com.mir00r.practiceApacheCamel.domains.frauddetections.enums.Channels;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class Transaction {

  private Long id;
  private String accountId;
  private String transactionType;
  private BigDecimal amount;
  private String currency;
  private String merchantId;
  private String location;
  private LocalDateTime timestamp;
  private Channels channel; // ATM, ONLINE, POS


}
