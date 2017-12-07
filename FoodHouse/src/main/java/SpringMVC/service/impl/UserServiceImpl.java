package SpringMVC.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import SpringMVC.dao.UserDAO;
import SpringMVC.entity.User;
import SpringMVC.service.UserService;
@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAO userDAO;
	
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		userDAO.addUser(user);
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		userDAO.updateUser(user);
	}

	@Override
	public User getUser(String username) {
		// TODO Auto-generated method stub
		return userDAO.getUser(username);
	}

	@Override
	public void deleteUser(String username) {
		// TODO Auto-generated method stub
		userDAO.deleteUser(username);
	}

	@Override
	public List<User> getListUser() {
		// TODO Auto-generated method stub
		return userDAO.getListUser();
	}

}
