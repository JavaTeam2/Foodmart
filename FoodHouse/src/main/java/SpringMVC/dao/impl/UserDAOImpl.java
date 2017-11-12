package SpringMVC.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import SpringMVC.dao.UserDAO;
import SpringMVC.entity.User;

@Repository
public class UserDAOImpl implements UserDAO {
	@Autowired
	private SessionFactory sessionFactory;
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		getCurrentSession().save(user);
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		User userToUpdate = getUser(user.getUsername());
		userToUpdate.setPassword(user.getPassword());
		userToUpdate.setName(user.getName());
		userToUpdate.setPhone(user.getPhone());
	}

	@Override
	public User getUser(String username) {
		// TODO Auto-generated method stub
		User user = getCurrentSession().get(User.class, username);
		return user;
	}

	@Override
	public void deleteUser(String username) {
		// TODO Auto-generated method stub
		User user = getUser(username);
		if(user != null) {
			getCurrentSession().delete(user);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getListUser() {
		// TODO Auto-generated method stub
		
		return getCurrentSession().createQuery("Select e from " + User.class.getName() + " e").list();
	}

}
