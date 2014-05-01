package com.gachon.swdm.ths.web.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gachon.swdm.ths.web.bean.ClassRoomServer;
import com.gachon.swdm.ths.web.dao.interfac.ClassRoomServerDAO;


@Repository("classRoomServerDAO")
public class ClassRoomServerDAOImpl implements ClassRoomServerDAO{
	
	@Autowired
	private SqlSession sqlSession;
	private static final Logger logger = LoggerFactory.getLogger(ClassBoardDAOImpl.class);
	
	private static final String NS = "com.gachon.swdm.ths.web.bean.ClassRoomServer.";

	@Override
	public void checkInClassServer(ClassRoomServer classRoomServer) {
		sqlSession.update(NS+"checkInClassServer",classRoomServer);
	}

	@Override
	public void checkOutClassServer(ClassRoomServer classRoomServer) {
		sqlSession.update(NS+"checkOutClassServer", classRoomServer);
	}

	@Override
	public void insertClassServer(ClassRoomServer classRoomServer) {
		sqlSession.insert(NS+"insertClassServer",classRoomServer);
	}

	@Override
	public ClassRoomServer getClassServer(ClassRoomServer classRoomServer) {
		return sqlSession.selectOne(NS+"getClassServer", classRoomServer);
	}
	
	
}
