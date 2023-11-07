package com.kh.test.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.kh.test.user.model.service.UserService;
import com.kh.test.user.model.vo.User;

@Controller
public class UserController {

	@Autowired
	private UserService service;
	
	@GetMapping("/searchUser")
	public String searchUser(String userNo, Model model) {

		User user = service.searchUser(userNo);

		model.addAttribute("user", user);

		if(userNo != null) { 

			return "searchSucess";

		}else {

			return "searchFail";
		}

	}



}