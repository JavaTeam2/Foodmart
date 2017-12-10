package SpringMVC.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import SpringMVC.dao.OrderDetailDAO;
import SpringMVC.entity.Order;
import SpringMVC.entity.OrderDetail;

@Repository
public class OrderDetailDAOImpl implements OrderDetailDAO{
	@Autowired
	private SessionFactory sessionFactory;
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void addOrderDetail(OrderDetail orderDetail) {
		// TODO Auto-generated method stub
		getCurrentSession().save(orderDetail);
	}

	@Override
	public void updateOrderDetail(OrderDetail orderDetail) {
		// TODO Auto-generated method stub
		OrderDetail orderDetailToUpdate = getOrderDetail(orderDetail.getId());
		orderDetailToUpdate.setOrder_id(orderDetail.getOrder_id());
		orderDetailToUpdate.setFood_id(orderDetail.getFood_id());
		orderDetailToUpdate.setPrice(orderDetail.getPrice());
		orderDetailToUpdate.setQuantity(orderDetail.getQuantity());
		getCurrentSession().update(orderDetailToUpdate);
	}

	@Override
	public OrderDetail getOrderDetail(int id) {
		// TODO Auto-generated method stub
		OrderDetail orderDetail = getCurrentSession().get(OrderDetail.class, id);
		return orderDetail;
	}

	@Override
	public void deleteOrderDetail(int id) {
		// TODO Auto-generated method stub
		OrderDetail orderDetail = getOrderDetail(id);
		if(orderDetail != null) {
			getCurrentSession().delete(orderDetail);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<OrderDetail> getOrderDetails() {
		// TODO Auto-generated method stub
		return getCurrentSession().createQuery("Select e from " + OrderDetail.class.getName() + " e").list();
	}

}
