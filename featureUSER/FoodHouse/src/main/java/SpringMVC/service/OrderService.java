package SpringMVC.service;

import java.util.List;

import SpringMVC.entity.Order;
import SpringMVC.entity.User;

public interface OrderService {
	public void addOrder(Order order);
	public void updateOrder(Order order);
	public Order getOrder(int id);
	public void deleteOrder(int id);
	public List<Order> getOrders();
	public List<Order> getOrderByUsername(User user);
	public void calTotalCost(Order order);
}
