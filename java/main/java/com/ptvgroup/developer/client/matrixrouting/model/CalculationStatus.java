/*
 * Matrix Routing
 * With the Matrix Routing service you can compute distances and travel times between a set of origins and destinations.
 *
 * The version of the OpenAPI document: 1.3
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
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.ptvgroup.developer.client.matrixrouting.JSON;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The current status of the calculation.  * &#x60;RUNNING&#x60; - The calculation is still running.  * &#x60;SUCCEEDED&#x60; - The calculation has completed successfully.  * &#x60;FAILED&#x60; - The calculation has completed with a failure.
 */
public enum CalculationStatus {
  
  RUNNING("RUNNING"),
  
  SUCCEEDED("SUCCEEDED"),
  
  FAILED("FAILED");

  private String value;

  CalculationStatus(String value) {
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
  public static CalculationStatus fromValue(String value) {
    for (CalculationStatus b : CalculationStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

