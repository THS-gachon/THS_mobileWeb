package com.gachon.swdm.ths.web.service.database;

import java.util.List;

import com.gachon.swdm.ths.web.bean.board.ClassBoardReply;

public interface ClassBoardReplyService {
	public ClassBoardReply saveClassBoardReply(ClassBoardReply classBoardReply);
	public List<ClassBoardReply> getList(ClassBoardReply classBoardReply);
	public void deleteClassBoardReply(ClassBoardReply classBoardReply);
}
