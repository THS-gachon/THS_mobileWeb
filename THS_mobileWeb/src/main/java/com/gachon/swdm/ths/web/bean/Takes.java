package com.gachon.swdm.ths.web.bean;

public class Takes {
	//primary key(id_student, year, semester, id_course)

	private String id_student;
	private int id_course;
	private int semester;
	private int year;
	private float grade;
	
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

	public float getGrade() {
		return grade;
	}

	public void setGrade(float grade) {
		this.grade = grade;
	}

}
