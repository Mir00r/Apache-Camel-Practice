
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

public enum ChallengeQuestionActionType {

    ADD_USER_QUESTION,
    BROWSE_QUESTION,
    GET_USER_QUESTION,
    SET_USER_QUESTION;

    public String value() {
        return name();
    }

    public static ChallengeQuestionActionType fromValue(String v) {
        return valueOf(v);
    }

}
