package net.dainco.module.user.rest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import net.dainco.module.common.domain.PaginatedValuesDto;
import net.dainco.module.user.domain.dto.UserPublicDto;
import net.dainco.module.user.domain.dto.UserRegistrationDto;
import net.dainco.module.user.domain.dto.UserRegistrationResponseDto;
import net.dainco.module.user.exception.UserNotFoundException;
import net.dainco.module.user.exception.UserRegistrationException;
import net.dainco.module.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controllers expose the REST Api. They do not implement business logic but call the service
 * layer to perform the required operations and return JSON responses.
 */
@Api(tags = "users")
@RestController
@RequestMapping(value = "/users")
public class UserController {
  private UserService userService;

  @Autowired
  public UserController(UserService userService) {
    this.userService = userService;
  }

  @ApiOperation(value = "Registers a new user.", tags = "users")
  @RequestMapping(path = "/register", method = RequestMethod.POST)
  public UserRegistrationResponseDto registerUser(
      @RequestBody UserRegistrationDto userRegistrationDto) throws UserRegistrationException {
    return userService.registerUser(userRegistrationDto);
  }

  @ApiOperation(value = "Find users by criteria", tags = "users")
  @RequestMapping(path = "/search", method = RequestMethod.GET)
  public PaginatedValuesDto<UserPublicDto> findUsersByCriteria(
      @RequestParam(value = "fullName") String fullName,
      @RequestParam(value = "pageSize") Integer pageSize,
      @RequestParam(value = "pageNum") Integer pageNum) {
    return userService.findUsersByCriteria(fullName, pageSize, pageNum);
  }
  
  @ApiOperation(value = "Get user by id", tags = "users")
	@RequestMapping(path = "/{userId}", method = RequestMethod.GET)
	public UserPublicDto getUserById(@PathVariable("userId") String userId)
      throws UserNotFoundException {
		return userService.getUserById(userId);
	}  
}
