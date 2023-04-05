package org.jsp.usermvcapp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.jsp.usermvcapp.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	@Autowired
	EntityManager manager;
	
	public User saverUser(User user) {
		EntityTransaction transaction=manager.getTransaction();
		manager.persist(user);
		transaction.begin();
		transaction.commit();
		return user;
	}
	public User updateUser(User user) {
		EntityTransaction transaction=manager.getTransaction();
		manager.persist(user);
		transaction.begin();
		transaction.commit();

		return user;
	}
	public User getUserById(int id) {
		
		return manager.find(User.class, id);
	}
	public boolean deleteUser(int id) {
		EntityTransaction transaction=manager.getTransaction();
		User user =manager.find(User.class, id);
		if(user!=null) {
			manager.remove(user);
			transaction.begin();
			transaction.commit();
			return true;
		}
		
		return false;
	}
	public List<User> findAllUser(){
	Query q= manager.createQuery("select user from User user");
		return q.getResultList();
	}
	public User verifyUser(long phone ,String password) {
		Query q=manager.createQuery("select user from User user where user.phone=?1 and user.password=?2");
		q.setParameter(1, phone);
		q.setParameter(2, password);
		List<User> user=q.getResultList();
		if(user.size()>0)
			return user.get(0);
		
		return null;
	}
	
}
