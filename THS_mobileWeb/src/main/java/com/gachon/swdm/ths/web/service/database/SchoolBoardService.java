package com.gachon.swdm.ths.web.service.database;

import java.util.HashMap;
import java.util.List;

import com.gachon.swdm.ths.web.bean.board.SchoolBoard;

public interface SchoolBoardService {
	public List<SchoolBoard> getSchoolBoardList(HashMap<String, Integer> hashmap);
	public SchoolBoard getSchoolBoard(HashMap<String, Object> hashmap);
	public SchoolBoard saveSchoolBoard(SchoolBoard schoolBoard);
	public SchoolBoard updateSchoolBoard(SchoolBoard schoolBoard);
	public void deleteSchoolBoard(HashMap<String,Object> hashmap);
	public int getCount(int type);
}
