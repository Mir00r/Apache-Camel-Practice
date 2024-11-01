package com.mir00r.practiceApacheCamel.soap.commons;

import java.util.ArrayList;
import java.util.List;

/**
 * SOAP version constants
 */
public interface ISoapVersions {
  String VERSION_1_1 = "1.1";
  String VERSION_1_2 = "1.2";

  default public List<String> getSupportedVersions() {

    List<String> versions = new ArrayList<String>();
    versions.add(VERSION_1_1);
    versions.add(VERSION_1_2);

    return versions;
  }
}
