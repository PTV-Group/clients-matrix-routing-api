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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.ptvgroup.developer.client.matrixrouting.JSON;


/**
 * Options
 */
@JsonPropertyOrder({
  Options.JSON_PROPERTY_CURRENCY
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-02T08:19:08.199050Z[Etc/UTC]")
public class Options {
  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private JsonNullable<String> currency = JsonNullable.<String>undefined();


  public Options currency(String currency) {
    this.currency = JsonNullable.<String>of(currency);
    return this;
  }

   /**
   * Currency to which the toll prices should be converted to. Use the currency code according to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217). If it is not specified, the currency is taken from the **profile**.  
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Currency to which the toll prices should be converted to. Use the currency code according to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217). If it is not specified, the currency is taken from the **profile**.  ")
  @JsonIgnore

  public String getCurrency() {
        return currency.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCurrency_JsonNullable() {
    return currency;
  }
  
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  public void setCurrency_JsonNullable(JsonNullable<String> currency) {
    this.currency = currency;
  }

  public void setCurrency(String currency) {
    this.currency = JsonNullable.<String>of(currency);
  }


  /**
   * Return true if this Options object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Options options = (Options) o;
    return Objects.equals(this.currency, options.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Options {\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

