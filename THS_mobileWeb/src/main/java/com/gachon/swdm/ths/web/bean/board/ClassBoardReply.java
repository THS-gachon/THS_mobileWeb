package com.gachon.swdm.ths.web.bean.board;

public class ClassBoardReply extends Reply{
	
	
	private int id_course;
	private int year;
	private int semester;
	private int board_type;
	private String name_writer;
	//primary key(year, semester, id_course, board_type, board_date, board_writer, date_written, id_user)
	
	
	
	public int getId_course() {
		return id_course;
	}
	public void setId_course(int id_course) {
		this.id_course = id_course;
	}
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
	public int getBoard_type() {
		return board_type;
	}
	public void setBoard_type(int board_type) {
		this.board_type = board_type;
	}
	public String getName_writer() {
		return name_writer;
	}
	public void setName_writer(String name_writer) {
		this.name_writer = name_writer;
	}



	

}
