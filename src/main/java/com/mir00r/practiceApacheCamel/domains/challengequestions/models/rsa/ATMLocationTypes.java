
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ATMLocationTypes.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="ATMLocationTypes"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="BANK_BRANCH"/&amp;gt;
 *     &amp;lt;enumeration value="PETROL_STATION"/&amp;gt;
 *     &amp;lt;enumeration value="PUBLIC_TRANSPORT"/&amp;gt;
 *     &amp;lt;enumeration value="STREET"/&amp;gt;
 *     &amp;lt;enumeration value="CONVENIENCE_STORE"/&amp;gt;
 *     &amp;lt;enumeration value="SUPERMARKET"/&amp;gt;
 *     &amp;lt;enumeration value="LEISURE_FACILITY"/&amp;gt;
 *     &amp;lt;enumeration value="DRIVE_THRU"/&amp;gt;
 *     &amp;lt;enumeration value="ENTERTAINMENT_VENUE"/&amp;gt;
 *     &amp;lt;enumeration value="TRANSPORT_TERMINAL"/&amp;gt;
 *     &amp;lt;enumeration value="POST_OFFICE"/&amp;gt;
 *     &amp;lt;enumeration value="RETAIL_OUTLET"/&amp;gt;
 *     &amp;lt;enumeration value="CASINO"/&amp;gt;
 *     &amp;lt;enumeration value="GOVERNMENT_OFFICE"/&amp;gt;
 *     &amp;lt;enumeration value="OTHER"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "ATMLocationTypes")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
public enum ATMLocationTypes {

    BANK_BRANCH,
    PETROL_STATION,
    PUBLIC_TRANSPORT,
    STREET,
    CONVENIENCE_STORE,
    SUPERMARKET,
    LEISURE_FACILITY,
    DRIVE_THRU,
    ENTERTAINMENT_VENUE,
    TRANSPORT_TERMINAL,
    POST_OFFICE,
    RETAIL_OUTLET,
    CASINO,
    GOVERNMENT_OFFICE,
    OTHER;

    public String value() {
        return name();
    }

    public static ATMLocationTypes fromValue(String v) {
        return valueOf(v);
    }

}
