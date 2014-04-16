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
	@Transactional(rollbackFor = Exception.class)
	public SchoolBoard getSchoolBoard(HashMap<String, Object> hashmap) {
	
		schoolBoardDAO.updateReadNum(hashmap);
		return schoolBoardDAO.getSchoolBoard(hashmap);
	}
	
	@Override
	@Transactional(rollbackFor = Exception.class)
	public void updateReadNum(HashMap<String,Object> hashmap)
	{
		schoolBoardDAO.updateReadNum(hashmap);
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public SchoolBoard saveSchoolBoard(SchoolBoard schoolBoard) throws 
	RuntimeException{
	
		SchoolBoard result =  schoolBoardDAO.saveSchoolBoard(schoolBoard);
		
		/*HashMap<String,Object> hashmap = new HashMap<String,Object>();
		hashmap.put("type", schoolBoard.getType());
		hashmap.put("date_written", schoolBoard.getDate_written());
		hashmap.put("id_user", schoolBoard.getId_writer());
		SchoolBoard test = schoolBoardDAO.getSchoolBoard(hashmap);
		
		System.out.println("test: "+test.getTitle());
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	*/
		return result;
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public SchoolBoard updateSchoolBoard(SchoolBoard schoolBoard) {
	
		return schoolBoardDAO.updateSchoolBoard(schoolBoard);
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void deleteSchoolBoard(HashMap<String, Object> hashmap) {
		
		schoolBoardDAO.deleteSchoolBoard(hashmap);
	}

	@Override
	public int getCount(int type) {
		
		return schoolBoardDAO.getCount(type);
	}

}
