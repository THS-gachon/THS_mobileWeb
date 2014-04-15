package com.gachon.swdm.ths.web.bean;

public class ClassRoom {
	
	//primary key(building, room_number)
	private String building; 
	private String room_number;
	private int capacity;
	
	/*

	 */
	
	public ClassRoom(){
		
	}
	public String getBuilding() {
		return building;
	}
	public void setBuilding(String building) {
		this.building = building;
	}
	public String getRoom_number() {
		return room_number;
	}
	public void setRoom_number(String room_number) {
		this.room_number = room_number;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

}
