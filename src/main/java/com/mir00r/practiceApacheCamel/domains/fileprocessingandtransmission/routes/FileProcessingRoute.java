package com.mir00r.practiceApacheCamel.domains.fileprocessingandtransmission.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class FileProcessingRoute extends RouteBuilder {

  @Override
  public void configure() throws Exception {
    from("direct:processFile")
      .routeId("file-processing-route")
      .log("Processing file: ${file:name}")

      // Split the XML file into manageable chunks if it's too large
      .split(xpath("/root/element")).streaming() // Adjust XPath as per the XML structure

      // Convert XML to JSON
      .unmarshal().jacksonXml() // Convert XML to Java object
      .marshal().json() // Convert Java object to JSON

      // Send the processed JSON to the file system or any downstream system
      .to("file:{{output.directory}}?fileName=${file:name.noext}.json")

      // Error handling
      .onException(Exception.class)
      .log("Error processing file ${file:name}: ${exception.message}")
      .handled(true);
  }
}
