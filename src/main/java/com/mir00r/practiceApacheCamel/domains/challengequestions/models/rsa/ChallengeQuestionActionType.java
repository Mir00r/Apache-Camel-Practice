
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ChallengeQuestionActionType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="ChallengeQuestionActionType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="ADD_USER_QUESTION"/&amp;gt;
 *     &amp;lt;enumeration value="BROWSE_QUESTION"/&amp;gt;
 *     &amp;lt;enumeration value="GET_USER_QUESTION"/&amp;gt;
 *     &amp;lt;enumeration value="SET_USER_QUESTION"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "ChallengeQuestionActionType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
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
