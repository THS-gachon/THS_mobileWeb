package com.gachon.swdm.ths.web.service.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gachon.swdm.ths.web.bean.Teaches;
import com.gachon.swdm.ths.web.dao.interfac.TeachesDAO;


@Service(value="teachesService")
public class TeachesServiceImpl implements TeachesService{

	@Autowired
	@Qualifier("teachesDAO")
	private TeachesDAO teachesDAO;
	
	
	@Override
	@Transactional
	public Teaches insertTeaches(Teaches teaches) {
		
		return teachesDAO.insertTeaches(teaches);
	}

	@Override
	@Transactional
	public void deleteTeaches(Teaches teaches) {
		
		teachesDAO.deleteTeaches(teaches);
		
	}

	@Override
	@Transactional
	public void updateTeaches(Teaches teaches) {
		teachesDAO.updateTeaches(teaches);
	}
	

}
