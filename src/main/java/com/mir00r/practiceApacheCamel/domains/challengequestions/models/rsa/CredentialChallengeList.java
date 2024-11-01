
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import lombok.Data;

@Data
public class CredentialChallengeList
    extends CredentialResponseList
{
    protected ChallengeQuestionChallenge challengeQuestionChallenge;

}
