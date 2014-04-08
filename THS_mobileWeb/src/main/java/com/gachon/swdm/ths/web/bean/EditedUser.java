package com.gachon.swdm.ths.web.bean;

public class EditedUser extends User{
	
	private String pwCheck;

	public EditedUser(){
		super();
	}
	
	public String getPwCheck() {
		return pwCheck;
	}

	public void setPwCheck(String pwCheck) {
		this.pwCheck = pwCheck;
	}



}
