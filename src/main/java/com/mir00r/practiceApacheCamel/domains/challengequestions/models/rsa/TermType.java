
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for TermType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="TermType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="GOOD_FOR_DAY"/&amp;gt;
 *     &amp;lt;enumeration value="GOOD_UNTIL_CANCELLED"/&amp;gt;
 *     &amp;lt;enumeration value="IMMEDIATE_OR_CANCEL"/&amp;gt;
 *     &amp;lt;enumeration value="FILL_OR_KILL"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "TermType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
public enum TermType {

    GOOD_FOR_DAY,
    GOOD_UNTIL_CANCELLED,
    IMMEDIATE_OR_CANCEL,
    FILL_OR_KILL;

    public String value() {
        return name();
    }

    public static TermType fromValue(String v) {
        return valueOf(v);
    }

}
