package com.gachon.swdm.ths.web.bean;

public class Takes {
	//primary key(persionId, courseId, sec_id, semester, year)
	/*
	 create table takes(
	 	id_student varchar(40),
	 	year tinyInt,
	 	semester tinyInt,
	 	id_course integer,
	 	grade float,
	 	primary key(id_student, year, semester, id_course),
	 	foreign key(id_student) references user(id_login),
	 	foreign key(year, semester, id_course) references course(year,semester,id_course),
	 	INDEX index1 (year, semester, id_course),
	 	INDEX index2 (id_student, year, semester)
	 );
	 
	 */
	private String id_student;
	private int id_course;
	private int semester;
	private int year;
	private int grade;
	
	public Takes(){
		
	}

	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}



	public int getId_course() {
		return id_course;
	}

	public void setId_course(int id_course) {
		this.id_course = id_course;
	}

	public String getId_student() {
		return id_student;
	}

	public void setId_student(String id_student) {
		this.id_student = id_student;
	}

}
