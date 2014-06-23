package com.gachon.swdm.ths.web.service.database;

import com.gachon.swdm.ths.web.bean.Takes;

public interface TakesService {
	public void insertTakes(Takes takes);
	public void deleteTakes(Takes takes);
	public Takes getTakesInClass(Takes takes);
}
