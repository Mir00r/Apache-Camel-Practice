
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import lombok.Data;


@Data
public class ChallengeQuestionChallengeRequestPayload {

  protected ChallengeQuestionIdList excludeQuestions;
  protected Integer numberOfQuestion;
}
