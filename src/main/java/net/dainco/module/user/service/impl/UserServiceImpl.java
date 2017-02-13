package net.dainco.module.user.service.impl;

import net.dainco.module.common.domain.PaginatedValuesDto;
import net.dainco.module.common.util.MorePreconditions;
import net.dainco.module.user.dao.UserDao;
import net.dainco.module.user.domain.UserPublic;
import net.dainco.module.user.domain.dto.UserPublicDto;
import net.dainco.module.user.domain.dto.UserRegistrationDto;
import net.dainco.module.user.domain.dto.UserRegistrationResponseDto;
import net.dainco.module.user.exception.UserNotFoundException;
import net.dainco.module.user.exception.UserRegistrationException;
import net.dainco.module.user.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.stream.Collectors;

/**
 * All the business logic is implemented in the service layer. It connects to the dao layer to
 * return data from database. The entity returned should be Dto and not database entity directly,
 * this allow to hide sensitive database fields and customise the output.
 */
@Component
public class UserServiceImpl implements UserService {
	private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
	
	private UserDao userDao;

	@Autowired
	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public UserRegistrationResponseDto registerUser(UserRegistrationDto userRegistrationDto)
			throws UserRegistrationException {
		validateUserRegistration(userRegistrationDto);
		try {
			userDao.createUser(userRegistrationDto);
			return new UserRegistrationResponseDto();
		} catch (Exception e) {
			throw new UserRegistrationException(e.getMessage(), e);
		}
	}

	@Override
	public PaginatedValuesDto<UserPublicDto> findUsersByCriteria(
			String fullName, Integer pageSize, Integer pageNum) {
		MorePreconditions.checkPagination(pageSize, pageNum);
		Collection<UserPublic> entities = userDao.findUsersByCriteria(fullName, pageSize, pageNum);
		Collection<UserPublicDto> values = entities.stream()
				.map(UserPublicDto::new)
				.collect(Collectors.toList());
		boolean hasMore = userDao.countUsersByCriteria(fullName) > pageSize * pageNum;
		return new PaginatedValuesDto<>(values, pageNum, pageSize, hasMore);
	}

	@Override
	public UserPublicDto getUserById(String userId) throws UserNotFoundException {
		MorePreconditions.checkNotNullOrEmptyWithBadRequest(userId);
		return new UserPublicDto(userDao.getUserById(userId));
	}

	private void validateUserRegistration(UserRegistrationDto userRegistration) {
		// TODO: Validation code here.
	}
}
