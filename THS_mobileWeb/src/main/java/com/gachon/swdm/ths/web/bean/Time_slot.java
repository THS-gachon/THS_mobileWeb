package com.gachon.swdm.ths.web.bean;


public class Time_slot {
	//primary key (time_slot_id)
	/*
	 
	 primary key(day, time_slot)
	 
	 
	 CREATE TABLE time_slot(
	 	day tinyInt,
	 	time_slot varchar(2),
	 	start_time Integer,
	 	duration tinyInt,
	 	primary key(day, time_slot)
	 );
	 
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(1, '1', 0900, 50);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(1, '2', 1000, 50);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(1, '3', 1100, 50);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(1, '4', 1200, 50);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(1, '5', 1300, 50);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(1, '6', 1400, 50);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(1, '7', 1500, 50);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(1, '8', 1600, 50);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(1, '9', 1700, 50);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(1, '10', 1800, 45);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(1, '11', 1850, 45);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(1, '12', 1940, 45);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(1, '13', 2030, 45);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(1, '14', 2120, 45);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(1, '15', 2210, 45);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(1, 'A', 0900, 75);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(1, 'B', 1030, 75);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(1, 'C', 1200, 75);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(1, 'D', 1330, 75);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(1, 'E', 1500, 75);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(1, 'F', 1630, 75);
	 

	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(2, '1', 0900, 50);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(2, '2', 1000, 50);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(2, '3', 1100, 50);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(2, '4', 1200, 50);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(2, '5', 1300, 50);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(2, '6', 1400, 50);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(2, '7', 1500, 50);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(2, '8', 1600, 50);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(2, '9', 1700, 50);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(2, '10', 1800, 45);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(2, '11', 1850, 45);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(2, '12', 1940, 45);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(2, '13', 2030, 45);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(2, '14', 2120, 45);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(2, '15', 2210, 45);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(2, 'A', 0900, 75);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(2, 'B', 1030, 75);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(2, 'C', 1200, 75);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(2, 'D', 1330, 75);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(2, 'E', 1500, 75);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(2, 'F', 1630, 75);
	
	 
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(3, '1', 0900, 50);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(3, '2', 1000, 50);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(3, '3', 1100, 50);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(3, '4', 1200, 50);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(3, '5', 1300, 50);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(3, '6', 1400, 50);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(3, '7', 1500, 50);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(3, '8', 1600, 50);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(3, '9', 1700, 50);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(3, '10', 1800, 45);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(3, '11', 1850, 45);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(3, '12', 1940, 45);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(3, '13', 2030, 45);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(3, '14', 2120, 45);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(3, '15', 2210, 45);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(3, 'A', 0900, 75);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(3, 'B', 1030, 75);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(3, 'C', 1200, 75);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(3, 'D', 1330, 75);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(3, 'E', 1500, 75);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(3, 'F', 1630, 75);
	 
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(4, '1', 0900, 50);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(4, '2', 1000, 50);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(4, '3', 1100, 50);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(4, '4', 1200, 50);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(4, '5', 1300, 50);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(4, '6', 1400, 50);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(4, '7', 1500, 50);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(4, '8', 1600, 50);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(4, '9', 1700, 50);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(4, '10', 1800, 45);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(4, '11', 1850, 45);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(4, '12', 1940, 45);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(4, '13', 2030, 45);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(4, '14', 2120, 45);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(4, '15', 2210, 45);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(4, 'A', 0900, 75);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(4, 'B', 1030, 75);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(4, 'C', 1200, 75);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(4, 'D', 1330, 75);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(4, 'E', 1500, 75);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(4, 'F', 1630, 75);
	 
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(5, '1', 0900, 50);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(5, '2', 1000, 50);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(5, '3', 1100, 50);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(5, '4', 1200, 50);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(5, '5', 1300, 50);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(5, '6', 1400, 50);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(5, '7', 1500, 50);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(5, '8', 1600, 50);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(5, '9', 1700, 50);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(5, '10', 1800, 45);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(5, '11', 1850, 45);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(5, '12', 1940, 45);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(5, '13', 2030, 45);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(5, '14', 2120, 45);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(5, '15', 2210, 45);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(5, 'A', 0900, 75);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(5, 'B', 1030, 75);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(5, 'C', 1200, 75);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(5, 'D', 1330, 75);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(5, 'E', 1500, 75);
	 INSERT INTO time_slot(day, time_slot, start_time, duration) values(5, 'F', 1630, 75);
	 */
	/*
	 */
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
