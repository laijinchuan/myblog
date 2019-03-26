package com.ssm.service.imp;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssm.dao.UserDao;
import com.ssm.entity.User;
import com.ssm.service.UserService;

@Service
public class userServiceImp implements UserService {
	@Resource
	private UserDao userDao;

	@Override
	public boolean login(String username, String password) {
		User user = userDao.getUser(username, password);
		if (user != null)
			return true;
		return false;
	}

	@Override
	public int updateUserPassword(String username, String password) {
		int updateUserPassword = userDao.updateUserPassword(username, password);
		int i = 1 / 0;
		return updateUserPassword;
	}

	@Override
	public User getUser(String username, String password) {
		User user = userDao.getUser(username, password);
		if (user != null) {
			return user;
		}
		return null;
	}

}
