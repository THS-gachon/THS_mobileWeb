package com.gachon.swdm.ths.web.dao.interfac;

import java.util.List;

import com.gachon.swdm.ths.web.bean.Attendance;

public interface AttendanceDAO {
	
	/**
	 * @param attendance
	 * The attributes(year,semester,id_course) must be filled.
	 * 
	 * @return the attendance list.
	 */
	public List<Attendance> getAll(Attendance attendance);
	

	/**
	 * @param attendance
	 * The attributes(year,semester,id_course, weeks, days) must be filled.
	 *
	 * @return
	 */
	public List<Attendance> getTodayAttendance(Attendance attendance);
	
	
	/**
	 * 
	 * @param attendance
	 * The attributes(year,semester,id_course, weeks, id_student) must be filled.
	 * 
	 * @return the result list.
	 */
	public List<Attendance> getAllByStudent(Attendance attendance);
	
		
	/**
	 * 
	 * @param attendance whose all attributes except (name, dept_name) must be filled.
	 */
	public void saveAttendance (Attendance attendance);
	
	
	/**
	 * 
	 * @param attendance whose all attributes except (name, dept_name) must be filled.
	 */
	public void updateAttendance (Attendance attendance);
} 
