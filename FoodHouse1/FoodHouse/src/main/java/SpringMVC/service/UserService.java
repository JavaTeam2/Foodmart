package SpringMVC.service;

import java.util.List;

import SpringMVC.entity.User;

public interface UserService {
	public void addUser(User user);
	public void updateUser(User user);
	public User getUser(int id);
	public void deleteUser(int id);
	public List<User> getListUser();
}
