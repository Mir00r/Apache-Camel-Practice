
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for GenericActionType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="GenericActionType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="GET_IMAGE"/&amp;gt;
 *     &amp;lt;enumeration value="GET_PHRASE"/&amp;gt;
 *     &amp;lt;enumeration value="GET_USER_STATUS"/&amp;gt;
 *     &amp;lt;enumeration value="GET_USER_PREFERENCE"/&amp;gt;
 *     &amp;lt;enumeration value="GET_USER_GROUP"/&amp;gt;
 *     &amp;lt;enumeration value="GET_SYSTEM_CREDENTIAL"/&amp;gt;
 *     &amp;lt;enumeration value="GET_USER_CREDENTIAL"/&amp;gt;
 *     &amp;lt;enumeration value="GET_SYSTEM_CREDENTIAL_EXTENDED"/&amp;gt;
 *     &amp;lt;enumeration value="GET_USER_CREDENTIAL_EXTENDED"/&amp;gt;
 *     &amp;lt;enumeration value="BROWSE_USER_GROUP"/&amp;gt;
 *     &amp;lt;enumeration value="BROWSE_IMAGES"/&amp;gt;
 *     &amp;lt;enumeration value="BROWSE_CATEGORIES"/&amp;gt;
 *     &amp;lt;enumeration value="SET_USER_GROUP"/&amp;gt;
 *     &amp;lt;enumeration value="UPDATE_USER_NAME"/&amp;gt;
 *     &amp;lt;enumeration value="SET_IMAGE"/&amp;gt;
 *     &amp;lt;enumeration value="SET_PHRASE"/&amp;gt;
 *     &amp;lt;enumeration value="SET_USER_STATUS"/&amp;gt;
 *     &amp;lt;enumeration value="SET_USER_PREFERENCE"/&amp;gt;
 *     &amp;lt;enumeration value="ADD_FAVORITE"/&amp;gt;
 *     &amp;lt;enumeration value="DEL_FAVORITE"/&amp;gt;
 *     &amp;lt;enumeration value="CLEAR_FAVORITES"/&amp;gt;
 *     &amp;lt;enumeration value="GET_FAVORITES"/&amp;gt;
 *     &amp;lt;enumeration value="OPEN_SESSION"/&amp;gt;
 *     &amp;lt;enumeration value="CLOSE_SESSION"/&amp;gt;
 *     &amp;lt;enumeration value="COMMIT"/&amp;gt;
 *     &amp;lt;enumeration value="CANCEL"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "GenericActionType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
public enum GenericActionType {

    GET_IMAGE,
    GET_PHRASE,
    GET_USER_STATUS,
    GET_USER_PREFERENCE,
    GET_USER_GROUP,
    GET_SYSTEM_CREDENTIAL,
    GET_USER_CREDENTIAL,
    GET_SYSTEM_CREDENTIAL_EXTENDED,
    GET_USER_CREDENTIAL_EXTENDED,
    BROWSE_USER_GROUP,
    BROWSE_IMAGES,
    BROWSE_CATEGORIES,
    SET_USER_GROUP,
    UPDATE_USER_NAME,
    SET_IMAGE,
    SET_PHRASE,
    SET_USER_STATUS,
    SET_USER_PREFERENCE,
    ADD_FAVORITE,
    DEL_FAVORITE,
    CLEAR_FAVORITES,
    GET_FAVORITES,
    OPEN_SESSION,
    CLOSE_SESSION,
    COMMIT,
    CANCEL;

    public String value() {
        return name();
    }

    public static GenericActionType fromValue(String v) {
        return valueOf(v);
    }

}
