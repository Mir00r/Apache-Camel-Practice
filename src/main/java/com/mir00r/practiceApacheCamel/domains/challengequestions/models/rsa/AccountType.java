
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for AccountType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="AccountType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="CREDIT_CARD"/&amp;gt;
 *     &amp;lt;enumeration value="DEBIT_CARD"/&amp;gt;
 *     &amp;lt;enumeration value="CHECKING"/&amp;gt;
 *     &amp;lt;enumeration value="CHECKING_WITH_OVERDRAFT"/&amp;gt;
 *     &amp;lt;enumeration value="BROKERAGE"/&amp;gt;
 *     &amp;lt;enumeration value="SAVINGS"/&amp;gt;
 *     &amp;lt;enumeration value="CD"/&amp;gt;
 *     &amp;lt;enumeration value="LINE_OF_CREDIT"/&amp;gt;
 *     &amp;lt;enumeration value="RETIREMENT"/&amp;gt;
 *     &amp;lt;enumeration value="MORTGAGE"/&amp;gt;
 *     &amp;lt;enumeration value="USER_DEFINED"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "AccountType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
public enum AccountType {

    CREDIT_CARD,
    DEBIT_CARD,
    CHECKING,
    CHECKING_WITH_OVERDRAFT,
    BROKERAGE,
    SAVINGS,
    CD,
    LINE_OF_CREDIT,
    RETIREMENT,
    MORTGAGE,
    USER_DEFINED;

    public String value() {
        return name();
    }

    public static AccountType fromValue(String v) {
        return valueOf(v);
    }

}
