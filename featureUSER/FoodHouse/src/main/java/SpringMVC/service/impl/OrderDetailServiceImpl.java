package SpringMVC.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import SpringMVC.dao.OrderDetailDAO;
import SpringMVC.entity.OrderDetail;
import SpringMVC.service.OrderDetailService;

@Service
@Transactional
public class OrderDetailServiceImpl implements OrderDetailService{
	
	@Autowired
	private OrderDetailDAO orderDetailDAO;
	@Override
	public void addOrderDetail(OrderDetail orderDetail) {
		// TODO Auto-generated method stub
		orderDetailDAO.addOrderDetail(orderDetail);
	}


	@Override
	public List<OrderDetail> getOrderDetails() {
		// TODO Auto-generated method stub
		return orderDetailDAO.getOrderDetails();
	}

	@Override
	public OrderDetail getOrderDetail(int id) {
		// TODO Auto-generated method stub
		return orderDetailDAO.getOrderDetail(id);
	}

	@Override
	public void deleteOrderDetails(int id) {
		orderDetailDAO.deleteOrderDetail(id);
		
	}


	@Override
	public void updateOrderDetail(OrderDetail orderDetail) {
		// TODO Auto-generated method stub
		orderDetailDAO.updateOrderDetail(orderDetail);
	}

}
