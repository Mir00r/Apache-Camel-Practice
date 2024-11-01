
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for LoginFailureType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="LoginFailureType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="CARD_ON_BLACKLIST"/&amp;gt;
 *     &amp;lt;enumeration value="CARD_EXPIRED"/&amp;gt;
 *     &amp;lt;enumeration value="CARD_LOST"/&amp;gt;
 *     &amp;lt;enumeration value="CARD_NONEXISTENT"/&amp;gt;
 *     &amp;lt;enumeration value="INCORRECT_PIN"/&amp;gt;
 *     &amp;lt;enumeration value="INCORRECT_CVV"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "LoginFailureType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
public enum LoginFailureType {

    CARD_ON_BLACKLIST,
    CARD_EXPIRED,
    CARD_LOST,
    CARD_NONEXISTENT,
    INCORRECT_PIN,
    INCORRECT_CVV;

    public String value() {
        return name();
    }

    public static LoginFailureType fromValue(String v) {
        return valueOf(v);
    }

}
