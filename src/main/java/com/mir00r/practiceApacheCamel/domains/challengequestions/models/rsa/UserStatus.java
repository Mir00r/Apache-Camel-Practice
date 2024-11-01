
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

public enum UserStatus {

    NOTENROLLED,
    UNVERIFIED,
    VERIFIED,
    DELETE,
    LOCKOUT,
    UNLOCKED;

    public String value() {
        return name();
    }

    public static UserStatus fromValue(String v) {
        return valueOf(v);
    }

}
