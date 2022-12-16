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
import com.ptvgroup.developer.client.matrixrouting.model.Location;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.ptvgroup.developer.client.matrixrouting.JSON;


/**
 * Locations
 */
@JsonPropertyOrder({
  Locations.JSON_PROPERTY_ORIGINS,
  Locations.JSON_PROPERTY_DESTINATIONS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-16T15:19:26.840942Z[Etc/UTC]")
public class Locations {
  public static final String JSON_PROPERTY_ORIGINS = "origins";
  private List<Location> origins = new ArrayList<>();

  public static final String JSON_PROPERTY_DESTINATIONS = "destinations";
  private List<Location> destinations = null;


  public Locations origins(List<Location> origins) {
    this.origins = origins;
    return this;
  }

  public Locations addOriginsItem(Location originsItem) {
    this.origins.add(originsItem);
    return this;
  }

   /**
   * The list of origins.
   * @return origins
  **/
  @ApiModelProperty(required = true, value = "The list of origins.")
  @JsonProperty(JSON_PROPERTY_ORIGINS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Location> getOrigins() {
    return origins;
  }


  public void setOrigins(List<Location> origins) {
    this.origins = origins;
  }


  public Locations destinations(List<Location> destinations) {
    this.destinations = destinations;
    return this;
  }

  public Locations addDestinationsItem(Location destinationsItem) {
    if (this.destinations == null) {
      this.destinations = new ArrayList<>();
    }
    this.destinations.add(destinationsItem);
    return this;
  }

   /**
   * The list of destinations. If this list is empty, the destinations are equal to the origins.
   * @return destinations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of destinations. If this list is empty, the destinations are equal to the origins.")
  @JsonProperty(JSON_PROPERTY_DESTINATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Location> getDestinations() {
    return destinations;
  }


  public void setDestinations(List<Location> destinations) {
    this.destinations = destinations;
  }


  /**
   * Return true if this Locations object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Locations locations = (Locations) o;
    return Objects.equals(this.origins, locations.origins) &&
        Objects.equals(this.destinations, locations.destinations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(origins, destinations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Locations {\n");
    sb.append("    origins: ").append(toIndentedString(origins)).append("\n");
    sb.append("    destinations: ").append(toIndentedString(destinations)).append("\n");
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

