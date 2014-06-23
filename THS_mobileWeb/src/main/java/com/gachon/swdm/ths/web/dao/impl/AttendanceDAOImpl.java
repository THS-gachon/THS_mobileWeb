package com.gachon.swdm.ths.web.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gachon.swdm.ths.web.bean.Attendance;
import com.gachon.swdm.ths.web.dao.interfac.AttendanceDAO;

@Repository("attendanceDAO")
public class AttendanceDAOImpl implements AttendanceDAO{

	@Autowired
	private SqlSession sqlSession;
	private static final Logger logger = LoggerFactory.getLogger(ClassBoardDAOImpl.class);
	
	private static final String NS = "com.gachon.swdm.ths.web.bean.Attendance.";

	
	@Override
	public List<Attendance> getAll(Attendance attendance) {
		
		return sqlSession.selectList(NS+"getAll", attendance);
	}

	@Override
	public List<Attendance> getTodayAttendance(Attendance attendance) {
		
		return sqlSession.selectList(NS+"getTodayAttendance",attendance);
	}

	@Override
	public List<Attendance> getAllByStudent(Attendance attendance) {
	
		return sqlSession.selectList(NS+"getAllByStudent",attendance);
	}

	@Override
	public void saveAttendance(Attendance attendance) {
		
		sqlSession.insert(NS+"saveAttendance", attendance);
	}

	@Override
	public void updateAttendance(Attendance attendance) {

		sqlSession.update(NS+"updateAttendance", attendance);
		
	}

}
