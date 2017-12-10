package SpringMVC.dao;

import java.util.List;
import java.util.Set;

import SpringMVC.entity.User;
import SpringMVC.entity.UserRole;

public interface UserDAO {
	public void addUser(User user);
	public void updateUser(User user);
	public User getUser(int id);
	public User getUserByUsername(String username);
	public void deleteUser(int id);
	public List<User> getListUser();
}
