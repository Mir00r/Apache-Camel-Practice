package com.mir00r.practiceApacheCamel.domains.challengequestions.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChallengeQRq implements Serializable {

  @Serial
  private static final long serialVersionUID = 1L;

  private transient ChallengeQuesChallengePayload cqPayload;
}
