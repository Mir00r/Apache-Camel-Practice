package com.mir00r.practiceApacheCamel.domains.fileprocessingandtransmission.routes;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;
import org.apache.camel.model.dataformat.JacksonXMLDataFormat;

@Component
public class FileProcessingRoute extends RouteBuilder {

  @Override
  public void configure() throws Exception {
    // Error handling
    onException(Exception.class)
      .log("Error processing file ${file:name}: ${exception.message}")
      .handled(true);

    //    from("direct:processFile")
    //      .routeId("file-processing-route")
    //      .log("Processing file: ${file:name}")
    //
    //      // Split the XML file into manageable chunks if it's too large
    //      .split(xpath("/root/element")).streaming() // Adjust XPath as per the XML structure
    //
    //      // Convert XML to JSON
    //      .unmarshal().jacksonXml() // Convert XML to Java object
    //      .marshal().json() // Convert Java object to JSON
    //
    //      // Send the processed JSON to the file system or any downstream system
    //      .to("file:{{output.directory}}?fileName=${file:name.noext}.json");

    // Create Jackson XML Data Format instance
    //    JacksonXMLDataFormat jacksonXmlFormat = new JacksonXMLDataFormat();
    //
    ////    from("direct:processFile")
    //    from("file:{{input.directory}}?noop=true")  // Input directory for local testing
    //      .routeId("file-processing-route")
    //      .log("Processing file: ${file:name}")
    //
    //      // Split large XML files into manageable chunks using XPath
    //      .split(xpath("/root/element")).streaming()
    //
    //      // Unmarshal XML into Java object using Jackson XML
    //      .unmarshal(jacksonXmlFormat)
    //
    //      // Marshal Java object to JSON using Jackson
    //      .marshal().json()
    //
    //      // Write the JSON output to the output directory
    //      .to("file:{{output.directory}}?fileName=${file:name.noext}.json");

    this.processFile();
  }

  private void processFile() {
    // Define Jackson XML Data Format for unmarshalling XML into POJO
    JacksonXMLDataFormat jacksonXmlFormat = new JacksonXMLDataFormat();

    // Configure REST service
    restConfiguration()
      .component("servlet")
      .bindingMode(RestBindingMode.off);

    // Define REST endpoint to upload the file
    rest("/upload")
      .post("/xml")
      .consumes("multipart/form-data")
      .produces("application/json")
      .to("direct:processFile");

    // Define Camel route for file processing
    from("direct:processFile")
      .log("Received file for processing: ${header.CamelFileName}")

      // Retrieve the file input stream from the upload
      .process(exchange -> {
        // Here, we extract the uploaded file from the HTTP request
        String fileName = exchange.getIn().getHeader(Exchange.FILE_NAME, String.class);
        log.info("Processing file: " + fileName);
      })

      // Convert XML file content to JSON
      .unmarshal(jacksonXmlFormat)
      .marshal().json()

      // Send the JSON back in the HTTP response
      .setHeader(Exchange.CONTENT_TYPE, constant("application/json"))
      .log("Returning JSON response")
      .to("log:json-response?level=INFO");
  }
}
