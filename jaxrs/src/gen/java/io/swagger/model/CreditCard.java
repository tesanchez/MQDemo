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
 * CreditCard
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-10-18T15:06:03.607Z")
public class CreditCard   {
  @JsonProperty("number")
  private String number = null;

  @JsonProperty("expirationMonth")
  private Integer expirationMonth = null;

  @JsonProperty("expirationYear")
  private Integer expirationYear = null;

  @JsonProperty("cvv")
  private String cvv = null;

  @JsonProperty("brand")
  private String brand = null;

  @JsonProperty("lastFourDigits")
  private String lastFourDigits = null;

  public CreditCard number(String number) {
    this.number = number;
    return this;
  }

   /**
   * The card number, specified as a string with no spaces or separators.
   * @return number
  **/
  @ApiModelProperty(required = true, value = "The card number, specified as a string with no spaces or separators.")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public CreditCard expirationMonth(Integer expirationMonth) {
    this.expirationMonth = expirationMonth;
    return this;
  }

   /**
   * One to two digits representing the expiration month.
   * @return expirationMonth
  **/
  @ApiModelProperty(required = true, value = "One to two digits representing the expiration month.")
  public Integer getExpirationMonth() {
    return expirationMonth;
  }

  public void setExpirationMonth(Integer expirationMonth) {
    this.expirationMonth = expirationMonth;
  }

  public CreditCard expirationYear(Integer expirationYear) {
    this.expirationYear = expirationYear;
    return this;
  }

   /**
   * Four digits representing the expiration year.
   * @return expirationYear
  **/
  @ApiModelProperty(required = true, value = "Four digits representing the expiration year.")
  public Integer getExpirationYear() {
    return expirationYear;
  }

  public void setExpirationYear(Integer expirationYear) {
    this.expirationYear = expirationYear;
  }

  public CreditCard cvv(String cvv) {
    this.cvv = cvv;
    return this;
  }

   /**
   * The card verification code
   * @return cvv
  **/
  @ApiModelProperty(required = true, value = "The card verification code")
  public String getCvv() {
    return cvv;
  }

  public void setCvv(String cvv) {
    this.cvv = cvv;
  }

   /**
   * The brand (e.g. Visa, MasterCard, Amercian Express, etc.).
   * @return brand
  **/
  @ApiModelProperty(value = "The brand (e.g. Visa, MasterCard, Amercian Express, etc.).")
  public String getBrand() {
    return brand;
  }

   /**
   * The last four digits of the card number.
   * @return lastFourDigits
  **/
  @ApiModelProperty(value = "The last four digits of the card number.")
  public String getLastFourDigits() {
    return lastFourDigits;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditCard creditCard = (CreditCard) o;
    return Objects.equals(this.number, creditCard.number) &&
        Objects.equals(this.expirationMonth, creditCard.expirationMonth) &&
        Objects.equals(this.expirationYear, creditCard.expirationYear) &&
        Objects.equals(this.cvv, creditCard.cvv) &&
        Objects.equals(this.brand, creditCard.brand) &&
        Objects.equals(this.lastFourDigits, creditCard.lastFourDigits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, expirationMonth, expirationYear, cvv, brand, lastFourDigits);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditCard {\n");
    
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    expirationMonth: ").append(toIndentedString(expirationMonth)).append("\n");
    sb.append("    expirationYear: ").append(toIndentedString(expirationYear)).append("\n");
    sb.append("    cvv: ").append(toIndentedString(cvv)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    lastFourDigits: ").append(toIndentedString(lastFourDigits)).append("\n");
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

