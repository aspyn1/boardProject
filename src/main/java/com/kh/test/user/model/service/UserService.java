package com.kh.test.user.model.service;

import com.kh.test.user.model.vo.User;

public interface UserService {

	/** 회원 검색(회원번호로)
	 * @param userNo
	 * @return
	 */
	User searchUser(String userNo);


}