package net.dainco.module.user.domain.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Registration form for a new user.
 */
@ApiModel
public class UserRegistrationDto {
  @ApiModelProperty(required = true)
  private String fullName;

  @ApiModelProperty(required = true)
  private String email;

  private String phoneNumber;

  @ApiModelProperty(required = true)
  private String password;

  @ApiModelProperty(required = true)
  private String passwordConfirmation;

  private String firstName;

  private String lastName;

  private String addressLine1;

  private String addressLine2;

  private String town;

  private String state;

  private String country;

  private String postCode;

  public UserRegistrationDto() {
    // Intentionally empty.
  }

  public UserRegistrationDto(String fullName, String email, String phoneNumber, String password,
      String passwordConfirmation, String firstName, String lastName, String addressLine1,
      String addressLine2, String town, String state, String country, String postCode) {
    this.fullName = fullName;
    this.email = email;
    this.phoneNumber = phoneNumber;
    this.password = password;
    this.passwordConfirmation = passwordConfirmation;
    this.firstName = firstName;
    this.lastName = lastName;
    this.addressLine1 = addressLine1;
    this.addressLine2 = addressLine2;
    this.town = town;
    this.state = state;
    this.country = country;
    this.postCode = postCode;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getPasswordConfirmation() {
    return passwordConfirmation;
  }

  public void setPasswordConfirmation(String passwordConfirmation) {
    this.passwordConfirmation = passwordConfirmation;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

  public String getTown() {
    return town;
  }

  public void setTown(String town) {
    this.town = town;
  }
}

