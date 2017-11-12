package SpringMVC.service;

import java.util.List;

import SpringMVC.entity.User;

public interface UserService {
	public void addUser(User user);
	public void updateUser(User user);
	public User getUser(String username);
	public void deleteUser(String username);
	public List<User> getListUser();
}
