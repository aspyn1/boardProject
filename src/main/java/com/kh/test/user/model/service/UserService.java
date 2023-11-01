package com.kh.test.user.model.service;

import com.kh.test.user.model.vo.User;

public interface UserService {

	/** 회원 검색
	 * @param userId
	 * @return
	 */
	User searchId(String userId);


}