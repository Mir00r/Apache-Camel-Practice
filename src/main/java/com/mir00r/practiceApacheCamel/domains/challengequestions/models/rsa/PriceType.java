
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for PriceType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="PriceType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="MARKET"/&amp;gt;
 *     &amp;lt;enumeration value="BRACKETED_FIXED"/&amp;gt;
 *     &amp;lt;enumeration value="BRACKETED_POINTS"/&amp;gt;
 *     &amp;lt;enumeration value="BRACKETED_PERCENTAGES"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "PriceType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
public enum PriceType {

    MARKET,
    BRACKETED_FIXED,
    BRACKETED_POINTS,
    BRACKETED_PERCENTAGES;

    public String value() {
        return name();
    }

    public static PriceType fromValue(String v) {
        return valueOf(v);
    }

}
