package SpringMVC.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import SpringMVC.dao.UserDAO;
import SpringMVC.entity.User;
import SpringMVC.entity.UserRole;

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
		User userToUpdate = getUser(user.getId());
		userToUpdate.setName(user.getName());
		userToUpdate.setEmail(user.getEmail());
		userToUpdate.setUsername(user.getUsername());
		userToUpdate.setPassword(user.getPassword());
		userToUpdate.setCity(user.getCity());
		userToUpdate.setProvince(user.getProvince());
		userToUpdate.setAddress(user.getAddress());
		userToUpdate.setPhone(user.getPhone());
	}

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		User user = getCurrentSession().get(User.class, id);
		return user;
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		User user = getUser(id);
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

	@Override
	public User getUserByUsername(String username) {
		// TODO Auto-generated method stub
		List<User> list = getListUser();
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getUsername().equals(username)) {
				return list.get(i);
			}
		}
		return null;
	}


}
