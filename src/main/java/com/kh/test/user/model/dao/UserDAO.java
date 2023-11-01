package com.kh.test.user.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.kh.test.user.model.vo.User;

@Repository
public class UserDAO {

	@Autowired
	private SqlSessionTemplate sqlSession;

	/** 회원 검색
	 * @param userId
	 * @return
	 */
	public User searchId(String userId) {
		
		// 매퍼에서 userId를 검색해서 회원정보 반환받기
		return sqlSession.selectOne("userMapper.searchId", userId);
	}
	
	
	

}