package com.gachon.swdm.ths.web.bean;

public class Department {
	
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
