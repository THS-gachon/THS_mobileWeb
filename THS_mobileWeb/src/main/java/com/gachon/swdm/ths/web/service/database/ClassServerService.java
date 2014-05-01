package com.gachon.swdm.ths.web.service.database;

import com.gachon.swdm.ths.web.bean.ClassRoomServer;

public interface ClassServerService {

	public void checkInClassServer (ClassRoomServer classRoomServer);
	public void checkOutClassServer (ClassRoomServer classRoomServer);
	public void insertClassServer (ClassRoomServer classRoomServer);
	public ClassRoomServer getClassServer (ClassRoomServer classRoomServer);
}
