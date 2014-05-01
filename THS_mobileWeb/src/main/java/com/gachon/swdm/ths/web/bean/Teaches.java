package com.gachon.swdm.ths.web.bean;

public class Teaches {
	
	//primary key(id_professor, year, semester, id_course)

	private String id_professor;
	
	private int id_course;

	private int semester;
	private int year;
	
	private String summary;
	
	
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
	public String getId_professor() {
		return id_professor;
	}
	public void setId_professor(String id_professor) {
		this.id_professor = id_professor;
	}
	public int getId_course() {
		return id_course;
	}
	public void setId_course(int id_course) {
		this.id_course = id_course;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}


}
