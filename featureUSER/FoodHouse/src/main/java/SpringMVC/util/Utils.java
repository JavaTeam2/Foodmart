package SpringMVC.util;

import java.sql.Time;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import SpringMVC.entity.Branch;
import SpringMVC.entity.Order;
import SpringMVC.entity.User;

public class Utils {
	public static Order getOrderInSession(HttpServletRequest request) {
		Order order = (Order) request.getSession().getAttribute("myCart");
		if(order == null) {
			User user = null;
			Branch branch = null;
			Date day = new Date();
			   Time time = new Time(day.getTime());
			order = new Order(user, branch, "", "", "", "", "", "", 0.0, time, "Choose", "");
		}
		
		//Va luu trong session
		request.getSession().setAttribute("myCart", order);
		return order;
	}
	
	public void removeOrderInSession(HttpServletRequest request) {
		request.getSession().removeAttribute("myCart");
	}
	
	public static void storeLastOrderedInSession(HttpServletRequest request, Order order) {
		request.getSession().setAttribute("lastOrderedCart", order);
	}
	
	public static Order getLastOrderedInSession(HttpServletRequest request) {
		return (Order) request.getSession().getAttribute("lastOrderedCart");
	}
}
