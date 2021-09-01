package com.mulesoft.connectors.fabricrestapi.api.metadata;

public enum GetStatusOperationStatusFormatQueryParamEnum {
  JMX("JMX"),

  STRING("STRING"),

  HTML("HTML");

  private String value;

  GetStatusOperationStatusFormatQueryParamEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
