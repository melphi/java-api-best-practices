package net.dainco.module.user.service;

import net.dainco.module.common.domain.PaginatedValuesDto;
import net.dainco.module.user.domain.dto.UserPublicDto;
import net.dainco.module.user.domain.dto.UserRegistrationDto;
import net.dainco.module.user.domain.dto.UserRegistrationResponseDto;
import net.dainco.module.user.exception.UserNotFoundException;
import net.dainco.module.user.exception.UserRegistrationException;

public interface UserService {
  UserRegistrationResponseDto registerUser(UserRegistrationDto userRegistrationDto)
			throws UserRegistrationException;

  PaginatedValuesDto<UserPublicDto> findUsersByCriteria(
      String fullName, Integer pageSize, Integer pageNum);

	UserPublicDto getUserById(String userId) throws UserNotFoundException;
}
