package com.mir00r.practiceApacheCamel.domains.challengequestions.routes;

import com.mir00r.practiceApacheCamel.domains.challengequestions.ChallengeQuestionConstants;
import com.mir00r.practiceApacheCamel.soap.commons.ISoapClientBaseService;
import com.mir00r.practiceApacheCamel.utils.AppUtil;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ShortMsgMainRoute extends RouteBuilder {

  public static final String DIRECT_CHALLENGE_QUESTION =
    "direct:" + ChallengeQuestionConstants.CHALLENGE_QUESTION
      + ShortMsgMainRoute.class.getSimpleName();


  @Override
  public void configure() throws Exception {
    String predicate1 =
      AppUtil.getExpressionPredicate(ISoapClientBaseService.IMPL_BEAN_REF, "== null");
    String predicate2 =
      AppUtil.getExpressionPredicate(ISoapClientBaseService.IMPL_BEAN_REF, "== ''");

    from(DIRECT_CHALLENGE_QUESTION)
      .routeId(ChallengeQuestionConstants.CHALLENGE_QUESTION + getClass().getSimpleName())
      .choice()
      .when(simple(predicate1 + " || " + predicate2))
      .throwException(new IllegalArgumentException(
        "Camel Header." + ISoapClientBaseService.IMPL_BEAN_REF
          + " must be specified and not empty"))
      .endChoice()
      .end()
      .setProperty(ISoapClientBaseService.IMPL_BEAN_REF,
        simple(AppUtil.getHeaderUri(ISoapClientBaseService.IMPL_BEAN_REF)))
      .to(ShortMsgSenderRoute.DIRECT_CHALLENGE_QUESTION)
      .to(ShortMsgReceiverRoute.DIRECT_CHALLENGE_QUESTION);
  }
}
