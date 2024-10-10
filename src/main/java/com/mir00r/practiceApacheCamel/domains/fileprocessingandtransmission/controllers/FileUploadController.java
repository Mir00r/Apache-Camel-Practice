package com.mir00r.practiceApacheCamel.domains.fileprocessingandtransmission.controllers;

import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileUploadController {

  @Autowired
  private ProducerTemplate producerTemplate;

  @PostMapping("/api/v1/upload/xml")
  public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
    try {
      // Convert MultipartFile to InputStream and pass it to Camel for processing
      this.producerTemplate.sendBodyAndHeader("direct:processFile", file.getInputStream(),
        "CamelFileName", file.getOriginalFilename());
      return ResponseEntity.ok("File processed successfully");
    } catch (Exception e) {
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
        .body("File processing failed: " + e.getMessage());
    }
  }
}
