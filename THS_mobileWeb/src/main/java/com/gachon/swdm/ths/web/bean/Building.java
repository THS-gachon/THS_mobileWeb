package com.gachon.swdm.ths.web.bean;

public class Building {
	//primary key (building)
	private String building;//varchar(20)
	private double latitude;//double
	private double longitude;//doubled
	/*
	 create table building(
	 building varchar(20),
	 latitude double,
	 longitude double,
	 primary key(building)
	 )
	 
	 INSERT INTO building(building,latitude,longitude) VALUES("새롬관",37.450904,127.127354);
	 INSERT INTO building(building,latitude,longitude) VALUES("웅지관",37.449494, 127.129401);
	 
	 */
	
	public Building(){
		
	}
	public String getBuilding() {
		return building;
	}
	public void setBuilding(String building) {
		this.building = building;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	

}
