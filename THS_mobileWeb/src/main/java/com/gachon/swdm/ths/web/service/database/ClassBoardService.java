package com.gachon.swdm.ths.web.service.database;

import java.util.List;

import com.gachon.swdm.ths.web.bean.board.ClassBoard;

public interface ClassBoardService {

	public List<ClassBoard> getClassBoardList(ClassBoard classBoardWithLimit);
	public ClassBoard getClassBoard(ClassBoard classBoard);
	public ClassBoard getClassBoardAndUpdateReadNum(ClassBoard classBoard);
	public ClassBoard saveClassBoard(ClassBoard classBoard);
	public void updateClassBoard(ClassBoard classBoard);
	public void deleteClassBoard(ClassBoard classBoard);
	public int getCount(ClassBoard classBoard);
}
