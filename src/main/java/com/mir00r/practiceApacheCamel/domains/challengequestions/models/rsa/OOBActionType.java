
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for OOBActionType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="OOBActionType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="ADD_OOB"/&amp;gt;
 *     &amp;lt;enumeration value="GET_OOB"/&amp;gt;
 *     &amp;lt;enumeration value="DELETE_OOB"/&amp;gt;
 *     &amp;lt;enumeration value="UPDATE_OOB"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "OOBActionType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
public enum OOBActionType {

    ADD_OOB,
    GET_OOB,
    DELETE_OOB,
    UPDATE_OOB;

    public String value() {
        return name();
    }

    public static OOBActionType fromValue(String v) {
        return valueOf(v);
    }

}
