package com.gachon.swdm.ths.web.bean;

public class ClassRoomServer {
	
	private String year;
	private String semester;	
	private String id_course;
	private boolean isOnline;
	private String ip;
	private long time_recentOnline;
	//primary key (year,semester, id_course)
	
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}

	public boolean isOnline() {
		return isOnline;
	}
	public void setOnline(boolean isOnline) {
		this.isOnline = isOnline;
	}
	public String getId_course() {
		return id_course;
	}
	public void setId_course(String id_course) {
		this.id_course = id_course;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public long getTime_recentOnline() {
		return time_recentOnline;
	}
	public void setTime_recentOnline(long time_recentOnline) {
		this.time_recentOnline = time_recentOnline;
	}


}
