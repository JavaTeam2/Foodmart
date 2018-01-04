package SpringMVC.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import SpringMVC.entity.Food;
import SpringMVC.entity.Order;
import SpringMVC.entity.OrderDetail;
import SpringMVC.service.FoodService;
import SpringMVC.service.OrderDetailService;
import SpringMVC.service.OrderService;
import SpringMVC.service.UserService;
import SpringMVC.util.Utils;

@Controller
public class HomeController {
	/*@Autowired
	private OrderService orderService;*/

	@Autowired
	private UserService userService;
	@Autowired
	private OrderService orderService;
	@Autowired
	private OrderDetailService orderDetailService;
	
	@RequestMapping(value= {"/home", "/", ""})
	public String home(Model model, HttpServletRequest request) {
		List<OrderDetail> listOrderDetails = orderDetailService.getOrderDetails();
		
		for(int i = 0; i < listOrderDetails.size(); i++) {
			
			System.out.println(listOrderDetails.get(i).getPrice());
		}
		//System.out.println(listFood.get(0).getCustomer_city());
		List<Food> listSpecial = new ArrayList<Food>();
		/*listSpecial = foodService.getSpecialFood(listFood);*/
		
		model.addAttribute("listSpecial", listSpecial);
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	      String username = auth.getName();
	      Order myCart = null;
		 	if(username.equals("anonymousUser")) {
		    	  myCart = Utils.getOrderInSession(request);
		    	  model.addAttribute("cartForm", myCart);
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
		return "index";
	}
}
