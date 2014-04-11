package com.gachon.swdm.ths.web.bean.board;

public abstract class Board {

	private String id_writer;//references User..
	private long date_written;//
	private String title;//varchar(200)
	private String contents;//text
	private String ip;//varchar(40)//ipv6 is considered...

	public long getDate_written() {
		return date_written;
	}
	public void setDate_written(long date_written) {
		this.date_written = date_written;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
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
	public String getId_writer() {
		return id_writer;
	}
	public void setId_writer(String id_writer) {
		this.id_writer = id_writer;
	}
	
}
