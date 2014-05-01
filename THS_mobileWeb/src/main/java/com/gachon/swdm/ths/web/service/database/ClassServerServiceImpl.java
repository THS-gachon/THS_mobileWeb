package com.gachon.swdm.ths.web.service.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gachon.swdm.ths.web.bean.ClassRoomServer;
import com.gachon.swdm.ths.web.dao.interfac.ClassRoomServerDAO;


@Service(value="classServerService")
public class ClassServerServiceImpl implements ClassServerService{

	@Autowired
	@Qualifier("classRoomServerDAO")
	ClassRoomServerDAO classServerDAO;
	
	@Override
	@Transactional
	public void checkInClassServer(ClassRoomServer classRoomServer) {
		classServerDAO.checkInClassServer(classRoomServer);
	}
	
	@Override
	@Transactional
	public void checkOutClassServer(ClassRoomServer classRoomServer) {
		classServerDAO.checkOutClassServer(classRoomServer);
	}
	
	@Override
	@Transactional
	public void insertClassServer(ClassRoomServer classRoomServer) {
		classServerDAO.insertClassServer(classRoomServer);
	}

	@Override
	@Transactional
	public ClassRoomServer getClassServer(ClassRoomServer classRoomServer) {
		return classServerDAO.getClassServer(classRoomServer);
	}
}
