package com.gachon.swdm.ths.web.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gachon.swdm.ths.web.bean.Department;
import com.gachon.swdm.ths.web.dao.interfac.DepartmentDAO;

@Repository("departmentDAO") 
public class DepartmentDAOImpl implements DepartmentDAO{

	@Autowired
	private SqlSession sqlSession;
	
	private static final Logger logger = LoggerFactory.getLogger(DepartmentDAOImpl.class);
	
	private static final String NS = "com.gachon.swdm.ths.web.bean.Department.";


	@Override
	public List<Department> getAll() {
		
		return sqlSession.selectList(NS+"getAll");
	}
	
	
	
	
}
