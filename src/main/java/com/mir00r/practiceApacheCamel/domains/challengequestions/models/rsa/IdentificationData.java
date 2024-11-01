
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import lombok.Data;

@Data
public class IdentificationData {

  protected String clientSessionId;

  protected String clientTransactionId;

  protected Boolean delegated;

  protected String groupName;

  protected String newUserName;

  protected String orgName;

  protected String sessionId;

  protected String transactionId;

  protected String userCountry;

  protected String userLanguage;

  protected String userLoginName;

  protected String userName;

  protected UserStatus userStatus;

  protected WSUserType userType;
}
