package net.dainco.module.user.exception;

import net.dainco.module.user.util.UserConstants;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * The user was not found.
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {
  public UserNotFoundException() {
    super(UserConstants.ERROR_USER_NOT_FOUND);
  }

  public UserNotFoundException(String message) {
    super(message);
  }
}
