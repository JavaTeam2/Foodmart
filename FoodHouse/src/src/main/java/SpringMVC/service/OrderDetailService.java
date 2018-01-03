package SpringMVC.service;

import java.util.List;

import SpringMVC.entity.OrderDetail;

public interface OrderDetailService {
	public void addOrderDetail(OrderDetail orderDetail);
	public void updateOrderDetail(OrderDetail orderDetail);
	public OrderDetail getOrderDetail(int id);
	public void deleteOrderDetails(int id);
	public List<OrderDetail> getOrderDetails();
}
