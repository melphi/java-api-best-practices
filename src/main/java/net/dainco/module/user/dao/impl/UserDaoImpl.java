package net.dainco.module.user.dao.impl;

import com.google.common.collect.ImmutableList;
import net.dainco.module.common.dao.AbstractDao;
import net.dainco.module.user.dao.UserDao;
import net.dainco.module.user.domain.UserPrivate;
import net.dainco.module.user.domain.UserPublic;
import net.dainco.module.user.domain.dto.UserRegistrationDto;
import net.dainco.module.user.domain.entity.UserEntity;
import net.dainco.module.user.exception.UserNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * The user dao implementation.
 */
@Component
public class UserDaoImpl extends AbstractDao<UserEntity> implements UserDao {
  @Override
  public UserPrivate createUser(UserRegistrationDto userRegistration) {
    // TODO: Implement this method.
    throw new IllegalArgumentException("Not yet implemented");
  }

  @Override
  public Collection<UserPublic> findUsersByCriteria(
      String fullName, Integer pageSize, Integer pageNum) {
    // TODO: Implement this method.
    return ImmutableList.of();
  }

  @Override
  public long countUsersByCriteria(String fullName) {
    // TODO: Implement this method.
    return 0;
  }

  @Override
  public UserPrivate getUserById(String id) throws UserNotFoundException {
    // TODO: Implement this method.
    throw new UserNotFoundException();
  }
}
