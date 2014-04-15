package com.gachon.swdm.ths.web.service.database;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gachon.swdm.ths.web.bean.board.SchoolBoardReply;
import com.gachon.swdm.ths.web.dao.interfac.SchoolBoardReplyDAO;

@Service(value="schoolBoardReplyService")
public class SchoolBoardReplyServiceImpl implements SchoolBoardReplyService{

	@Autowired
	@Qualifier("schoolBoardReplyDAO")
	private SchoolBoardReplyDAO schoolBoardReplyDAO;
	
	@Override
	public List<SchoolBoardReply> getList(HashMap<String, Object> hashmap) {
		
		return schoolBoardReplyDAO.getList(hashmap);
	}

	@Override
	@Transactional
	public SchoolBoardReply saveSchoolBoardReply(
			SchoolBoardReply schoolBoardReply) {
	
		return schoolBoardReplyDAO.saveSchoolBoardReply(schoolBoardReply);
	}

	@Override
	@Transactional
	public void deleteSchoolBoardReply(SchoolBoardReply schoolBoardReply) {
		
		schoolBoardReplyDAO.deleteSchoolBoardReply(schoolBoardReply);
		
	}

}
