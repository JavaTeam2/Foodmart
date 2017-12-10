package SpringMVC.dao;

import java.util.List;
import SpringMVC.entity.Order;
import SpringMVC.entity.OrderDetail;;

public interface OrderDAO {
	public void addOrder(Order order);
	public void updateOrder(Order order);
	public Order getOrder(int id);
	public void deleteOrder(int id);
	public List<Order> getOrders();
}
