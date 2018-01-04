package SpringMVC.dao.impl;

import java.util.List;

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
	
	@Override
	public void addOrder(Order order) {
		// TODO Auto-generated method stub
		getCurrentSession().save(order);
	}

	@Override
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
		orderToUpdate.setNote(order.getStatus());
		getCurrentSession().update(orderToUpdate);
	}

	@Override
	public Order getOrder(int id) {
		// TODO Auto-generated method stub
		Order order = getCurrentSession().get(Order.class, id);
		return order;
	}

	@Override
	public void deleteOrder(int id) {
		// TODO Auto-generated method stub
		Order order = getOrder(id);
		if(order != null) {
			getCurrentSession().delete(order);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Order> getOrders() {
		// TODO Auto-generated method stub
		return getCurrentSession().createQuery("Select e from " + Order.class.getName() + " e").list();
	}

}
