package com.ssm.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.ssm.entity.User;

@Repository
public interface UserDao {
	public User getUser(@Param("username") String username, @Param("password") String password);

	public int updateUserPassword(@Param("username") String username, @Param("password") String password);
}
