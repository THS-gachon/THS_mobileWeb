package com.gachon.swdm.ths.web.bean.board;

public class SchoolBoard extends Board{
	//학교 전체 공지사항
	//
	/*
	 * private String id_user;//references User..
	private long date_written;//
	private String title;//varchar(200)
	private String contents;//text
	private String ip;//varchar(40)//ipv6 is considered...
	
	 */
	private int type; //tinyint
	//multi column
	//공지, 행사, 장학,
	/*
	 CREATE TABLE school_board(
	 	type tinyInt,
	 	id_user varchar(40),
	 	date_written BIGINT unsigned,
	 	title varchar(200),
	 	contents text,
	 	ip varchar(40),
	 	primary key(type, date_written, id_user),
	 	foreign key(id_user) references user(id_login),
	 	INDEX index1 (type, date_written, id_user)
	 )
	 
	 
	  
	 */



	public int getType() {
		return type;
	}



	public void setType(int type) {
		this.type = type;
	}
	

}
