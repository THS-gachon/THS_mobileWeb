package com.gachon.swdm.ths.web.dao.interfac;

import java.util.List;

import com.gachon.swdm.ths.web.bean.board.ClassBoard;


public interface ClassBoardDAO{
	
	public List<ClassBoard> getClassBoardList(ClassBoard classBoardWithLimit);
	public ClassBoard getClassBoard(ClassBoard classBoard);
	public ClassBoard saveClassBoard(ClassBoard classBoard);
	public void updateClassBoard(ClassBoard classBoard);
	public void updateReadNum(ClassBoard classBoard);
	public void deleteClassBoard(ClassBoard classBoard);
	public int getCount(ClassBoard classBoard);
}  