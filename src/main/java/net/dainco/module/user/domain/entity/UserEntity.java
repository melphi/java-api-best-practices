package net.dainco.module.user.domain.entity;

import net.dainco.module.user.domain.UserPrivate;

/**
 * Represents the object database mapping. It should be enriched with the annotations related to
 * the persistence framework, for example MongoDb, Hibernate, etc.
 */
public class UserEntity implements UserPrivate {
  public static final String COLLECTION_USERS = "users";
  public static final String FIELD_ID = "_id";
  public static final String FIELD_FULL_NAME = "fullName";
  public static final String FIELD_EMAIL = "email";
  public static final String FIELD_PHONE_NUMBER = "phoneNumber";

  private String id;

  private String fullName;

  private String phoneNumber;

  private String email;

  public UserEntity() {
    // Intentionally empty.
  }

  public UserEntity(String id, String fullName, String phoneNumber, String email) {
    this.id = id;
    this.fullName = fullName;
    this.phoneNumber = phoneNumber;
    this.email = email;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
