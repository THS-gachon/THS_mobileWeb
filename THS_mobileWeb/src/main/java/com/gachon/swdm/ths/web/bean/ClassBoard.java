package com.gachon.swdm.ths.web.bean;

public class ClassBoard {
	
	/*
	 * primary key(personId, courseId, type, writtenTime)..
	 * 
	 * foreign key(courseId)
	 * foreign key(personId)
	 * 
	 */ 
	
	private long seq;//auto_increment
	private long personId;
	private long courseId;
	private int type;//공지, 게시판, 자료실...
	private String title;
	private long writtenTime;
	private long readNum;
	private String ip;
	private String contents;
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
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public long getWrittenTime() {
		return writtenTime;
	}
	public void setWrittenTime(long writtenTime) {
		this.writtenTime = writtenTime;
	}
	public long getReadNum() {
		return readNum;
	}
	public void setReadNum(long readNum) {
		this.readNum = readNum;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	

}
