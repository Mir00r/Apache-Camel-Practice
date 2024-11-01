
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

public enum RequestType {

    ANALYZE,
    AUTHENTICATE,
    CHALLENGE,
    CREATEUSER,
    NOTIFY,
    QUERY,
    QUERYAUTHSTATUS,
    UPDATEUSER;

    public String value() {
        return name();
    }

    public static RequestType fromValue(String v) {
        return valueOf(v);
    }

}
