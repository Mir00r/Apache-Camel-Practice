
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

public enum WSUserType {

    PERSISTENT,
    NONPERSISTENT,
    BAIT;

    public String value() {
        return name();
    }

    public static WSUserType fromValue(String v) {
        return valueOf(v);
    }

}
