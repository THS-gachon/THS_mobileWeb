package com.gachon.swdm.ths.web.dao.interfac;

import java.util.List;

import com.gachon.swdm.ths.web.bean.Course;

import com.gachon.swdm.ths.web.bean.Teaches;
import com.gachon.swdm.ths.web.bean.User;


public interface UserDAO {

	public List<User> getUsers();
	public User getUser(String loginId);
	public User saveUser(User user);
	public User updateUser(User user);
	public void deleteUser(String loginId);
	public List<User> getStudentsByCourse(Course course);
	public User getProfessorByCourse(Teaches teaches);

	
}
