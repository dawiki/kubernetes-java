/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.21.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.cert.manager.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * Requested set of X509 certificate subject attributes. More info: https://datatracker.ietf.org/doc/html/rfc5280#section-4.1.2.6   The common name attribute is specified separately in the &#x60;commonName&#x60; field. Cannot be set if the &#x60;literalSubject&#x60; field is set.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-01T07:00:20.132973Z[Etc/UTC]")
public class V1CertificateSpecSubject {
  public static final String SERIALIZED_NAME_COUNTRIES = "countries";
  @SerializedName(SERIALIZED_NAME_COUNTRIES)
  private List<String> countries;

  public static final String SERIALIZED_NAME_LOCALITIES = "localities";
  @SerializedName(SERIALIZED_NAME_LOCALITIES)
  private List<String> localities;

  public static final String SERIALIZED_NAME_ORGANIZATIONAL_UNITS = "organizationalUnits";
  @SerializedName(SERIALIZED_NAME_ORGANIZATIONAL_UNITS)
  private List<String> organizationalUnits;

  public static final String SERIALIZED_NAME_ORGANIZATIONS = "organizations";
  @SerializedName(SERIALIZED_NAME_ORGANIZATIONS)
  private List<String> organizations;

  public static final String SERIALIZED_NAME_POSTAL_CODES = "postalCodes";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODES)
  private List<String> postalCodes;

  public static final String SERIALIZED_NAME_PROVINCES = "provinces";
  @SerializedName(SERIALIZED_NAME_PROVINCES)
  private List<String> provinces;

  public static final String SERIALIZED_NAME_SERIAL_NUMBER = "serialNumber";
  @SerializedName(SERIALIZED_NAME_SERIAL_NUMBER)
  private String serialNumber;

  public static final String SERIALIZED_NAME_STREET_ADDRESSES = "streetAddresses";
  @SerializedName(SERIALIZED_NAME_STREET_ADDRESSES)
  private List<String> streetAddresses;

  public V1CertificateSpecSubject() {
  }

  public V1CertificateSpecSubject countries(List<String> countries) {
    
    this.countries = countries;
    return this;
  }

  public V1CertificateSpecSubject addCountriesItem(String countriesItem) {
    if (this.countries == null) {
      this.countries = new ArrayList<>();
    }
    this.countries.add(countriesItem);
    return this;
  }

   /**
   * Countries to be used on the Certificate.
   * @return countries
  **/
  @jakarta.annotation.Nullable
  public List<String> getCountries() {
    return countries;
  }


  public void setCountries(List<String> countries) {
    this.countries = countries;
  }


  public V1CertificateSpecSubject localities(List<String> localities) {
    
    this.localities = localities;
    return this;
  }

  public V1CertificateSpecSubject addLocalitiesItem(String localitiesItem) {
    if (this.localities == null) {
      this.localities = new ArrayList<>();
    }
    this.localities.add(localitiesItem);
    return this;
  }

   /**
   * Cities to be used on the Certificate.
   * @return localities
  **/
  @jakarta.annotation.Nullable
  public List<String> getLocalities() {
    return localities;
  }


  public void setLocalities(List<String> localities) {
    this.localities = localities;
  }


  public V1CertificateSpecSubject organizationalUnits(List<String> organizationalUnits) {
    
    this.organizationalUnits = organizationalUnits;
    return this;
  }

  public V1CertificateSpecSubject addOrganizationalUnitsItem(String organizationalUnitsItem) {
    if (this.organizationalUnits == null) {
      this.organizationalUnits = new ArrayList<>();
    }
    this.organizationalUnits.add(organizationalUnitsItem);
    return this;
  }

   /**
   * Organizational Units to be used on the Certificate.
   * @return organizationalUnits
  **/
  @jakarta.annotation.Nullable
  public List<String> getOrganizationalUnits() {
    return organizationalUnits;
  }


  public void setOrganizationalUnits(List<String> organizationalUnits) {
    this.organizationalUnits = organizationalUnits;
  }


  public V1CertificateSpecSubject organizations(List<String> organizations) {
    
    this.organizations = organizations;
    return this;
  }

  public V1CertificateSpecSubject addOrganizationsItem(String organizationsItem) {
    if (this.organizations == null) {
      this.organizations = new ArrayList<>();
    }
    this.organizations.add(organizationsItem);
    return this;
  }

   /**
   * Organizations to be used on the Certificate.
   * @return organizations
  **/
  @jakarta.annotation.Nullable
  public List<String> getOrganizations() {
    return organizations;
  }


  public void setOrganizations(List<String> organizations) {
    this.organizations = organizations;
  }


  public V1CertificateSpecSubject postalCodes(List<String> postalCodes) {
    
    this.postalCodes = postalCodes;
    return this;
  }

  public V1CertificateSpecSubject addPostalCodesItem(String postalCodesItem) {
    if (this.postalCodes == null) {
      this.postalCodes = new ArrayList<>();
    }
    this.postalCodes.add(postalCodesItem);
    return this;
  }

   /**
   * Postal codes to be used on the Certificate.
   * @return postalCodes
  **/
  @jakarta.annotation.Nullable
  public List<String> getPostalCodes() {
    return postalCodes;
  }


  public void setPostalCodes(List<String> postalCodes) {
    this.postalCodes = postalCodes;
  }


  public V1CertificateSpecSubject provinces(List<String> provinces) {
    
    this.provinces = provinces;
    return this;
  }

  public V1CertificateSpecSubject addProvincesItem(String provincesItem) {
    if (this.provinces == null) {
      this.provinces = new ArrayList<>();
    }
    this.provinces.add(provincesItem);
    return this;
  }

   /**
   * State/Provinces to be used on the Certificate.
   * @return provinces
  **/
  @jakarta.annotation.Nullable
  public List<String> getProvinces() {
    return provinces;
  }


  public void setProvinces(List<String> provinces) {
    this.provinces = provinces;
  }


  public V1CertificateSpecSubject serialNumber(String serialNumber) {
    
    this.serialNumber = serialNumber;
    return this;
  }

   /**
   * Serial number to be used on the Certificate.
   * @return serialNumber
  **/
  @jakarta.annotation.Nullable
  public String getSerialNumber() {
    return serialNumber;
  }


  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }


  public V1CertificateSpecSubject streetAddresses(List<String> streetAddresses) {
    
    this.streetAddresses = streetAddresses;
    return this;
  }

  public V1CertificateSpecSubject addStreetAddressesItem(String streetAddressesItem) {
    if (this.streetAddresses == null) {
      this.streetAddresses = new ArrayList<>();
    }
    this.streetAddresses.add(streetAddressesItem);
    return this;
  }

   /**
   * Street addresses to be used on the Certificate.
   * @return streetAddresses
  **/
  @jakarta.annotation.Nullable
  public List<String> getStreetAddresses() {
    return streetAddresses;
  }


  public void setStreetAddresses(List<String> streetAddresses) {
    this.streetAddresses = streetAddresses;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1CertificateSpecSubject v1CertificateSpecSubject = (V1CertificateSpecSubject) o;
    return Objects.equals(this.countries, v1CertificateSpecSubject.countries) &&
        Objects.equals(this.localities, v1CertificateSpecSubject.localities) &&
        Objects.equals(this.organizationalUnits, v1CertificateSpecSubject.organizationalUnits) &&
        Objects.equals(this.organizations, v1CertificateSpecSubject.organizations) &&
        Objects.equals(this.postalCodes, v1CertificateSpecSubject.postalCodes) &&
        Objects.equals(this.provinces, v1CertificateSpecSubject.provinces) &&
        Objects.equals(this.serialNumber, v1CertificateSpecSubject.serialNumber) &&
        Objects.equals(this.streetAddresses, v1CertificateSpecSubject.streetAddresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countries, localities, organizationalUnits, organizations, postalCodes, provinces, serialNumber, streetAddresses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1CertificateSpecSubject {\n");
    sb.append("    countries: ").append(toIndentedString(countries)).append("\n");
    sb.append("    localities: ").append(toIndentedString(localities)).append("\n");
    sb.append("    organizationalUnits: ").append(toIndentedString(organizationalUnits)).append("\n");
    sb.append("    organizations: ").append(toIndentedString(organizations)).append("\n");
    sb.append("    postalCodes: ").append(toIndentedString(postalCodes)).append("\n");
    sb.append("    provinces: ").append(toIndentedString(provinces)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    streetAddresses: ").append(toIndentedString(streetAddresses)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("countries");
    openapiFields.add("localities");
    openapiFields.add("organizationalUnits");
    openapiFields.add("organizations");
    openapiFields.add("postalCodes");
    openapiFields.add("provinces");
    openapiFields.add("serialNumber");
    openapiFields.add("streetAddresses");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1CertificateSpecSubject
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1CertificateSpecSubject.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1CertificateSpecSubject is not found in the empty JSON string", V1CertificateSpecSubject.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1CertificateSpecSubject.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1CertificateSpecSubject` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("countries") != null && !jsonObj.get("countries").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `countries` to be an array in the JSON string but got `%s`", jsonObj.get("countries").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("localities") != null && !jsonObj.get("localities").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `localities` to be an array in the JSON string but got `%s`", jsonObj.get("localities").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("organizationalUnits") != null && !jsonObj.get("organizationalUnits").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `organizationalUnits` to be an array in the JSON string but got `%s`", jsonObj.get("organizationalUnits").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("organizations") != null && !jsonObj.get("organizations").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `organizations` to be an array in the JSON string but got `%s`", jsonObj.get("organizations").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("postalCodes") != null && !jsonObj.get("postalCodes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `postalCodes` to be an array in the JSON string but got `%s`", jsonObj.get("postalCodes").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("provinces") != null && !jsonObj.get("provinces").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `provinces` to be an array in the JSON string but got `%s`", jsonObj.get("provinces").toString()));
      }
      if ((jsonObj.get("serialNumber") != null && !jsonObj.get("serialNumber").isJsonNull()) && !jsonObj.get("serialNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serialNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serialNumber").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("streetAddresses") != null && !jsonObj.get("streetAddresses").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `streetAddresses` to be an array in the JSON string but got `%s`", jsonObj.get("streetAddresses").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1CertificateSpecSubject.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1CertificateSpecSubject' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1CertificateSpecSubject> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1CertificateSpecSubject.class));

       return (TypeAdapter<T>) new TypeAdapter<V1CertificateSpecSubject>() {
           @Override
           public void write(JsonWriter out, V1CertificateSpecSubject value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1CertificateSpecSubject read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1CertificateSpecSubject given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1CertificateSpecSubject
  * @throws IOException if the JSON string is invalid with respect to V1CertificateSpecSubject
  */
  public static V1CertificateSpecSubject fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1CertificateSpecSubject.class);
  }

 /**
  * Convert an instance of V1CertificateSpecSubject to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

