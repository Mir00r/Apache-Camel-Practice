
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for AccountOwnershipType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="AccountOwnershipType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="INDIVIDUAL"/&amp;gt;
 *     &amp;lt;enumeration value="JOINT"/&amp;gt;
 *     &amp;lt;enumeration value="TRUST"/&amp;gt;
 *     &amp;lt;enumeration value="CUSTODIAL"/&amp;gt;
 *     &amp;lt;enumeration value="BUSINESS"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "AccountOwnershipType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
public enum AccountOwnershipType {

    INDIVIDUAL,
    JOINT,
    TRUST,
    CUSTODIAL,
    BUSINESS;

    public String value() {
        return name();
    }

    public static AccountOwnershipType fromValue(String v) {
        return valueOf(v);
    }

}
