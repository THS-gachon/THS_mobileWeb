package com.gachon.swdm.ths.web.bean.board;

public class SchoolBoardReply extends Reply{
	
	/*
	 
	 	//indexing 두개가 있어야해
	//foreign key 하나, 얘꺼 하나...
	

	private String contents;//text
	private String ip;//varchar(40)
	private long date_written;//bigint unsigned
	private String id_user;//varchar(40)
	

	private long board_date; //bigint unsigned
	private String board_writer;//varchar(40)
	
	
	create table school_board_reply(
		id_user varchar(40),
		date_written bigInt unsigned,
		ip varchar(40),
		contents text,
		
		board_date bigInt unsigned,
		board_writer varchar(40),
		board_type tinyInt,
		
		primary key(board_type, board_date, board_writer, date_written, id_user),
		foreign key(board_type, board_date, board_writer) references school_board(type, date_written, id_user),
		foreign key(id_user) references user (id_login),
		INDEX index1 (board_type, board_date, board_writer, date_written)
	);
	 */
	
	private int board_type;

	public int getBoard_type() {
		return board_type;
	}

	public void setBoard_type(int board_type) {
		this.board_type = board_type;
	}

}
