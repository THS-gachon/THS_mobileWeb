package com.gachon.swdm.ths.web.bean.board;


public class SchoolBoardReplyWithPage extends SchoolBoardReply {

	private int page;

	/**
	 * @return the page of the board.
	 */
	public int getPage() {
		return page;
	}
	/**
	 * @param page : the page number of board.
	 */
	public void setPage(int page) {
		this.page = page;
	}

}
