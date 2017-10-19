/*
 * Payments API
 * The Payments API allows capturing payments from customers using a variety of payment methods. Charges can be created as one-off events, or payment information can be saved for later use. The API has support for all aspects of a transaction's lifecycle, from initial capture to cancellations and refunds. 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: GCPayments@digitalriver.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Owner
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-10-19T17:19:19.800Z")
public class Owner   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("email")
  private String email = null;

  public Owner name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The owner's name.
   * @return name
  **/
  @ApiModelProperty(value = "The owner's name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Owner email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The owner's email address.
   * @return email
  **/
  @ApiModelProperty(value = "The owner's email address.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Owner owner = (Owner) o;
    return Objects.equals(this.name, owner.name) &&
        Objects.equals(this.email, owner.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, email);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Owner {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

