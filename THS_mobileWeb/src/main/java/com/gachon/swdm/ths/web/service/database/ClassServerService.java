package com.gachon.swdm.ths.web.service.database;

import com.gachon.swdm.ths.web.bean.ClassRoomServer;

public interface ClassServerService {

	/**
	 * This method do login operation of desktop server whose key is {year, semester, id_course}.
	 * When thi
	 * @param classRoomServer
	 * The year, semester, id_course, time_recentOnline and ip of {@link #ClassRoomServer} object must exist.
	 */
	public void checkInClassServer (ClassRoomServer classRoomServer);

	/**
	 * This method do logout operation of desktop server whose key is {year, semester, id_course}.
	 * @param classRoomServer
	 * The year, semester, id_course of {@link #ClassRoomServer} object must exist.
	 */
	public void checkOutClassServer (ClassRoomServer classRoomServer);
	
	
	public void insertClassServer (ClassRoomServer classRoomServer);
	
	/**
	 * This method gets classRoom information from database by classRoomServer's primary key.<br/>
	 * When android device checks if given class room is online, this method can give the information of class server.
	 * @param classRoomServer The year, semester, id_course of {@link #ClassRoomServer} object must exist.
	 * @return the information of given class server.
	 */
	public ClassRoomServer getClassServer (ClassRoomServer classRoomServer);
}
