package com.gachon.swdm.ths.web.dao.impl;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gachon.swdm.ths.web.bean.Takes;
import com.gachon.swdm.ths.web.bean.board.SchoolBoard;
import com.gachon.swdm.ths.web.dao.interfac.TakesDAO;

@Repository("takesDAO") 
public class TakesDAOImpl implements TakesDAO{

	@Autowired
	private SqlSession sqlSession;
	
	private static final Logger logger = LoggerFactory.getLogger(TakesDAOImpl.class);
	
	private static final String NS = "com.gachon.swdm.ths.web.bean.Takes.";

	

	@Override
	public void insertTakes(Takes takes) {
		// TODO Auto-generated method stub
		sqlSession.insert(NS+"insertTakes", takes);
	}



	@Override
	public void deleteTakes(Takes takes) {
		sqlSession.delete(NS+"deleteTakes", takes);
	}



	@Override
	public Takes getTakesInClass(Takes takes) {
		return sqlSession.selectOne("getTakesInClass", takes);
		
	}
	
	
	
	
}
