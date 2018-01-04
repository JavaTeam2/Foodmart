package SpringMVC.service;

import java.util.List;

import SpringMVC.entity.UserRole;

public interface UserRoleService {
	public void addUserRole(UserRole userRole);
	public void updateUserRole(UserRole userRole);
	public UserRole getUserRole(int id);
	public void deleteUserRole(int id);
	public List<UserRole> getUserRoles();
}
