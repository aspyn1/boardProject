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
	
	// index.jsp의 form 태그 액션을 아래 메소드에 연결
	@GetMapping("/selectUser")
	public String searchId(String userId, Model model) {

		// userId를 가지고 dao까지 가서 조회하여 유저 검색 결과를 user에 저장
		User user = service.searchId(userId);

		// 저장된 user에서 userId를 가져와 userId에 저장
		model.addAttribute("user", user);

		if(userId != null) { // 반환되는 userId가 있을때

			return "searchSucess";
			//searchSucess jsp로 이동

		}else {

			return "searchFail";
			//searchFail jsp로 이동
		}

	}



}