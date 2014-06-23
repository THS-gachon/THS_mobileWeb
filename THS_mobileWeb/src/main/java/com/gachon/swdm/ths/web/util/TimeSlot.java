package com.gachon.swdm.ths.web.util;

public class TimeSlot {
	private int start, end;
	
	/**
	 * 
	 * @param start : start time of course
	 * @param end : end time of course
	 */
	public void setTimeSlot(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	/**
	 * 
	 * @return start time
	 */
	public int getStratTime() {
		return start;
	}
	
	/**
	 * 
	 * @return end time
	 */
	public int getEndTime() {
		return end;
	}
}
