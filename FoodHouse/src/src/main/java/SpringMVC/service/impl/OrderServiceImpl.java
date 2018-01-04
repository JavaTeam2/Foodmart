package SpringMVC.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import SpringMVC.dao.OrderDAO;
import SpringMVC.entity.Order;
import SpringMVC.service.OrderService;

@Service
@Transactional
public class OrderServiceImpl implements OrderService{
	@Autowired
	private OrderDAO orderDAO;
	
	public void addOrder(Order order) {
		// TODO Auto-generated method stub
		orderDAO.addOrder(order);
	}

	
	public void updateOrder(Order order) {
		// TODO Auto-generated method stub
		orderDAO.updateOrder(order);
	}

	
	public Order getOrder(int id) {
		// TODO Auto-generated method stub
		return orderDAO.getOrder(id);
	}

	
	public void deleteOrder(int id) {
		// TODO Auto-generated method stub
		orderDAO.deleteOrder(id);
	}

	
	public List<Order> getOrders() {
		// TODO Auto-generated method stub
		return orderDAO.getOrders();
	}

}
