package com.gachon.swdm.ths.web.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gachon.swdm.ths.web.bean.Course;
import com.gachon.swdm.ths.web.bean.Takes;
import com.gachon.swdm.ths.web.dao.interfac.CourseDAO;

@Repository("courseDAO") 
public class CourseDAOImpl implements CourseDAO{

	@Autowired
	private SqlSession sqlSession;
	
	private static final Logger logger = LoggerFactory.getLogger(CourseDAOImpl.class);
	
	private static final String NS = "com.gachon.swdm.ths.web.bean.Course.";

	@Override
	public List<Course> getCourseBytime(Course course) {

		return sqlSession.selectList(NS+"getCourseByTime", course);
	}

	@Override
	public List<Course> getCourseByDepartment(Course course) {
	
		return sqlSession.selectList(NS+"getCourseByDepartment",course);
	}

	@Override
	public List<Course> getCourseByUser(Takes takes) {
		
		return sqlSession.selectList(NS+"getCourseByUser",takes);
	}

	@Override
	public void takeCourse(Course course) {
		
		sqlSession.update(NS+"takeCourse", course);
	}

	@Override
	public Course getCourse(Course course) {
		
		return sqlSession.selectOne(NS+"getCourse", course);
	}

	@Override
	public void dropCourse(Course course) {

		sqlSession.update(NS+"dropCourse", course);
		
	}

	
	
	
	
	
}
