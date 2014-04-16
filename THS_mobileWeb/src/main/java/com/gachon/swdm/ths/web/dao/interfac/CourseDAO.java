package com.gachon.swdm.ths.web.dao.interfac;

import java.util.List;

import com.gachon.swdm.ths.web.bean.Course;
import com.gachon.swdm.ths.web.bean.Takes;

public interface CourseDAO {
	public List<Course> getCourseBytime (Course course);
	public List<Course> getCourseByDepartment (Course course);
	public List<Course> getCourseByUser (Takes takes);
	public void takeCourse (Course course);
	public Course getCourse(Course course);
	public void dropCourse (Course course);
}
