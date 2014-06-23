package com.gachon.swdm.ths.web.service.database;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gachon.swdm.ths.web.bean.Course;
import com.gachon.swdm.ths.web.bean.Takes;

import com.gachon.swdm.ths.web.bean.Teaches;
import com.gachon.swdm.ths.web.bean.User;
import com.gachon.swdm.ths.web.dao.interfac.CourseDAO;
import com.gachon.swdm.ths.web.dao.interfac.TakesDAO;
import com.gachon.swdm.ths.web.dao.interfac.UserDAO;

@Service(value="courseService")
public class CourseServiceImpl implements CourseService{

	@Autowired
	@Qualifier("courseDAO")
	private CourseDAO courseDAO;
	
	@Autowired
	@Qualifier("takesDAO")
	private TakesDAO takesDAO;
	

	@Autowired
	@Qualifier("userDAO")
	private UserDAO userDAO;
	
	@Override
	@Transactional
	public List<Course> getCourseBytime(Course course) {
		// 
		return courseDAO.getCourseBytime(course);
	}

	@Override
	@Transactional
	public List<Course> getCourseByDepartment(Course course) {
		// 
		return courseDAO.getCourseByDepartment(course);
	}

	@Override
	@Transactional
	public List<Course> getCourseByUser(Takes takes) {
		// 
		return courseDAO.getCourseByUser(takes);
	}

	@Override
	@Transactional(rollbackFor = {UnsupportedOperationException.class,Exception.class})
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
		// 
		return courseDAO.getCourse(course);
	}

	@Override
	@Transactional
	public void dropCourse(Course course, Takes takes)
			throws UnsupportedOperationException {
		
		
		courseDAO.dropCourse(course);
		
		takesDAO.deleteTakes(takes);
		
	}

	@Override
	@Transactional
	public List<Course> getCourseWithProfessor(Takes takes) {
		
		List<Course> courseList;
		
		courseList = courseDAO.getCourseByUser(takes);
		
		for(Course course : courseList)
		{
			Teaches teaches = new Teaches();
			teaches.setId_course(course.getId_course());
			teaches.setYear(course.getYear());
			teaches.setSemester(course.getSemester());
			User professor = userDAO.getProfessorByCourse(teaches);
			System.out.println(professor.getName());
			course.setProfessor(professor);
		}
		
		return courseList;
	}
/*
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
*/
}
