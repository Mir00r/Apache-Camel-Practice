package com.mir00r.practiceApacheCamel.domains.challengequestions.routes;

import com.mir00r.practiceApacheCamel.domains.challengequestions.ChallengeQuestionConstants;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ShortMsgMainRoute extends RouteBuilder {

  public static final String ENDPOINT_URI="direct:" + ChallengeQuestionConstants.CHALLENGE_QUESTION+ShortMsgMainRoute.class.getSimpleName();


  @Override
  public void configure() throws Exception {
    String predicate1 = "${header."+SOAPClientService.CAMEL_PROP_KEY_IMPL_BEAN_REF+"} == null";
    String predicate2 = "${header."+SOAPClientService.CAMEL_PROP_KEY_IMPL_BEAN_REF+"} == ''";

    from(ENDPOINT_URI)
      .routeId("m3tech"+getClass().getSimpleName())
      .choice()
      .when(simple(predicate1 + " || " + predicate2))
      .throwException(new IllegalArgumentException("Camel Header."+SOAPClientService.CAMEL_PROP_KEY_IMPL_BEAN_REF+" must be specified and not empty"))
      .endChoice()
      .end()
      .setProperty(SOAPClientService.CAMEL_PROP_KEY_IMPL_BEAN_REF, simple("${header."+SOAPClientService.CAMEL_PROP_KEY_IMPL_BEAN_REF+"}"))
      .to(ShortMsgSenderRoute.ENDPOINT_URI)
      .to(ShortMsgResponseReceiverRoute.ENDPOINT_URI);
  }
}
