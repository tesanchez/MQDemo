package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * InlineResponse200
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-24T15:21:55.022Z")

public class InlineResponse200   {
  @JsonProperty("userUUid")
  private String userUUid = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  public InlineResponse200 userUUid(String userUUid) {
    this.userUUid = userUUid;
    return this;
  }

   /**
   * ID from DB
   * @return userUUid
  **/
  @ApiModelProperty(example = "113a3d8d-ddac-4b0f-9f16-15123512", required = true, value = "ID from DB")
  public String getUserUUid() {
    return userUUid;
  }

  public void setUserUUid(String userUUid) {
    this.userUUid = userUUid;
  }

  public InlineResponse200 email(String email) {
    this.email = email;
    return this;
  }

   /**
   * user email from DB
   * @return email
  **/
  @ApiModelProperty(example = "JK@smartbear.com", required = true, value = "user email from DB")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public InlineResponse200 firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * users first name
   * @return firstName
  **/
  @ApiModelProperty(example = "Jeshtha", required = true, value = "users first name")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public InlineResponse200 lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * users last name
   * @return lastName
  **/
  @ApiModelProperty(example = "Kambli", required = true, value = "users last name")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(this.userUUid, inlineResponse200.userUUid) &&
        Objects.equals(this.email, inlineResponse200.email) &&
        Objects.equals(this.firstName, inlineResponse200.firstName) &&
        Objects.equals(this.lastName, inlineResponse200.lastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userUUid, email, firstName, lastName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    userUUid: ").append(toIndentedString(userUUid)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
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

