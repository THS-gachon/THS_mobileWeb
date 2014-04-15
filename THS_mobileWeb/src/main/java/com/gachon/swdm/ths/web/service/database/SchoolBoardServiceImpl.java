package com.gachon.swdm.ths.web.service.database;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gachon.swdm.ths.web.bean.board.SchoolBoard;
import com.gachon.swdm.ths.web.dao.interfac.SchoolBoardDAO;

@Service(value="schoolBoardService")
public class SchoolBoardServiceImpl implements SchoolBoardService{

	@Autowired
	@Qualifier("schoolBoardDAO")
	private SchoolBoardDAO schoolBoardDAO;
	
	@Override
	public List<SchoolBoard> getSchoolBoardList(HashMap<String, Integer> hashmap) {	
		return schoolBoardDAO.getSchoolBoardList(hashmap);
	}

	@Override
	@Transactional
	public SchoolBoard getSchoolBoard(HashMap<String, Object> hashmap) {
	
		schoolBoardDAO.updateReadNum(hashmap);
		return schoolBoardDAO.getSchoolBoard(hashmap);
	}

	@Override
	@Transactional
	public SchoolBoard saveSchoolBoard(SchoolBoard schoolBoard) {
		
		return schoolBoardDAO.saveSchoolBoard(schoolBoard);
	}

	@Override
	@Transactional
	public SchoolBoard updateSchoolBoard(SchoolBoard schoolBoard) {
	
		return schoolBoardDAO.updateSchoolBoard(schoolBoard);
	}

	@Override
	@Transactional
	public void deleteSchoolBoard(HashMap<String, Object> hashmap) {
		
		schoolBoardDAO.deleteSchoolBoard(hashmap);
	}

	@Override
	public int getCount(int type) {
		
		return schoolBoardDAO.getCount(type);
	}

}
