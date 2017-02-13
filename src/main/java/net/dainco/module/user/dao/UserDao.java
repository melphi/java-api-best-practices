package net.dainco.module.user.dao;

import net.dainco.module.user.domain.UserPrivate;
import net.dainco.module.user.domain.UserPublic;
import net.dainco.module.user.domain.dto.UserRegistrationDto;
import net.dainco.module.user.exception.UserNotFoundException;

import java.util.Collection;

/**
 * A dao interface for User related methods.
 */
public interface UserDao {
  UserPrivate createUser(UserRegistrationDto userRegistration);

  Collection<UserPublic> findUsersByCriteria(
      String fullName, Integer pageSize, Integer pageNum);

  long countUsersByCriteria(String fullName);

  UserPrivate getUserById(String id) throws UserNotFoundException;
}
