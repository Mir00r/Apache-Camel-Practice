package com.mir00r.practiceApacheCamel.domains.challengequestions.controllers;

import com.mir00r.practiceApacheCamel.domains.challengequestions.models.ChallengeQRq;
import com.mir00r.practiceApacheCamel.domains.challengequestions.models.ChallengeQRs;
import com.mir00r.practiceApacheCamel.domains.challengequestions.routes.ChallengeQuestionRoute;
import org.apache.camel.ProducerTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ChallengeQuestionController {

  private static final Logger log = LoggerFactory.getLogger(ChallengeQuestionController.class);
  private final ProducerTemplate producerTemplate;

  @Autowired
  public ChallengeQuestionController(ProducerTemplate producerTemplate) {
    this.producerTemplate = producerTemplate;
  }

  @PostMapping("/v1/challenge/questions")
  public ResponseEntity<ChallengeQRs> challengeQuestion(@RequestBody ChallengeQRq request) {
    ChallengeQRs response = new ChallengeQRs();
    try {
      response =
        this.producerTemplate.requestBody(ChallengeQuestionRoute.DIRECT_CHALLENGE_QUESTION,
          request, ChallengeQRs.class);

    } catch (Exception e) {
      log.error("Exception caught in ", e);
    }
    return ResponseEntity.ok().body(response);
  }
}
