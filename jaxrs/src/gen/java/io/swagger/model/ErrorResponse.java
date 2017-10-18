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
import java.util.ArrayList;
import java.util.List;

/**
 * ErrorResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-10-18T15:01:04.059Z")
public class ErrorResponse   {
  @JsonProperty("errorCode")
  private String errorCode = null;

  @JsonProperty("errorMessages")
  private List<String> errorMessages = new ArrayList<String>();

  public ErrorResponse errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * The code defining the error.
   * @return errorCode
  **/
  @ApiModelProperty(value = "The code defining the error.")
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public ErrorResponse errorMessages(List<String> errorMessages) {
    this.errorMessages = errorMessages;
    return this;
  }

  public ErrorResponse addErrorMessagesItem(String errorMessagesItem) {
    this.errorMessages.add(errorMessagesItem);
    return this;
  }

   /**
   * Detailed information about the error.
   * @return errorMessages
  **/
  @ApiModelProperty(value = "Detailed information about the error.")
  public List<String> getErrorMessages() {
    return errorMessages;
  }

  public void setErrorMessages(List<String> errorMessages) {
    this.errorMessages = errorMessages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorResponse errorResponse = (ErrorResponse) o;
    return Objects.equals(this.errorCode, errorResponse.errorCode) &&
        Objects.equals(this.errorMessages, errorResponse.errorMessages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, errorMessages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorResponse {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessages: ").append(toIndentedString(errorMessages)).append("\n");
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

