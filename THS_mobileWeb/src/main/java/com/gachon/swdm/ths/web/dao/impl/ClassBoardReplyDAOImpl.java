package com.gachon.swdm.ths.web.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gachon.swdm.ths.web.bean.board.ClassBoardReply;
import com.gachon.swdm.ths.web.dao.interfac.ClassBoardReplyDAO;

@Repository("classBoardReplyDAO")
public class ClassBoardReplyDAOImpl implements ClassBoardReplyDAO{
	@Autowired
	private SqlSession sqlSession;
	private static final Logger logger = LoggerFactory.getLogger(ClassBoardDAOImpl.class);
	
	private static final String NS = "com.gachon.swdm.ths.web.bean.board.ClassBoardReply.";

	@Override
	public ClassBoardReply saveClassBoardReply(ClassBoardReply classBoardReply) {
		
		sqlSession.insert(NS+"saveClassBoardReply",classBoardReply);
		return classBoardReply;
	}

	@Override
	public List<ClassBoardReply> getList(ClassBoardReply classBoardReply) {

		return sqlSession.selectList(NS+"getList", classBoardReply);
	}

	@Override
	public void deleteClassBoardReply(ClassBoardReply classBoardReply) {
		
		sqlSession.delete(NS+"deleteClassBoardReply", classBoardReply);
		
	}

}
