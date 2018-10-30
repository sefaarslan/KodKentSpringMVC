package com.kodkent.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kodkent.model.Post;
import com.kodkent.model.User;
import com.kodkent.service.userService;
import com.kodkent.service.userServiceImpl;


@Controller
public class UserController {
	
	
	@Autowired
	private userServiceImpl userService;
	

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(Model model) {
		
		
		List<User> userlist = userService.list();
		model.addAttribute("userList",userlist );

		return "/index";
	}


}
