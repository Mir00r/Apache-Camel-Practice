package com.mir00r.practiceApacheCamel.domains.challengequestions.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChallengeQuesChallengePayload {

  private List<String> excludeQuesIdList;

  private Integer numberOfQuestion;
}
