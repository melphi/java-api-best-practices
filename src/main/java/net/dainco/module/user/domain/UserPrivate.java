package net.dainco.module.user.domain;

public interface UserPrivate extends UserPublic {
	String getId();

	String getEmail();

	String getFullName();

	String getPhoneNumber();
}
