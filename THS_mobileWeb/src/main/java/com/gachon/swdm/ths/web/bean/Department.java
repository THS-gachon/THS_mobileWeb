package com.gachon.swdm.ths.web.bean;

public class Department {
	
	/*
	 create table department(
	 	dept_name varchar(40),
	 	building varchar(20),
	 	primary key(dept_name),
	 	foreign key(building) references building(building)
	 )
	 
	 
	 */
	/*
	 	insert into department(dept_name,building) values("소프트웨어 설계 경영학과","새롬관");
	 */
	//primary key (dept_name)
	private String dept_name;//varchar(40)
	private String building;//varchar(20)
	
	
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	public String getBuilding() {
		return building;
	}
	public void setBuilding(String building) {
		this.building = building;
	}

	
}
