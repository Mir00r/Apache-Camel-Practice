
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import lombok.Data;

@Data
public class ChallengeQuestion {

    protected String actualAnswer;
    
    protected String actualAnswerOnFile;
    
    protected String questionId;
    
    protected String questionText;
    
    protected String userAnswer;

}
