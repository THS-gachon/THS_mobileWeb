package com.gachon.swdm.ths.web.bean;

public class Time_slot {
	//primary key (time_slot_id)
	
	private int time_slot_id;
	private int day;
	private int start_time;
	private int end_time;
	
	public Time_slot(){
		
	}
	
	public int getTime_slot_id() {
		return time_slot_id;
	}
	public void setTime_slot_id(int time_slot_id) {
		this.time_slot_id = time_slot_id;
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

}
