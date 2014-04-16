package com.gachon.swdm.ths.web.service.database;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gachon.swdm.ths.web.bean.board.ClassBoard;

import com.gachon.swdm.ths.web.dao.interfac.ClassBoardDAO;

@Service(value="classBoardService")
public class ClassBoardServiceImpl implements ClassBoardService{

	@Autowired
	@Qualifier("classBoardDAO")
	private ClassBoardDAO classBoardDAO;
	
	@Override
	@Transactional
	public List<ClassBoard> getClassBoardList(
			ClassBoard classBoardWithLimit) {
		
		
		return classBoardDAO.getClassBoardList(classBoardWithLimit);
	}

	@Override
	@Transactional
	public ClassBoard getClassBoard(ClassBoard classBoard) {
	
		return classBoardDAO.getClassBoard(classBoard);
	}

	@Override
	@Transactional
	public ClassBoard getClassBoardAndUpdateReadNum(ClassBoard classBoard) {
	
		classBoardDAO.updateReadNum(classBoard);
		
		return classBoardDAO.getClassBoard(classBoard);
		
	}

	@Override
	@Transactional
	public ClassBoard saveClassBoard(ClassBoard classBoard) {
		
		classBoardDAO.saveClassBoard(classBoard);
		return classBoard;
	}

	@Override
	@Transactional
	public void updateClassBoard(ClassBoard classBoard) {
	
		classBoardDAO.updateClassBoard(classBoard);
		
	}



	@Override
	@Transactional
	public void deleteClassBoard(ClassBoard classBoard) {

		classBoardDAO.deleteClassBoard(classBoard);
	}

	@Override
	@Transactional
	public int getCount(ClassBoard classBoard) {

		return classBoardDAO.getCount(classBoard);
	}
	

}
