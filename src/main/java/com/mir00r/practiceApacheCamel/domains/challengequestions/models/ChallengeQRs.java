package com.mir00r.practiceApacheCamel.domains.challengequestions.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChallengeQRs implements Serializable {

  @Serial
  private static final long serialVersionUID = 1L;

  private String questionId;

  private String questionText;

  private String userAnswer;

  private String status;
}
