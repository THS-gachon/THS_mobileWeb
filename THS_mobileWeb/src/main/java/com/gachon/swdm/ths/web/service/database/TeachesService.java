package com.gachon.swdm.ths.web.service.database;

import com.gachon.swdm.ths.web.bean.Teaches;

public interface TeachesService {
	
	public Teaches insertTeaches(Teaches teaches);
	public void deleteTeaches(Teaches teaches);
	public void updateTeaches(Teaches teaches);
	
}
