package net.dainco.module.user.exception;

import net.dainco.module.common.exception.BadRequestException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * User registration exception.
 */
@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class UserRegistrationException extends BadRequestException {
  public UserRegistrationException(String message) {
    super(message);
  }

  public UserRegistrationException(String message, Throwable e) {
    super(message, e);
  }
}
