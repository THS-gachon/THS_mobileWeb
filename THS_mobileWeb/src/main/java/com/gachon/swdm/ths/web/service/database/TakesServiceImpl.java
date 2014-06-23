package com.gachon.swdm.ths.web.service.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gachon.swdm.ths.web.bean.Takes;
import com.gachon.swdm.ths.web.dao.interfac.TakesDAO;

@Service(value="takesService")
public class TakesServiceImpl implements TakesService{

	@Autowired
	@Qualifier("takesDAO")
	private TakesDAO takesDAO;
	
	@Override
	public void insertTakes(Takes takes) {
		
		
	}

	@Override
	public void deleteTakes(Takes takes) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public Takes getTakesInClass(Takes takes) {
		return takesDAO.getTakesInClass(takes);
	}

}
