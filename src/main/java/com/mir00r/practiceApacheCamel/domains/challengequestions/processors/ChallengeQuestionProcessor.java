package com.mir00r.practiceApacheCamel.domains.challengequestions.processors;

import com.mir00r.practiceApacheCamel.domains.challengequestions.models.ChallengeQRq;
import com.mir00r.practiceApacheCamel.domains.challengequestions.models.ChallengeQRs;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.ProducerTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

import static com.mir00r.practiceApacheCamel.soap.commons.ICamelProperties.IMPL_BEAN_REF;

@Component
public class ChallengeQuestionProcessor implements Processor {

  public static final Logger log = LoggerFactory.getLogger(ChallengeQuestionProcessor.class);

  private final ProducerTemplate producerTemplate;

  @Autowired
  public ChallengeQuestionProcessor(ProducerTemplate producerTemplate) {
    this.producerTemplate = producerTemplate;
  }

  @Override
  public void process(Exchange exchange) throws Exception {
    Map<String,Object> headers = exchange.getIn().getHeaders();

    ChallengeQRq body = exchange.getIn().getBody(ChallengeQRq.class);

    headers.put(IMPL_BEAN_REF, IMPL_BEAN_REF);

    ChallengeQRs
      wsResponse = producerTemplate.requestBodyAndHeaders(ShortMsgMainRoute.ENDPOINT_URI, body, headers, ChallengeQRs.class);

    exchange.getIn().setBody(wsResponse);
  }
}
