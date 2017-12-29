package SpringMVC.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import SpringMVC.dao.UserRoleDAO;
import SpringMVC.entity.UserRole;
@Repository
public class UserRoleDAOImpl implements UserRoleDAO {
	@Autowired
	private SessionFactory sessionFactory;
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	public void addUserRole(UserRole userRole) {
		// TODO Auto-generated method stub
		getCurrentSession().save(userRole);
	}

	public void updateUserRole(UserRole userRole) {
		// TODO Auto-generated method stub
		UserRole userRoleToUpdate = getUserRole(userRole.getUserRoleID());
		userRoleToUpdate.setUsername(userRole.getUsername());
		userRoleToUpdate.setRole(userRole.getRole());
		getCurrentSession().update(userRoleToUpdate);
	}

	public UserRole getUserRole(int id) {
		// TODO Auto-generated method stub
		UserRole userRole = (UserRole) getCurrentSession().get(UserRole.class, id);
		return userRole;
	}

	public void deleteUserRole(int id) {
		// TODO Auto-generated method stub
		UserRole userRole = getUserRole(id);
		if(userRole != null) {
			getCurrentSession().delete(userRole);
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<UserRole> getUserRoles() {
		// TODO Auto-generated method stub
		return getCurrentSession().createQuery("Select e from " + UserRole.class.getName() + " e").list();
	}
	

}
