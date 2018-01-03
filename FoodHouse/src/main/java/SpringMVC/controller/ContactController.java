package SpringMVC.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import SpringMVC.entity.Order;
import SpringMVC.service.OrderService;
import SpringMVC.service.UserService;
import SpringMVC.util.Utils;

@Controller
public class ContactController {
	@Autowired
	private UserService userService;
	@Autowired
	private OrderService orderService;
	@RequestMapping("/contact")
	public String contact(Model model, HttpServletRequest request) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	      String username = auth.getName();
	      Order myCart = null;
		 	if(username.equals("anonymousUser")) {
		    	  myCart = Utils.getOrderInSession(request);
		    	  model.addAttribute("cartForm", myCart);
		    	  model.addAttribute("count", myCart.getListUserDetails().size());
		      }
		      else {
		    	  List<Order> listOrder = orderService.getOrderByUsername(userService.getUserByUsername(username));
		    	  for(int i = 0; i < listOrder.size(); i++) {
		    		  if(listOrder.get(i).getStatus().equals("Choose")) {
		    			  model.addAttribute("cartForm", listOrder.get(i));
		    			  model.addAttribute("count",listOrder.get(i).getListUserDetails().size());
		    		  }
		    	  }
		    	  
		      }
	      
	      model.addAttribute("username", username);
		return "contact";
		
	}
}
