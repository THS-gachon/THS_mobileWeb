package com.gachon.swdm.ths.web.service.database;

import java.util.List;

import com.gachon.swdm.ths.web.bean.Course;
import com.gachon.swdm.ths.web.bean.Teaches;
import com.gachon.swdm.ths.web.bean.User;

public interface UserService {

	public List<User> getUsers();
	public User getById(String id);
	public User save(User user);
	public User update(User user);
	public void delete(String id);
	public List<User> getStudentsByCourse(Course course);
	public User getProfessorByCourse(Teaches teaches);
	
	
}
