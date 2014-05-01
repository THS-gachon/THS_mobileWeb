package com.gachon.swdm.ths.web.dao.interfac;

import com.gachon.swdm.ths.web.bean.ClassRoomServer;

public interface ClassRoomServerDAO {
	
	public void checkInClassServer (ClassRoomServer classRoomServer);
	public void checkOutClassServer (ClassRoomServer classRoomServer);
	public void insertClassServer (ClassRoomServer classRoomServer);
	public ClassRoomServer getClassServer (ClassRoomServer classRoomServer);
}
