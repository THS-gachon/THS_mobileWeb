package com.gachon.swdm.ths.web.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gachon.swdm.ths.web.bean.board.ClassBoard;
import com.gachon.swdm.ths.web.dao.interfac.ClassBoardDAO;

@Repository("classBoardDAO")
public class ClassBoardDAOImpl implements ClassBoardDAO{

	@Autowired
	private SqlSession sqlSession;
	private static final Logger logger = LoggerFactory.getLogger(ClassBoardDAOImpl.class);
	
	private static final String NS = "com.gachon.swdm.ths.web.bean.board.ClassBoard.";

	@Override
	public List<ClassBoard> getClassBoardList(ClassBoard classBoardWithLimit) {
		
		return sqlSession.selectList(NS+"getClassBoardList", classBoardWithLimit);
	}

	@Override
	public ClassBoard getClassBoard(ClassBoard classBoard) {
		
		return sqlSession.selectOne(NS+"getClassBoard", classBoard);
	}

	@Override
	public ClassBoard saveClassBoard(ClassBoard classBoard) {
		
		sqlSession.insert(NS+"saveClassBoard", classBoard);
		return classBoard;
	}

	@Override
	public void updateClassBoard(ClassBoard classBoard) {
		
		sqlSession.update(NS+"updateClassBoard", classBoard);
	}

	@Override
	public void updateReadNum(ClassBoard classBoard) {
		
		sqlSession.update(NS+"updateReadNum", classBoard);
		
	}

	@Override
	public void deleteClassBoard(ClassBoard classBoard) {
		
		sqlSession.delete(NS+"deleteClassBoard", classBoard);
		
	}

	@Override
	public int getCount(ClassBoard classBoard) {
	
		return sqlSession.selectOne(NS+"getCount",classBoard);
	}
	
	
}
