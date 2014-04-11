package com.gachon.swdm.ths.web.dao.interfac;

import java.util.List;

import com.gachon.swdm.ths.web.bean.User;


public interface UserDAO {

	public List<User> getUsers();
	public User getUser(String loginId);
	public User saveUser(User user);
	public User updateUser(User user);
	public void deleteUser(String loginId);
}
