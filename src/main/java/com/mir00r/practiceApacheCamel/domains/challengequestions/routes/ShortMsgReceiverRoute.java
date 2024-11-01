package com.mir00r.practiceApacheCamel.domains.challengequestions.routes;

import com.mir00r.practiceApacheCamel.domains.challengequestions.ChallengeQuestionConstants;
import com.mir00r.practiceApacheCamel.domains.challengequestions.beans.ChallengeQClientService;
import com.mir00r.practiceApacheCamel.soap.commons.SoapRequestHandlerRoute;
import com.mir00r.practiceApacheCamel.soap.commons.SoapResponseHandlerRoute;
import org.apache.camel.dataformat.soap.SoapDataFormat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShortMsgReceiverRoute extends SoapResponseHandlerRoute {

  public static final String DIRECT_CHALLENGE_QUESTION =
    "direct:" + ChallengeQuestionConstants.CHALLENGE_QUESTION
      + ShortMsgReceiverRoute.class.getSimpleName();

  private static final Logger log = LoggerFactory.getLogger(ShortMsgReceiverRoute.class);

  private final ChallengeQClientService challengeQClientService;

  @Autowired
  public ShortMsgReceiverRoute(ChallengeQClientService challengeQClientService) {
    this.challengeQClientService = challengeQClientService;
  }

  @Override
  public SoapDataFormat getDataFormat() {
    return this.challengeQClientService.getDataFormat();
  }

  @Override
  public String getRouteFromUri() {
    return this.challengeQClientService.getUrl();
  }

  @Override
  public Logger getLogger() {
    return log;
  }

  @Override
  public String getRouteId() {
    return ChallengeQuestionConstants.CHALLENGE_QUESTION + getClass().getSimpleName();
  }
}
