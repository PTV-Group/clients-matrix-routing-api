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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.ptvgroup.developer.client.matrixrouting.JSON;


/**
 * CausingError
 */
@JsonPropertyOrder({
  CausingError.JSON_PROPERTY_DESCRIPTION,
  CausingError.JSON_PROPERTY_ERROR_CODE,
  CausingError.JSON_PROPERTY_PARAMETER,
  CausingError.JSON_PROPERTY_DETAILS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-02T08:06:12.381652Z[Etc/UTC]")
public class CausingError {
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ERROR_CODE = "errorCode";
  private String errorCode;

  public static final String JSON_PROPERTY_PARAMETER = "parameter";
  private String parameter;

  public static final String JSON_PROPERTY_DETAILS = "details";
  private Map<String, Object> details = null;


  public CausingError description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A human readable message that describes the error.
   * @return description
  **/
  @ApiModelProperty(required = true, value = "A human readable message that describes the error.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CausingError errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * A constant string that can be used to identify this error class programmatically. An errorCode can have **details** to provide information in additional properties which are described with the code they apply to. They are of type string unless otherwise specified. Note that additional errorCodes as well as the **details** of existing errorCodes may be added at any time. Furthermore, the **description** may change at any time.  **Error codes for** &#x60;GENERAL_VALIDATION_ERROR&#x60;  * &#x60;GENERAL_INVALID_VALUE&#x60; - A parameter is set to an invalid value.   * &#x60;value&#x60; - The invalid value. * &#x60;GENERAL_UNRECOGNIZED_PARAMETER&#x60; - A parameter is unknown. * &#x60;GENERAL_MISSING_PARAMETER&#x60; - A required parameter is missing. * &#x60;GENERAL_MINIMUM_LENGTH_VIOLATED&#x60; - The minimum length is violated.   * &#x60;minimumLength&#x60; - The minimum length (integer). * &#x60;GENERAL_MAXIMUM_LENGTH_VIOLATED&#x60; - The maximum length is violated.   * &#x60;maximumLength&#x60; - The maximum length (integer). * &#x60;GENERAL_MINIMUM_VALUE_VIOLATED&#x60; - The minimum value restriction is violated.   * &#x60;minimumValue&#x60; - The minimum value (integer or double). * &#x60;GENERAL_MAXIMUM_VALUE_VIOLATED&#x60; - The maximum value restriction is violated.   * &#x60;maximumValue&#x60; - The maximum value (integer or double). * &#x60;GENERAL_DUPLICATE_PARAMETER&#x60; - A parameter is duplicated. * &#x60;GENERAL_INVALID_LIST&#x60; - A list has an invalid format such as duplicate commas.   * &#x60;value&#x60; - The invalid list. * &#x60;MATRIX_ROUTING_VALID_PROFILE_NOT_FOUND&#x60; - A valid profile was required but could not be found.   * &#x60;value&#x60; - The invalid profile. * &#x60;MATRIX_ROUTING_TOO_MANY_RELATIONS&#x60; - The request contains too many relations.   * &#x60;limit&#x60;- The maximum allowed number of relations for a single request. * &#x60;MATRIX_ROUTING_UNSUPPORTED_CURRENCY&#x60; - The specified currency is not supported.   * &#x60;value&#x60; - The unsupported currency. * &#x60;MATRIX_ROUTING_UNSUPPORTED_RESULT_OPTION&#x60; - The specified result option is not supported.   * &#x60;value&#x60; - The unsupported result option.
   * @return errorCode
  **/
  @ApiModelProperty(required = true, value = "A constant string that can be used to identify this error class programmatically. An errorCode can have **details** to provide information in additional properties which are described with the code they apply to. They are of type string unless otherwise specified. Note that additional errorCodes as well as the **details** of existing errorCodes may be added at any time. Furthermore, the **description** may change at any time.  **Error codes for** `GENERAL_VALIDATION_ERROR`  * `GENERAL_INVALID_VALUE` - A parameter is set to an invalid value.   * `value` - The invalid value. * `GENERAL_UNRECOGNIZED_PARAMETER` - A parameter is unknown. * `GENERAL_MISSING_PARAMETER` - A required parameter is missing. * `GENERAL_MINIMUM_LENGTH_VIOLATED` - The minimum length is violated.   * `minimumLength` - The minimum length (integer). * `GENERAL_MAXIMUM_LENGTH_VIOLATED` - The maximum length is violated.   * `maximumLength` - The maximum length (integer). * `GENERAL_MINIMUM_VALUE_VIOLATED` - The minimum value restriction is violated.   * `minimumValue` - The minimum value (integer or double). * `GENERAL_MAXIMUM_VALUE_VIOLATED` - The maximum value restriction is violated.   * `maximumValue` - The maximum value (integer or double). * `GENERAL_DUPLICATE_PARAMETER` - A parameter is duplicated. * `GENERAL_INVALID_LIST` - A list has an invalid format such as duplicate commas.   * `value` - The invalid list. * `MATRIX_ROUTING_VALID_PROFILE_NOT_FOUND` - A valid profile was required but could not be found.   * `value` - The invalid profile. * `MATRIX_ROUTING_TOO_MANY_RELATIONS` - The request contains too many relations.   * `limit`- The maximum allowed number of relations for a single request. * `MATRIX_ROUTING_UNSUPPORTED_CURRENCY` - The specified currency is not supported.   * `value` - The unsupported currency. * `MATRIX_ROUTING_UNSUPPORTED_RESULT_OPTION` - The specified result option is not supported.   * `value` - The unsupported result option.")
  @JsonProperty(JSON_PROPERTY_ERROR_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getErrorCode() {
    return errorCode;
  }


  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }


  public CausingError parameter(String parameter) {
    this.parameter = parameter;
    return this;
  }

   /**
   * The name of the affected query or path parameter or a JSONPath to the affected property of the request.
   * @return parameter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the affected query or path parameter or a JSONPath to the affected property of the request.")
  @JsonProperty(JSON_PROPERTY_PARAMETER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getParameter() {
    return parameter;
  }


  public void setParameter(String parameter) {
    this.parameter = parameter;
  }


  public CausingError details(Map<String, Object> details) {
    this.details = details;
    return this;
  }

  public CausingError putDetailsItem(String key, Object detailsItem) {
    if (this.details == null) {
      this.details = new HashMap<>();
    }
    this.details.put(key, detailsItem);
    return this;
  }

   /**
   * Additional properties specific to this error class.
   * @return details
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Additional properties specific to this error class.")
  @JsonProperty(JSON_PROPERTY_DETAILS)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Object> getDetails() {
    return details;
  }


  public void setDetails(Map<String, Object> details) {
    this.details = details;
  }


  /**
   * Return true if this CausingError object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CausingError causingError = (CausingError) o;
    return Objects.equals(this.description, causingError.description) &&
        Objects.equals(this.errorCode, causingError.errorCode) &&
        Objects.equals(this.parameter, causingError.parameter) &&
        Objects.equals(this.details, causingError.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, errorCode, parameter, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CausingError {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    parameter: ").append(toIndentedString(parameter)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

