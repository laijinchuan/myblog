package com.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.entity.User;

@Controller
public class UserController2 {
	@RequestMapping("/queryUser2")
	public ModelAndView queryUser() throws Exception {
		List<User> userList = new ArrayList<User>();
		User user1 = new User();
		user1.setUsername("赖金川");
		user1.setPassword("qwer");
		User user2 = new User();
		user2.setUsername("陈东");
		user2.setPassword("成成");
		userList.add(user1);
		userList.add(user2);
		//定义modelandview
		ModelAndView modelAndView = new ModelAndView();
		//相当于attraction
		modelAndView.addObject("userList", userList);
		modelAndView.setViewName("view/user");
		return modelAndView;
	}
}
