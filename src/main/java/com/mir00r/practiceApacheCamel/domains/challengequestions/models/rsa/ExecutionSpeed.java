
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ExecutionSpeed.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="ExecutionSpeed"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="SEVERAL_DAYS"/&amp;gt;
 *     &amp;lt;enumeration value="OVER_NIGHT"/&amp;gt;
 *     &amp;lt;enumeration value="FEW_HOURS"/&amp;gt;
 *     &amp;lt;enumeration value="REAL_TIME"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "ExecutionSpeed")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
public enum ExecutionSpeed {

    SEVERAL_DAYS,
    OVER_NIGHT,
    FEW_HOURS,
    REAL_TIME;

    public String value() {
        return name();
    }

    public static ExecutionSpeed fromValue(String v) {
        return valueOf(v);
    }

}
