package com.gachon.swdm.ths.web.bean;


public class User {
	//primary key (personId)
	//loginId index
	
	private String loginId; //varchar(40)
	private int personId;//integer
	private String pw; //varchar(50)
	private String name; //varchar(30)
	private String phoneNumber;//varchar(20)
	private int position;//0학생//1. short int
	private String dept_name;//varchar(40)
	
	/*
	 department must be created
	 
	 */
	/*
	 
	 create table user(
	 	id_login varchar(40),
	 	id_person integer,
	 	pw varchar(50),
	 	name varchar(30),
	 	phone_number varchar(20),
	 	position tinyInt,
	 	dept_name varchar(40),
	 	primary key (id_login),
	 	foreign key (dept_name) references department(dept_name),
	 	INDEX index1 (id_person)
	 )
	 
	 INSERT INTO user(id_login,id_person,pw,name,phone_number,position,dept_name) 
	 VALUES ("master",201100000,"123", "THS","010","3","소프트웨어 설계 경영학과");
	 
	 
	 
	 */
	
	public User()
	{
		
	}
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public long getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	
}
