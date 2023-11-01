package com.kh.test.user.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kh.test.user.model.dao.UserDAO;
import com.kh.test.user.model.vo.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired	
	private UserDAO dao;

	/** 회원 검색
	 *
	 */
	@Override
	public User searchId(String userId) {
		
		// dao 호출
		return dao.searchId(userId);
	}
	
	
	

}