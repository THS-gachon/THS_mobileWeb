package com.gachon.swdm.ths.web.bean;

public class Course {
	private int id_course;
	private int year;
	private int semester;
	private String title;
	private String dept_name;
	private int credits;


	private String building;
	private String room_number;
	private String time;
	private int maxNum;
	private int currentNum;
	
	private User professor;
	
	private int num_weeks;
	private int times;
	
	//primary key(year, semester, id_course)


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




	public int getId_course() {
		return id_course;
	}


	public void setId_course(int id_course) {
		this.id_course = id_course;
	}


	public String getBuilding() {
		return building;
	}


	public void setBuilding(String building) {
		this.building = building;
	}


	public String getRoom_number() {
		return room_number;
	}


	public void setRoom_number(String room_number) {
		this.room_number = room_number;
	}


	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}


	public int getMaxNum() {
		return maxNum;
	}


	public void setMaxNum(int maxNum) {
		this.maxNum = maxNum;
	}


	public int getCurrentNum() {
		return currentNum;
	}


	public void setCurrentNum(int currentNum) {
		this.currentNum = currentNum;
	}


	public int getSemester() {
		return semester;
	}


	public void setSemester(int semester) {
		this.semester = semester;
	}


	public User getProfessor() {
		return professor;
	}


	public void setProfessor(User professor) {
		this.professor = professor;
	}


	public int getNum_weeks() {
		return num_weeks;
	}


	public void setNum_weeks(int num_weeks) {
		this.num_weeks = num_weeks;
	}


	public int getTimes() {
		return times;
	}


	public void setTimes(int times) {
		this.times = times;
	}

}
