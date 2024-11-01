
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for TradeType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="TradeType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="BUY"/&amp;gt;
 *     &amp;lt;enumeration value="SELL"/&amp;gt;
 *     &amp;lt;enumeration value="SELL_SHORT"/&amp;gt;
 *     &amp;lt;enumeration value="BUY_TO_COVER"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "TradeType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
public enum TradeType {

    BUY,
    SELL,
    SELL_SHORT,
    BUY_TO_COVER;

    public String value() {
        return name();
    }

    public static TradeType fromValue(String v) {
        return valueOf(v);
    }

}
