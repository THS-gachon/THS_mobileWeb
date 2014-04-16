package com.gachon.swdm.ths.web.service.database;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gachon.swdm.ths.web.bean.Course;
import com.gachon.swdm.ths.web.bean.Takes;
import com.gachon.swdm.ths.web.dao.interfac.CourseDAO;
import com.gachon.swdm.ths.web.dao.interfac.TakesDAO;

@Service(value="courseService")
public class CourseServiceImpl implements CourseService{

	@Autowired
	@Qualifier("courseDAO")
	private CourseDAO courseDAO;
	
	@Autowired
	@Qualifier("takesDAO")
	private TakesDAO takesDAO;
	
	@Override
	@Transactional
	public List<Course> getCourseBytime(Course course) {
		// TODO Auto-generated method stub
		return courseDAO.getCourseBytime(course);
	}

	@Override
	@Transactional
	public List<Course> getCourseByDepartment(Course course) {
		// TODO Auto-generated method stub
		return courseDAO.getCourseByDepartment(course);
	}

	@Override
	@Transactional
	public List<Course> getCourseByUser(Takes takes) {
		// TODO Auto-generated method stub
		return courseDAO.getCourseByUser(takes);
	}

	@Override
	@Transactional(rollbackFor = UnsupportedOperationException.class)
	public void takeCourse(Course course, Takes takes) throws UnsupportedOperationException {

		Course tmpCourse = new Course();
		Course tmpResultCourse;
		
		courseDAO.takeCourse(course);
		
		tmpCourse.setId_course(takes.getId_course());
		tmpCourse.setYear(takes.getYear());
		tmpCourse.setSemester(takes.getSemester());
		
		tmpResultCourse=courseDAO.getCourse(course);
		
		if(tmpResultCourse.getCurrentNum()>tmpResultCourse.getMaxNum())
			throw new UnsupportedOperationException("full");
		
		takesDAO.insertTakes(takes);
	}

	@Override
	@Transactional
	public Course getCourse(Course course) {
		// TODO Auto-generated method stub
		return courseDAO.getCourse(course);
	}

	@Override
	@Transactional
	public void dropCourse(Course course, Takes takes)
			throws UnsupportedOperationException {
		
		
		courseDAO.dropCourse(course);
		
		takesDAO.deleteTakes(takes);
		
	}

}
