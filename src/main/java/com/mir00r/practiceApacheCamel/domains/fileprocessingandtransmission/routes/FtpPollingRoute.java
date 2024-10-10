package com.mir00r.practiceApacheCamel.domains.fileprocessingandtransmission.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

//@Component
//public class FtpPollingRoute extends RouteBuilder {
//
//  @Override
//  public void configure() throws Exception {
//    from("ftp://{{ftp.username}}@{{ftp.server}}:{{ftp.port}}{{ftp.directory}}?password={{ftp.password}}&binary=true&delete=true")
//      .routeId("ftp-polling-route")
//      .log("File ${file:name} downloaded from FTP")
//      .to("direct:processFile");
//  }
//}
