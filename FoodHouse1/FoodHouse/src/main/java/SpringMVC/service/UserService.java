package SpringMVC.service;

import java.util.List;
import java.util.Set;

import SpringMVC.entity.User;
import SpringMVC.entity.UserRole;

public interface UserService {
	public void addUser(User user);
	public void updateUser(User user);
	public User getUser(int id);
	public void deleteUser(int id);
	public List<User> getListUser();
}
