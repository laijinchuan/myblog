package com.ssm.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.HttpRequestHandler;

public class UserController implements HttpRequestHandler {

	@Override
	public void handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

	/*@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		//调用service 来实现登陆
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
		modelAndView.setViewName("/WEB-INF/view/user.jsp");
		return modelAndView;
	}*/

}
