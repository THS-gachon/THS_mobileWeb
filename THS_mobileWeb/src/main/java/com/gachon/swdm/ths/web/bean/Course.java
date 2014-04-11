package com.gachon.swdm.ths.web.bean;

public class Course {
	//primary key(course_id)//문제 필요
	private int id_course;
	private int year;
	private int semeseter;
	private String title;
	private String dept_name;
	private int credits;
	
	/*
	 create table course(
	 	id_course integer,
	 	year tinyInt,
	 	semester tinyInt,
	 	title varchar(60),
	 	dept_name varchar(40),
	 	credits tinyInt,
	 	primary key(year,semester,id_course),
	 	foreign key(dept_name) references department(dept_name),
	 	INDEX index1(year, semester, id_course)
	 )
	 */
	
	public Course()
	{
		
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

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getSemeseter() {
		return semeseter;
	}

	public void setSemeseter(int semeseter) {
		this.semeseter = semeseter;
	}


	public int getId_course() {
		return id_course;
	}


	public void setId_course(int id_course) {
		this.id_course = id_course;
	}


}
