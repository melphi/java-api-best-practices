package net.dainco.module.user.domain.dto;

import io.swagger.annotations.ApiModel;
import net.dainco.module.user.domain.UserPublic;

/**
 * Returns user public information from the Rest controller.
 */
@ApiModel
public class UserPublicDto implements UserPublic {
	private String id;

	private String fullName;

	public UserPublicDto() {
		// Intentionally empty.
	}

	public UserPublicDto(UserPublic user) {
		this.id = user.getId();
		this.fullName = user.getFullName();
	}

	public UserPublicDto(String id, String fullName) {
		this.id = id;
		this.fullName = fullName;
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public String getFullName() {
		return fullName;
	}
}
