
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import lombok.Data;

@Data
public class ChallengeQuestionChallengePayload {

    protected CallStatus callStatus;
    
    protected ChallengeQuestionList challengeQuestions;
}
