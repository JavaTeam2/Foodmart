package SpringMVC.dao;

import java.util.List;

import SpringMVC.entity.Order;
import SpringMVC.entity.OrderDetail;

public interface OrderDetailDAO {
	public void addOrderDetail(OrderDetail orderDetail);
	public void updateOrderDetail(OrderDetail orderDetail);
	public OrderDetail getOrderDetail(int id);
	public void deleteOrderDetail(int id);
	public List<OrderDetail> getOrderDetails();
}
