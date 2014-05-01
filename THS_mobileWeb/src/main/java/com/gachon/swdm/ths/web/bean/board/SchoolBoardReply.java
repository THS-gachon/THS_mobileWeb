package com.gachon.swdm.ths.web.bean.board;

public class SchoolBoardReply extends Reply{
	
	
	//primary key(board_type, board_date, board_writer, date_written, id_user)
	
	
	private int board_type;

	public int getBoard_type() {
		return board_type;
	}

	public void setBoard_type(int board_type) {
		this.board_type = board_type;
	}

}
