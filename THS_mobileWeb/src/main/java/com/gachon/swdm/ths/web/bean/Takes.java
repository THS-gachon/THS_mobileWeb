package com.gachon.swdm.ths.web.bean;

public class Takes {
	//primary key(persionId, courseId, sec_id, semester, year)
	private long personId;
	private long courseId;
	private long sec_id;
	private int semester;
	private int year;
	private int grade;
	
	public Takes(){
		
	}
	public long getPersonId() {
		return personId;
	}
	public void setPersonId(long personId) {
		this.personId = personId;
	}
	public long getCourseId() {
		return courseId;
	}
	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}
	public long getSec_id() {
		return sec_id;
	}
	public void setSec_id(long sec_id) {
		this.sec_id = sec_id;
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

}
