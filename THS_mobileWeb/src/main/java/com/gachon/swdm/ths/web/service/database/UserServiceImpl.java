package com.gachon.swdm.ths.web.service.database;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gachon.swdm.ths.web.bean.Course;
import com.gachon.swdm.ths.web.bean.Teaches;

import com.gachon.swdm.ths.web.bean.User;
import com.gachon.swdm.ths.web.dao.interfac.UserDAO;

@Service(value="userService")
public class UserServiceImpl implements UserService{

	@Autowired
	@Qualifier("userDAO")
	private UserDAO userDAO;

	@Override
	public List<User> getUsers() {
		
		return userDAO.getUsers();
	}

	@Override
	public User getById(String id) {
		return userDAO.getUser(id);
	}

	@Override
	@Transactional
	public User save(User user) {
		return userDAO.saveUser(user);
	}

	@Override
	@Transactional
	public User update(User user) {
	
		return userDAO.updateUser(user);
	}

	@Override
	@Transactional
	public void delete(String id) {
		userDAO.deleteUser(id);
	}
	
	@Override
	@Transactional
	public List<User> getStudentsByCourse(Course course)
	{
		return userDAO.getStudentsByCourse(course);
	}
	
	@Override
	public User getProfessorByCourse(Teaches teaches)
	{
		return userDAO.getProfessorByCourse(teaches);
	}


}
