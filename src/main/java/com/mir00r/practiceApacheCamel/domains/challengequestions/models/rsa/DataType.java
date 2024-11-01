
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for DataType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="DataType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="STRING"/&amp;gt;
 *     &amp;lt;enumeration value="BOOLEAN"/&amp;gt;
 *     &amp;lt;enumeration value="FLOAT"/&amp;gt;
 *     &amp;lt;enumeration value="DOUBLE"/&amp;gt;
 *     &amp;lt;enumeration value="INTEGER"/&amp;gt;
 *     &amp;lt;enumeration value="DATE"/&amp;gt;
 *     &amp;lt;enumeration value="IP"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "DataType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
public enum DataType {

    STRING,
    BOOLEAN,
    FLOAT,
    DOUBLE,
    INTEGER,
    DATE,
    IP;

    public String value() {
        return name();
    }

    public static DataType fromValue(String v) {
        return valueOf(v);
    }

}
