package com.gachon.swdm.ths.web.bean.board;

public class SchoolBoard extends Board{
	//School Notice
	private int type; //tinyint
	//primary key(type, date_written, id_user)

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

}
