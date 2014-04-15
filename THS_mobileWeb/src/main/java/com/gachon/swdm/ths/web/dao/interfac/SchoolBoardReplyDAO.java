package com.gachon.swdm.ths.web.dao.interfac;

import java.util.HashMap;
import java.util.List;

import com.gachon.swdm.ths.web.bean.board.SchoolBoardReply;

public interface SchoolBoardReplyDAO {
	public List<SchoolBoardReply> getList (HashMap<String,Object> hashmap);
	public SchoolBoardReply saveSchoolBoardReply(SchoolBoardReply schoolBoardReply);
	public void deleteSchoolBoardReply(SchoolBoardReply schoolBoardReply);
}
