package com.gachon.swdm.ths.web.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gachon.swdm.ths.web.bean.User;
import com.gachon.swdm.ths.web.dao.interfac.UserDAO;

@Repository("userDAO")
public class UserDAOImpl implements UserDAO{

	@Autowired
	private SqlSession sqlSession;
	
	private static final Logger logger = LoggerFactory.getLogger(UserDAOImpl.class);
	
	private static final String NS = "com.gachon.swdm.ths.web.bean.User.";
	
	
	@Override
	public List<User> getUsers() {
		//
		
		return sqlSession.selectList(NS+"getUsers");
	}

	@Override
	public User getUser(String loginId) {
		//
		
		return sqlSession.selectOne(NS+"getUser",loginId);
	}

	@Override
	public User saveUser(User user) {
		//
		
		 sqlSession.insert(NS+"saveUser", user);
		 return user;
	}

	@Override
	public User updateUser(User user) {
		//
		
		sqlSession.update(NS+"updateUser", user);
		return user;
	}

	@Override
	public void deleteUser(String loginId) {
		//
		
		sqlSession.delete(NS+"deleteUser", loginId);
	}


}
