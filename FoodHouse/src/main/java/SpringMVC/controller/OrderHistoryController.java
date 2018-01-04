package SpringMVC.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import SpringMVC.entity.Order;
import SpringMVC.entity.User;
import SpringMVC.service.OrderService;
import SpringMVC.service.UserService;
import SpringMVC.util.Utils;

@Controller
public class OrderHistoryController {
	@Autowired
	private OrderService orderService;
	
	@Autowired
	private UserService userService;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
	    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
	    sdf.setLenient(true);
	    binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
	}
	
	@RequestMapping(value = {"/orderHistory"})
	public String orderHistory(HttpServletRequest request, Model model) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	      String username = auth.getName();
	      User user = userService.getUserByUsername(username);
	      if(username.equals("anonymousUser")) {
	    	  Order myCart = null;
	    	  myCart = Utils.getOrderInSession(request);
	    	  List<Order> listOrder = new ArrayList<Order>();
	    	  listOrder.add(myCart);
	    	  model.addAttribute("listOrderHistory", listOrder);
	      }
	      else {
	  		List<Order> listUserOrder = user.getOrders();
	  		model.addAttribute("listOrderHistory", listUserOrder);
	      }
	      model.addAttribute("username", username);
		
		
		return "orderHistory";
		
	}
}
