package com.gachon.swdm.ths.web.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gachon.swdm.ths.web.bean.Teaches;
import com.gachon.swdm.ths.web.dao.interfac.TeachesDAO;

@Repository("teachesDAO")
public class TeachesDAOImpl implements TeachesDAO{

	@Autowired
	private SqlSession sqlSession;
	
	private static final Logger logger = LoggerFactory.getLogger(TeachesDAOImpl.class);
	
	private static final String NS = "com.gachon.swdm.ths.web.bean.Teaches.";

	
	@Override
	public Teaches insertTeaches(Teaches teaches) {

		sqlSession.insert(NS+"insertTeaches", teaches);
		return teaches;
	}

	@Override
	public void deleteTeaches(Teaches teaches) {
		
		sqlSession.insert(NS+"deleteTeaches", teaches);
		
	}

	@Override
	public void updateTeaches(Teaches teaches) {
		
		sqlSession.update(NS+"updateTeaches", teaches);	
	}
}
