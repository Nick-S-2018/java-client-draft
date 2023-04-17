/*
 * Manticore Search Client
 * Low-level client for Manticore Search. 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: info@manticoresearch.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.manticoresearch.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.manticoresearch.client.JSON;


/**
 * Query filter
 */
@JsonPropertyOrder({
  NotFilterBoolean.JSON_PROPERTY_FILTER_FIELD,
  NotFilterBoolean.JSON_PROPERTY_OPERATION,
  NotFilterBoolean.JSON_PROPERTY_FILTER_VALUE
})
@JsonTypeName("notFilterBoolean")
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-17T15:53:07.663175Z[Etc/UTC]")
public class NotFilterBoolean {
  public static final String JSON_PROPERTY_FILTER_FIELD = "filter_field";
  private String filterField;

  public static final String JSON_PROPERTY_OPERATION = "operation";
  private String operation;

  public static final String JSON_PROPERTY_FILTER_VALUE = "filter_value";
  private Boolean filterValue;

  public NotFilterBoolean() { 
  }

  public NotFilterBoolean filterField(String filterField) {
    this.filterField = filterField;
    return this;
  }

   /**
   * Get filterField
   * @return filterField
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FILTER_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFilterField() {
    return filterField;
  }


  @JsonProperty(JSON_PROPERTY_FILTER_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFilterField(String filterField) {
    this.filterField = filterField;
  }


  public NotFilterBoolean operation(String operation) {
    this.operation = operation;
    return this;
  }

   /**
   * Get operation
   * @return operation
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_OPERATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getOperation() {
    return operation;
  }


  @JsonProperty(JSON_PROPERTY_OPERATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOperation(String operation) {
    this.operation = operation;
  }


  public NotFilterBoolean filterValue(Boolean filterValue) {
    this.filterValue = filterValue;
    return this;
  }

   /**
   * Get filterValue
   * @return filterValue
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FILTER_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getFilterValue() {
    return filterValue;
  }


  @JsonProperty(JSON_PROPERTY_FILTER_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFilterValue(Boolean filterValue) {
    this.filterValue = filterValue;
  }


  /**
   * Return true if this notFilterBoolean object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotFilterBoolean notFilterBoolean = (NotFilterBoolean) o;
    return Objects.equals(this.filterField, notFilterBoolean.filterField) &&
        Objects.equals(this.operation, notFilterBoolean.operation) &&
        Objects.equals(this.filterValue, notFilterBoolean.filterValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filterField, operation, filterValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotFilterBoolean {\n");
    sb.append("    filterField: ").append(toIndentedString(filterField)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    filterValue: ").append(toIndentedString(filterValue)).append("\n");
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

