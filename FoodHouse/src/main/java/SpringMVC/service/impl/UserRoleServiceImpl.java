package SpringMVC.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import SpringMVC.dao.UserRoleDAO;
import SpringMVC.entity.UserRole;
import SpringMVC.service.UserRoleService;
@Service
@Transactional
public class UserRoleServiceImpl implements UserRoleService {
	@Autowired
	private UserRoleDAO userRoleDAO;
	
	public void addUserRole(UserRole userRole) {
		// TODO Auto-generated method stub
		userRoleDAO.addUserRole(userRole);
	}

	
	public void updateUserRole(UserRole userRole) {
		// TODO Auto-generated method stub
		userRoleDAO.updateUserRole(userRole);
	}

	
	public UserRole getUserRole(int id) {
		// TODO Auto-generated method stub
		return userRoleDAO.getUserRole(id);
	}

	
	public void deleteUserRole(int id) {
		// TODO Auto-generated method stub
		userRoleDAO.deleteUserRole(id);
	}

	
	public List<UserRole> getUserRoles() {
		// TODO Auto-generated method stub
		return userRoleDAO.getUserRoles();
	}

}
