package com.gachon.swdm.ths.web.service.database;

import java.util.List;

import com.gachon.swdm.ths.web.bean.Course;
import com.gachon.swdm.ths.web.bean.Takes;

public interface CourseService {
	public List<Course> getCourseBytime (Course course);
	public List<Course> getCourseByDepartment (Course course);
	public List<Course> getCourseByUser (Takes takes);
	public void takeCourse (Course course, Takes takes) throws UnsupportedOperationException;
	public void dropCourse (Course course, Takes takes) throws UnsupportedOperationException;
	public Course getCourse(Course course);
	public List<Course> getCourseWithProfessor(Takes takes);
}
