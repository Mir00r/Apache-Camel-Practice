package com.mir00r.practiceApacheCamel.domains.edakafka.models;

public class UserSearchRequest {

  private String searchTerm;

  public String getSearchTerm() {
    return searchTerm;
  }

  public void setSearchTerm(String searchTerm) {
    this.searchTerm = searchTerm;
  }
}
