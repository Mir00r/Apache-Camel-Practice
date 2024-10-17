package com.mir00r.practiceApacheCamel.domains.era.models;

public class Order {

  private String orderId;
  private String customerName;
  private String product;
  private double price;
  private String channel; // Email, FTP, REST

  public Order() {
  }

  public Order(String orderId, String customerName, String product, double price, String channel) {
    this.orderId = orderId;
    this.customerName = customerName;
    this.product = product;
    this.price = price;
    this.channel = channel;
  }

  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public String getProduct() {
    return product;
  }

  public void setProduct(String product) {
    this.product = product;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String getChannel() {
    return channel;
  }

  public void setChannel(String channel) {
    this.channel = channel;
  }
}
