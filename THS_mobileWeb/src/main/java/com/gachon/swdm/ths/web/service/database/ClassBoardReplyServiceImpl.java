package com.gachon.swdm.ths.web.service.database;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gachon.swdm.ths.web.bean.board.ClassBoardReply;
import com.gachon.swdm.ths.web.dao.interfac.ClassBoardReplyDAO;


@Service(value="classBoardReplyService")
public class ClassBoardReplyServiceImpl implements ClassBoardReplyService{

	@Autowired
	@Qualifier("classBoardReplyDAO")
	private ClassBoardReplyDAO classBoardReplyDAO;
	
	@Override
	@Transactional
	public ClassBoardReply saveClassBoardReply(ClassBoardReply classBoardReply) {

		classBoardReplyDAO.saveClassBoardReply(classBoardReply);
		return classBoardReply;
	}

	@Override
	@Transactional
	public List<ClassBoardReply> getList(ClassBoardReply classBoardReply) {
		
		return classBoardReplyDAO.getList(classBoardReply);
	}

	@Override
	@Transactional
	public void deleteClassBoardReply(ClassBoardReply classBoardReply) {
		classBoardReplyDAO.deleteClassBoardReply(classBoardReply);
	}

}
