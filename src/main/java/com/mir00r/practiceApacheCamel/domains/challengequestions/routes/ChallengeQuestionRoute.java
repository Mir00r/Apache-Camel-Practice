package com.mir00r.practiceApacheCamel.domains.challengequestions.routes;

import com.mir00r.practiceApacheCamel.domains.challengequestions.models.ChallengeQRq;
import com.mir00r.practiceApacheCamel.domains.challengequestions.processors.ChallengeQuestionProcessor;
import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ChallengeQuestionRoute extends RouteBuilder {

  public static final String DIRECT_CHALLENGE_QUESTION =
    "direct:" + ChallengeQuestionRoute.class.getCanonicalName();

  private final ChallengeQuestionProcessor challengeQuestionProcessor;

  @Autowired
  public ChallengeQuestionRoute(ChallengeQuestionProcessor challengeQuestionProcessor) {
    this.challengeQuestionProcessor = challengeQuestionProcessor;
  }

  @Override
  public void configure() throws Exception {
    interceptFrom(DIRECT_CHALLENGE_QUESTION).log(LoggingLevel.INFO, "com.mir00r", "${headers}");

    from(DIRECT_CHALLENGE_QUESTION)
      .choice()
      .when(simple(
        "${body.getClass().getCanonicalName()} == '" + ChallengeQRq.class.getCanonicalName() + "'"))
      .process(this.challengeQuestionProcessor)
      .endChoice()
      .end();
  }
}
