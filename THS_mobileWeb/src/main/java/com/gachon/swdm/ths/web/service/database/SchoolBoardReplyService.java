package com.gachon.swdm.ths.web.service.database;

import java.util.HashMap;
import java.util.List;

import com.gachon.swdm.ths.web.bean.board.SchoolBoardReply;

public interface SchoolBoardReplyService {
	public List<SchoolBoardReply> getList (HashMap<String,Object> hashmap);
	public SchoolBoardReply saveSchoolBoardReply(SchoolBoardReply schoolBoardReply);
	public void deleteSchoolBoardReply(SchoolBoardReply schoolBoardReply);


}
