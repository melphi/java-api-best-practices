package net.dainco.module.user.domain.dto;

import io.swagger.annotations.ApiModel;
import net.dainco.module.user.domain.UserPrivate;

/**
 * Returns user private information from the Rest controller.
 */
@ApiModel
public class UserPrivateDto implements UserPrivate {
  private String id;

  private String email;

  private String fullName;

  private String phoneNumber;

  public UserPrivateDto() {
    // Intentionally empty.
  }

  public UserPrivateDto(UserPrivate user) {
    this(user.getId(), user.getEmail(), user.getFullName(), user.getPhoneNumber());
  }

  public UserPrivateDto(String id, String email, String fullName, String phoneNumber) {
    this.id = id;
    this.email = email;
    this.fullName = fullName;
    this.phoneNumber = phoneNumber;
  }

  @Override
  public String getId() {
    return id;
  }

  @Override
  public String getFullName() {
    return this.fullName;
  }

  @Override
  public String getPhoneNumber() {
    return this.phoneNumber;
  }

  @Override
  public String getEmail() {
    return this.email;
  }
}
