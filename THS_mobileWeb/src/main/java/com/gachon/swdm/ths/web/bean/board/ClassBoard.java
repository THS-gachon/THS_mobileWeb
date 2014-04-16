package com.gachon.swdm.ths.web.bean.board;

public class ClassBoard extends Board{
	
	private int id_course;
	private int year;
	private int semester;
	private int type;
	private String name_writer;
	private int start;
	private int end;
	
	/*
	 	private String id_writer;//references User..
	private long date_written;//
	private String title;//varchar(200)
	private String contents;//text
	private String ip;//varchar(40)//ipv6 is considered...
	 */
	/*
	 	CREATE TABLE class_board(
	 		
	 		id_user varchar(40),
	 		date_written bigInt unsigned,
	 		title varchar(200),
	 		contents text,
	 		ip varchar(40),
	 		
	 		
	 		year integer,
	 		semester tinyInt,
	 		id_course integer,
	 		type tinyInt,
	 		readNum integer,
	 		
	 		primary key(year, semester, id_course, type, date_written, id_user),
	 		foreign key(year, semester, id_course) references course(year, semester, id_course),
	 		foreign key(id_user) references user(id_login),
	 		INDEX index1(year, semester, id_course, type, date_written)
	 			 	
	 	);
	 */
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public int getId_course() {
		return id_course;
	}
	public void setId_course(int id_course) {
		this.id_course = id_course;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getName_writer() {
		return name_writer;
	}
	public void setName_writer(String name_writer) {
		this.name_writer = name_writer;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	

}