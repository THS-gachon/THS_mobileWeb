package com.gachon.swdm.ths.web.bean;

public class Course {
	//primary key(course_id)//문제 필요
	private long course_id;
	private String title;
	private String dept_name;
	private int credits;
	
	public Course()
	{
		
	}
	
	public long getCourse_id() {
		return course_id;
	}
	public void setCourse_id(long course_id) {
		this.course_id = course_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}


}
