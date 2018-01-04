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
	@Override
	public void addUserRole(UserRole userRole) {
		// TODO Auto-generated method stub
		userRoleDAO.addUserRole(userRole);
	}

	@Override
	public void updateUserRole(UserRole userRole) {
		// TODO Auto-generated method stub
		userRoleDAO.updateUserRole(userRole);
	}

	@Override
	public UserRole getUserRole(int id) {
		// TODO Auto-generated method stub
		return userRoleDAO.getUserRole(id);
	}

	@Override
	public void deleteUserRole(int id) {
		// TODO Auto-generated method stub
		userRoleDAO.deleteUserRole(id);
	}

	@Override
	public List<UserRole> getUserRoles() {
		// TODO Auto-generated method stub
		return userRoleDAO.getUserRoles();
	}

}
