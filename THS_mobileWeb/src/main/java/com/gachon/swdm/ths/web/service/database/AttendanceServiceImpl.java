package com.gachon.swdm.ths.web.service.database;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.gachon.swdm.ths.web.bean.Attendance;
import com.gachon.swdm.ths.web.dao.interfac.AttendanceDAO;

@Service(value="attendanceService")
public class AttendanceServiceImpl implements AttendanceService{
	
	@Autowired
	@Qualifier("attendanceDAO")
	private AttendanceDAO attendanceDAO;
	
	
	@Override
	public List<Attendance> getAll(Attendance attendance) {
		
		
		return attendanceDAO.getAll(attendance);
	}

	@Override
	public List<Attendance> getTodayAttendance(Attendance attendance) {
		
		return attendanceDAO.getTodayAttendance(attendance);
	}

	@Override
	public List<Attendance> getAllByStudent(Attendance attendance) {
		return attendanceDAO.getAllByStudent(attendance);
	}

	@Override
	public void saveAttendance(Attendance attendance) {
		attendanceDAO.saveAttendance(attendance);
	}

	@Override
	public void updateAttendance(Attendance attendance) {
		attendanceDAO.updateAttendance(attendance);
	}

}
