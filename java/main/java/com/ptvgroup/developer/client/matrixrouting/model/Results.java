/*
 * Matrix Routing API
 * With the Matrix Routing service you can compute distances and travel times between a set of origins and destinations.
 *
 * The version of the OpenAPI document: 1.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ptvgroup.developer.client.matrixrouting.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.ptvgroup.developer.client.matrixrouting.JSON;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets Results
 */
public enum Results {
  
  DISTANCES("DISTANCES"),
  
  TRAVEL_TIMES("TRAVEL_TIMES"),
  
  TOLL_COSTS("TOLL_COSTS");

  private String value;

  Results(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static Results fromValue(String value) {
    for (Results b : Results.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
