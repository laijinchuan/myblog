package com.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.entity.User;
import com.ssm.service.UserService;

@RequestMapping("/view")
@Controller
public class loginController {
	@Autowired
	private UserService userService;

	@RequestMapping("/login")
	public ModelAndView login() {
		boolean login = userService.login("赖金川", "123");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("isSuccess", login);
		modelAndView.setViewName("view/loginSuccess");
		return modelAndView;

	}

	@RequestMapping("/update")
	public ModelAndView selectUser() {
		User user = userService.getUser("赖金川", "123");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("userList", user);
		modelAndView.setViewName("view/update");
		return modelAndView;
	}

	@RequestMapping("/updateUser")
	public ModelAndView updateUser(String password) {
		int updateUserPassword = userService.updateUserPassword("赖金川", password);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("isSuccess", updateUserPassword);
		modelAndView.setViewName("view/updateSuccess");
		return modelAndView;
	}
}
