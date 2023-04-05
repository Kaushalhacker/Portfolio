package org.jsp.usermvcapp.service;

import java.util.List;

import org.jsp.usermvcapp.dao.UserDao;
import org.jsp.usermvcapp.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserService {
   @Autowired
   private UserDao dao;
	
	public User saveUser(User user) {
		return dao.saverUser(user);
	}
	public User updateUser(User user) {
		return dao.updateUser(user);
		
	}
	public User getUserById(int id) {
		return dao.getUserById(id);
	}
	public boolean deleteUser(int id) {
		return dao.deleteUser(id);
	}
	public List<User> findUser(){
		return dao.findAllUser();
	}
	public User verifyUser(long phone ,String password) {
		return dao.verifyUser(phone, password);
	}
	
}
