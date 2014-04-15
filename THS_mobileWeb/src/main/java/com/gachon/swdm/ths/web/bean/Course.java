package com.gachon.swdm.ths.web.bean;

public class Course {
	//primary key(course_id)//문제 필요
	private int id_course;
	private int year;
	private int semeseter;
	private String title;
	private String dept_name;
	private int credits;
	
	private String building;
	private String room_number;
	private String time;
	
	
	/*
	 * 수강생, 정원, 강의실, 시간,
	 * 
	 */
	
	/*//alter 필요..
	 create table course(
	 	id_course integer,
	 	year tinyInt,
	 	semester tinyInt,
	 	title varchar(60),
	 	dept_name varchar(40),
	 	building varchar(20),
	 	room_number varchar(8),
	 	credits tinyInt,
	 	time_slot varchar(15),
	 	
	 	primary key(year,semester,id_course),
	 	foreign key(dept_name) references department(dept_name),
	 	foreign key(building, room_number) references class_room (building, room_number),
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


}
