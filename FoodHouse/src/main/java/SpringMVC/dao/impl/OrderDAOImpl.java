package SpringMVC.dao.impl;

import java.util.List;

import SpringMVC.entity.OrderDetail;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import SpringMVC.dao.OrderDAO;
import SpringMVC.entity.Order;

@Repository
public class OrderDAOImpl implements OrderDAO{
	@Autowired
	private SessionFactory sessionFactory;
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	public void addOrder(Order order) {
		// TODO Auto-generated method stub
		getCurrentSession().save(order);
	}

	
	public void updateOrder(Order order) {
		// TODO Auto-generated method stub
		Order orderToUpdate = getOrder(order.getId());
		orderToUpdate.setCustomer_id(order.getCustomer_id());;
		orderToUpdate.setBranch_id(order.getBranch_id());
		orderToUpdate.setCustomer_name(order.getCustomer_name());
		orderToUpdate.setCustomer_phone(order.getCustomer_phone());
		orderToUpdate.setCustomer_email(order.getCustomer_email());
		orderToUpdate.setCustomer_address(order.getCustomer_address());
		orderToUpdate.setCustomer_city(order.getCustomer_city());
		orderToUpdate.setCustomer_province(order.getCustomer_province());
		orderToUpdate.setTotal_money(order.getTotal_money());
		orderToUpdate.setDate_time(order.getDate_time());
		orderToUpdate.setStatus(order.getStatus());
		orderToUpdate.setNote(order.getNote());
		getCurrentSession().update(orderToUpdate);
	}

	
	public Order getOrder(int id) {
		// TODO Auto-generated method stub
		Order order = (Order) getCurrentSession().createQuery("SELECT e from "+ Order.class.getName() + " e where e.id="+id).uniqueResult();
		return order;
	}

	
	public void deleteOrder(int id) {
		// TODO Auto-generated method stub
		Order order = getOrder(id);
		if(order != null) {
			getCurrentSession().delete(order);
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<Order> getOrders() {
		// TODO Auto-generated method stub
		List<Order> orderList = getCurrentSession().createQuery("Select e from " + Order.class.getName() + " e").list();
		for (Order order: orderList) {
			Hibernate.initialize(order.getListUserDetails());
			for (OrderDetail orderDetail: order.getListUserDetails()){
				Hibernate.initialize(orderDetail.getFood_id());
				orderDetail.getFood_id().getName();
			}
			order.getListUserDetails().size();
		}
		return	orderList;
	}

}
