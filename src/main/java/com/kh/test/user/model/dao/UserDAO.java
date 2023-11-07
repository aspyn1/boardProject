package com.kh.test.user.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.kh.test.user.model.vo.User;

@Repository
public class UserDAO {

	@Autowired
	private SqlSessionTemplate sqlSession;

	/** 회원 검색(회원번호로)
	 * @param userNo
	 * @return
	 */
	public User searchUser(String userNo) {
		
		return sqlSession.selectOne("userMapper.selectUser", userNo);
	}



}