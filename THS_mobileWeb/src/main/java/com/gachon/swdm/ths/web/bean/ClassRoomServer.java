package com.gachon.swdm.ths.web.bean;

public class ClassRoomServer {
	
	private int year;
	private int semester;	
	private int id_course;
	private boolean isOnline;
	private String ip;
	private long time_recentOnline;
	//primary key (year,semester, id_course)
	
	
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}


	
	public long getTime_recentOnline() {
		return time_recentOnline;
	}
	public void setTime_recentOnline(long time_recentOnline) {
		this.time_recentOnline = time_recentOnline;
	}
	public int getId_course() {
		return id_course;
	}
	public void setId_course(int id_course) {
		this.id_course = id_course;
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
	public boolean isOnline() {
		return isOnline;
	}
	public void setOnline(boolean isOnline) {
		this.isOnline = isOnline;
	}


}
