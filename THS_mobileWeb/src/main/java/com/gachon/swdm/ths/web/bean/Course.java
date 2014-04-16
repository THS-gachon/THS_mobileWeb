package com.gachon.swdm.ths.web.bean;

public class Course {
	//primary key(course_id)//문제 필요
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
	
	/*
	 * 수강생, 정원, 강의실, 시간,
	 * 
	 */
	
	/*//
	 create table course(
	 	id_course integer,
	 	year integer,
	 	semester tinyInt,
	 	title varchar(60),
	 	dept_name varchar(40),
	 	building varchar(20),
	 	room_number varchar(8),
	 	credits tinyInt,
	 	time_slot varchar(16),
	 	currentNum integer,
	 	maxNum integer,
	 
	 	
	 	primary key(year,semester,id_course),
	 	foreign key(dept_name) references department(dept_name),
	 	foreign key(building, room_number) references class_room (building, room_number),
	 	INDEX index1(year, semester, dept_name, id_course)
	 )
	 
	 insert into class_room (building, room_number, capacity) values('새롬관', '304', 40);
	 insert into course (year, semester, id_course,title,dept_name,building,room_number, credits, time_slot,currentNum,maxNum)
	 values(2014 , 1, 10622001, '기술경영', '소프트웨어 설계 경영학과', '새롬관', '304', 3, '1B,2B', 0, 4);
	 insert into class_room (building, room_number, capacity) values('새롬관', '413', 40);
	 insert into course (year, semester, id_course,title,dept_name,building,room_number, credits, time_slot,currentNum,maxNum)
	 values(2014 , 1, 06480001, '데이터마이닝', '소프트웨어 설계 경영학과', '새롬관', '413', 3, '2E,4D', 0, 4);
	
	 insert into course (year, semester, id_course,title,dept_name,building,room_number, credits, time_slot,currentNum,maxNum)
	 values(2014 , 1, 09031001, '멀티미디어및실습', '소프트웨어 설계 경영학과', '새롬관', '413', 3, '35,36,37,38', 0, 4);
	 
	 insert into course (year, semester, id_course,title,dept_name,building,room_number, credits, time_slot,currentNum,maxNum)
	 values(2014 , 1, 11438001, '졸업작품3', '소프트웨어 설계 경영학과', '새롬관', '304', 3, '39,310', 0, 4);
	 
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


}
