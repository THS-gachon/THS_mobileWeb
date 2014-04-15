package com.gachon.swdm.ths.web.dao.impl;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gachon.swdm.ths.web.bean.User;
import com.gachon.swdm.ths.web.bean.board.SchoolBoard;
import com.gachon.swdm.ths.web.dao.interfac.SchoolBoardDAO;

@Repository("schoolBoardDAO") 
public class SchoolBoardDAOImpl implements SchoolBoardDAO{

	@Autowired
	private SqlSession sqlSession;
	
	private static final Logger logger = LoggerFactory.getLogger(SchoolBoardDAOImpl.class);
	
	private static final String NS = "com.gachon.swdm.ths.web.bean.board.SchoolBoard.";

	@Override
	public List<SchoolBoard> getSchoolBoardList(HashMap<String, Integer> hashmap) {


		return sqlSession.selectList(NS+"getSchoolBoardList", hashmap);
	}

	@Override
	public SchoolBoard getSchoolBoard(HashMap<String, Object> hashmap) {


		return sqlSession.selectOne(NS+"getSchoolBoard",hashmap);
	}

	@Override
	public SchoolBoard saveSchoolBoard(SchoolBoard schoolBoard) {
		
		sqlSession.insert(NS+"saveSchoolBoard", schoolBoard);
		return schoolBoard;
	}

	@Override
	public SchoolBoard updateSchoolBoard(SchoolBoard schoolBoard) {
		
		
		sqlSession.update(NS+"updateSchoolBoard", schoolBoard);
		return schoolBoard;
	}

	@Override
	public void deleteSchoolBoard(HashMap<String, Object> hashmap) {

		sqlSession.delete(NS+"deleteSchoolBoard", hashmap);
	}

	@Override
	public int getCount(int type) {
		return sqlSession.selectOne(NS+"getCount", type);
	}

	@Override
	public void updateReadNum(HashMap<String,Object>hashmap) {
		sqlSession.update(NS+"updateReadNum", hashmap);
	}
	
	
	
	
}
