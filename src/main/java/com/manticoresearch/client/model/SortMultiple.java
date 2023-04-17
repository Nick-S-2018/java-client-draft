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
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.manticoresearch.client.JSON;


/**
 * Query sort expression for multiple attributes
 */
@JsonPropertyOrder({
  SortMultiple.JSON_PROPERTY_ATTRS,
  SortMultiple.JSON_PROPERTY_REPLACE
})
@JsonTypeName("sortMultiple")
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-17T15:53:07.663175Z[Etc/UTC]")
public class SortMultiple {
  public static final String JSON_PROPERTY_ATTRS = "attrs";
  private Map<String, Object> attrs = new HashMap<>();

  public static final String JSON_PROPERTY_REPLACE = "replace";
  private Boolean replace;

  public SortMultiple() { 
  }

  public SortMultiple attrs(Map<String, Object> attrs) {
    this.attrs = attrs;
    return this;
  }

  public SortMultiple putAttrsItem(String key, Object attrsItem) {
    if (this.attrs == null) {
      this.attrs = new HashMap<>();
    }
    this.attrs.put(key, attrsItem);
    return this;
  }

   /**
   * Get attrs
   * @return attrs
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ATTRS)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.ALWAYS)

  public Map<String, Object> getAttrs() {
    return attrs;
  }


  @JsonProperty(JSON_PROPERTY_ATTRS)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.ALWAYS)
  public void setAttrs(Map<String, Object> attrs) {
    this.attrs = attrs;
  }


  public SortMultiple replace(Boolean replace) {
    this.replace = replace;
    return this;
  }

   /**
   * Get replace
   * @return replace
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REPLACE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getReplace() {
    return replace;
  }


  @JsonProperty(JSON_PROPERTY_REPLACE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setReplace(Boolean replace) {
    this.replace = replace;
  }


  /**
   * Return true if this sortMultiple object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SortMultiple sortMultiple = (SortMultiple) o;
    return Objects.equals(this.attrs, sortMultiple.attrs) &&
        Objects.equals(this.replace, sortMultiple.replace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attrs, replace);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SortMultiple {\n");
    sb.append("    attrs: ").append(toIndentedString(attrs)).append("\n");
    sb.append("    replace: ").append(toIndentedString(replace)).append("\n");
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

