package com.gachon.swdm.ths.web.bean.board;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public abstract class Reply {
	//indexing 두개가 있어야해
	//foreign key 하나, 얘꺼 하나...
	

	private String contents;//text
	private String ip;//varchar(40)
	private long date_written;//bigint unsigned
	private String id_writer;//varchar(40)
	

	private long board_date; //bigint unsigned
	private String board_writer;//varchar(40)
	
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public long getDate_written() {
		return date_written;
	}
	public void setDate_written(long date_written) {
		this.date_written = date_written;
	}
	public long getBoard_date() {
		return board_date;
	}
	public void setBoard_date(long board_date) {
		this.board_date = board_date;
	}
	public String getBoard_writer() {
		return board_writer;
	}
	public void setBoard_writer(String board_writer) {
		this.board_writer = board_writer;
	}
	public String getId_writer() {
		return id_writer;
	}
	public void setId_writer(String id_writer) {
		this.id_writer = id_writer;
	}
	public String getDateForRecord(){
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm ss.SSS");
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(date_written);
	
		return format.format(calendar.getTime());
	}

}
