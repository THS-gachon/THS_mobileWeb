package com.gachon.swdm.ths.web.bean;

public class Teaches {
	
	//primary key(person id,course_id, sec_id,semester,year)
	private long personId;
	
	private long courseId;
	private int secId;
	private int semester;
	private int year;
	
	public Teaches(){
		
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
	public long getCourseId() {
		return courseId;
	}
	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}
	public long getPersonId() {
		return personId;
	}
	public void setPersonId(long personId) {
		this.personId = personId;
	}
	public int getSecId() {
		return secId;
	}
	public void setSecId(int secId) {
		this.secId = secId;
	}
}
