package com.ssm.service;

import com.ssm.entity.User;

public interface UserService {
	public boolean login(String username, String password);

	public int updateUserPassword(String username, String password);

	public User getUser(String username, String password);
}
