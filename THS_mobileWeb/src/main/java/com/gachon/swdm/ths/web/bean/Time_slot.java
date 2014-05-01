package com.gachon.swdm.ths.web.bean;


public class Time_slot {
	//primary key (day, time_slot)
	private String time_slot;
	private int day;
	private int start_time;
	private int end_time;
	
	public Time_slot(){
		
	}
	

	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getStart_time() {
		return start_time;
	}
	public void setStart_time(int start_time) {
		this.start_time = start_time;
	}
	public int getEnd_time() {
		return end_time;
	}
	public void setEnd_time(int end_time) {
		this.end_time = end_time;
	}


	public String getTime_slot() {
		return time_slot;
	}


	public void setTime_slot(String time_slot) {
		this.time_slot = time_slot;
	}

}
