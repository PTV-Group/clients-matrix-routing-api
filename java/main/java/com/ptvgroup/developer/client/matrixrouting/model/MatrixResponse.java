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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.ptvgroup.developer.client.matrixrouting.model.Warning;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.ptvgroup.developer.client.matrixrouting.JSON;


/**
 * MatrixResponse
 */
@JsonPropertyOrder({
  MatrixResponse.JSON_PROPERTY_PERCENTAGE_OF_DIRECT_DISTANCE_RELATIONS,
  MatrixResponse.JSON_PROPERTY_DISTANCES,
  MatrixResponse.JSON_PROPERTY_TRAVEL_TIMES,
  MatrixResponse.JSON_PROPERTY_TOLL_COSTS,
  MatrixResponse.JSON_PROPERTY_WARNINGS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-02T11:51:06.907755Z[Etc/UTC]")
public class MatrixResponse {
  public static final String JSON_PROPERTY_PERCENTAGE_OF_DIRECT_DISTANCE_RELATIONS = "percentageOfDirectDistanceRelations";
  private Double percentageOfDirectDistanceRelations;

  public static final String JSON_PROPERTY_DISTANCES = "distances";
  private List<Integer> distances = null;

  public static final String JSON_PROPERTY_TRAVEL_TIMES = "travelTimes";
  private List<Integer> travelTimes = null;

  public static final String JSON_PROPERTY_TOLL_COSTS = "tollCosts";
  private List<Double> tollCosts = null;

  public static final String JSON_PROPERTY_WARNINGS = "warnings";
  private List<Warning> warnings = null;


  public MatrixResponse percentageOfDirectDistanceRelations(Double percentageOfDirectDistanceRelations) {
    this.percentageOfDirectDistanceRelations = percentageOfDirectDistanceRelations;
    return this;
  }

   /**
   * Percentage of relations in the distance matrix which has not been calculated successfully.  Zero distances corresponding to A-A relations are not included in this calculation.
   * minimum: 0
   * maximum: 100
   * @return percentageOfDirectDistanceRelations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Percentage of relations in the distance matrix which has not been calculated successfully.  Zero distances corresponding to A-A relations are not included in this calculation.")
  @JsonProperty(JSON_PROPERTY_PERCENTAGE_OF_DIRECT_DISTANCE_RELATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getPercentageOfDirectDistanceRelations() {
    return percentageOfDirectDistanceRelations;
  }


  public void setPercentageOfDirectDistanceRelations(Double percentageOfDirectDistanceRelations) {
    this.percentageOfDirectDistanceRelations = percentageOfDirectDistanceRelations;
  }


  public MatrixResponse distances(List<Integer> distances) {
    this.distances = distances;
    return this;
  }

  public MatrixResponse addDistancesItem(Integer distancesItem) {
    if (this.distances == null) {
      this.distances = new ArrayList<>();
    }
    this.distances.add(distancesItem);
    return this;
  }

   /**
   * The distances of the requested matrix elements [m]. To access to the distance of the relation between the origin i and the destination j, read the k-th element defined by &#x60;k &#x3D; i * N + j&#x60;, with N being the number of destinations. Please note that the distance for an A-A relation is always set to zero.
   * @return distances
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The distances of the requested matrix elements [m]. To access to the distance of the relation between the origin i and the destination j, read the k-th element defined by `k = i * N + j`, with N being the number of destinations. Please note that the distance for an A-A relation is always set to zero.")
  @JsonProperty(JSON_PROPERTY_DISTANCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getDistances() {
    return distances;
  }


  public void setDistances(List<Integer> distances) {
    this.distances = distances;
  }


  public MatrixResponse travelTimes(List<Integer> travelTimes) {
    this.travelTimes = travelTimes;
    return this;
  }

  public MatrixResponse addTravelTimesItem(Integer travelTimesItem) {
    if (this.travelTimes == null) {
      this.travelTimes = new ArrayList<>();
    }
    this.travelTimes.add(travelTimesItem);
    return this;
  }

   /**
   * The travel times of the requested matrix elements [s]. To access to the travel time of the relation between the origin i and the destination j, read the k-th element defined by &#x60;k &#x3D; i * N + j&#x60;, with N being the number of destinations. Please note that the travel time for an A-A relation is always set to zero.
   * @return travelTimes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The travel times of the requested matrix elements [s]. To access to the travel time of the relation between the origin i and the destination j, read the k-th element defined by `k = i * N + j`, with N being the number of destinations. Please note that the travel time for an A-A relation is always set to zero.")
  @JsonProperty(JSON_PROPERTY_TRAVEL_TIMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getTravelTimes() {
    return travelTimes;
  }


  public void setTravelTimes(List<Integer> travelTimes) {
    this.travelTimes = travelTimes;
  }


  public MatrixResponse tollCosts(List<Double> tollCosts) {
    this.tollCosts = tollCosts;
    return this;
  }

  public MatrixResponse addTollCostsItem(Double tollCostsItem) {
    if (this.tollCosts == null) {
      this.tollCosts = new ArrayList<>();
    }
    this.tollCosts.add(tollCostsItem);
    return this;
  }

   /**
   * The toll costs of the requested matrix elements in the requested currency. To access to the toll cost of the relation between the origin i and the destination j, read the k-th element defined by &#x60;k &#x3D; i * N + j&#x60;, with N being the number of destinations.   Toll prices do not include VAT. 
   * @return tollCosts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The toll costs of the requested matrix elements in the requested currency. To access to the toll cost of the relation between the origin i and the destination j, read the k-th element defined by `k = i * N + j`, with N being the number of destinations.   Toll prices do not include VAT. ")
  @JsonProperty(JSON_PROPERTY_TOLL_COSTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Double> getTollCosts() {
    return tollCosts;
  }


  public void setTollCosts(List<Double> tollCosts) {
    this.tollCosts = tollCosts;
  }


  public MatrixResponse warnings(List<Warning> warnings) {
    this.warnings = warnings;
    return this;
  }

  public MatrixResponse addWarningsItem(Warning warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

   /**
   * A list of warnings concerning the validity of the result.
   * @return warnings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of warnings concerning the validity of the result.")
  @JsonProperty(JSON_PROPERTY_WARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Warning> getWarnings() {
    return warnings;
  }


  public void setWarnings(List<Warning> warnings) {
    this.warnings = warnings;
  }


  /**
   * Return true if this MatrixResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatrixResponse matrixResponse = (MatrixResponse) o;
    return Objects.equals(this.percentageOfDirectDistanceRelations, matrixResponse.percentageOfDirectDistanceRelations) &&
        Objects.equals(this.distances, matrixResponse.distances) &&
        Objects.equals(this.travelTimes, matrixResponse.travelTimes) &&
        Objects.equals(this.tollCosts, matrixResponse.tollCosts) &&
        Objects.equals(this.warnings, matrixResponse.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(percentageOfDirectDistanceRelations, distances, travelTimes, tollCosts, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatrixResponse {\n");
    sb.append("    percentageOfDirectDistanceRelations: ").append(toIndentedString(percentageOfDirectDistanceRelations)).append("\n");
    sb.append("    distances: ").append(toIndentedString(distances)).append("\n");
    sb.append("    travelTimes: ").append(toIndentedString(travelTimes)).append("\n");
    sb.append("    tollCosts: ").append(toIndentedString(tollCosts)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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

