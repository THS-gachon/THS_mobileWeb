package com.gachon.swdm.ths.web.service.database;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.gachon.swdm.ths.web.bean.Department;
import com.gachon.swdm.ths.web.dao.interfac.DepartmentDAO;


@Service(value="departmentService")
public class DepartmentServiceImpl implements DepartmentService{
	
	@Autowired
	@Qualifier("departmentDAO")
	private DepartmentDAO departmentDAO;
	
	@Override
	public List<Department> getAll()
	{
		return departmentDAO.getAll();
	}
}
