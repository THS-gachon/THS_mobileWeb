package com.gachon.swdm.ths.web.dao.impl;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gachon.swdm.ths.web.bean.board.SchoolBoardReply;
import com.gachon.swdm.ths.web.dao.interfac.SchoolBoardReplyDAO;

@Repository("schoolBoardReplyDAO")
public class SchoolBoardReplyDAOImpl implements SchoolBoardReplyDAO{

	@Autowired
	private SqlSession sqlSession;
	
	private static final Logger logger = LoggerFactory.getLogger(SchoolBoardDAOImpl.class);
	
	private static final String NS = "com.gachon.swdm.ths.web.bean.board.SchoolBoardReply.";

	@Override
	public List<SchoolBoardReply> getList(HashMap<String, Object> hashmap) {
		
		return sqlSession.selectList(NS+"getList", hashmap);
	}

	@Override
	public SchoolBoardReply saveSchoolBoardReply(
			SchoolBoardReply schoolBoardReply) {

		sqlSession.insert(NS+"saveSchoolBoardReply", schoolBoardReply);
		return schoolBoardReply;
	}

	@Override
	public void deleteSchoolBoardReply(SchoolBoardReply schoolBoardReply) {
		
		sqlSession.delete(NS+"deleteSchoolBoardReply", schoolBoardReply);
	}

	
}
