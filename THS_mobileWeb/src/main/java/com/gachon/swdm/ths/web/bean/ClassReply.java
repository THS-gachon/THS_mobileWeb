package com.gachon.swdm.ths.web.bean;

public class ClassReply {
	
	//primary key(courseId, type, writtenTime, personId)
	//foreign key(courseId, type, boardWrittenTime, boardPersonId) references ClassBoard(courseId,type,writtenTime, personId)
	private long personId;
	private long boardPersonId;
	private long boardWrittenTime;
	private long writtenTime;
	private long courseId;
	private long type;
	
	private String contents;
	private String ip;
	

}
