package com.gachon.swdm.ths.web.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Time {
	String times;
	String[] timeslot;
	int day;
	int startTime, endTime;
	
	/**
	 * 
	 * @param times : all course time
	 */
	public void setTime(String times) {
		this.times = times;
	}
	
	/**
	 * 
	 * @param time : convert time string value into integer value
	 * @return TimeSlot class : class has start time and end time of course
	 */
	public TimeSlot convertTime(String time) {
		TimeSlot slot = new TimeSlot();
		
		if(time.equals("A")) {
			slot.setTimeSlot(900, 1015);
			return slot;
		}
		else if(time.equals("B")) {
			slot.setTimeSlot(1030, 1145);
			return slot;
		}
		else if(time.equals("C")) {
			slot.setTimeSlot(1200, 1315);
			return slot;
		}
		else if(time.equals("D")){
			slot.setTimeSlot(1330, 1445);
			return slot;
		}
		else if(time.equals("E")){
			slot.setTimeSlot(1500, 1615);
			return slot;
		}
		else if(time.equals("F")){
			slot.setTimeSlot(1630, 1745);
			return slot;
		}
		else if(time.equals("1")){
			slot.setTimeSlot(900, 950);
			return slot;
		}
		else if(time.equals("2")){
			slot.setTimeSlot(1000, 1050);
			return slot;
		}
		else if(time.equals("3")){
			slot.setTimeSlot(1100, 1150);
			return slot;
		}
		else if(time.equals("4")){
			slot.setTimeSlot(1200, 1250);
			return slot;
		}
		else if(time.equals("5")){
			slot.setTimeSlot(1300, 1350);
			return slot;
		}
		else if(time.equals("6")){
			slot.setTimeSlot(1400, 1450);
			return slot;
		}
		else if(time.equals("7")){
			slot.setTimeSlot(1500, 1550);
			return slot;
		}
		else if(time.equals("8")){
			slot.setTimeSlot(1600, 1650);
			return slot;
		}
		else if(time.equals("9")){
			slot.setTimeSlot(1700, 1750);
			return slot;
		}
		else if(time.equals("10")){
			slot.setTimeSlot(1800, 1845);
			return slot;
		}
		else if(time.equals("11")){
			slot.setTimeSlot(1850, 1935);
			return slot;
		}
		else if(time.equals("12")){
			slot.setTimeSlot(1940, 2025);
			return slot;
		}
		else if(time.equals("13")){
			slot.setTimeSlot(2030, 2115);
			return slot;
		}
		else if(time.equals("14")){
			slot.setTimeSlot(2120, 2205);
			return slot;
		}
		else if(time.equals("15")){
			slot.setTimeSlot(2210, 2225);
			return slot;
		}
		
		return slot;
	}
	
	/**
	 * 
	 * @return true : current time is included in course time
	 */
	public Boolean checkCourseTime() {
		Calendar oCalendar = Calendar.getInstance( );
		
		int week = oCalendar.get(Calendar.DAY_OF_WEEK); // 1 : Sunday
		SimpleDateFormat sd = new SimpleDateFormat("HHmm");
		int hm = Integer.parseInt(sd.format(oCalendar.getTime())); 

		timeslot = times.split(",");
		for(int i = 0; i < timeslot.length; i++) {
			day = Integer.parseInt(timeslot[i].substring(0,1));
			TimeSlot time = convertTime(timeslot[i].substring(1));
			startTime = time.getStratTime();
			endTime = time.getEndTime();
			
			if(day == week-1 && (hm >= startTime && hm <= endTime)) {
				return true;
			}
		}
		return false;
	}
}
