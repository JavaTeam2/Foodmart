package SpringMVC.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import SpringMVC.entity.Food;
import SpringMVC.entity.Order;
import SpringMVC.service.FoodService;
import SpringMVC.service.OrderService;
import SpringMVC.service.UserService;
import SpringMVC.util.Utils;
@Controller
public class GalleryController {
	@Autowired
	private FoodService foodService;
	

	@Autowired
	private OrderService orderService;
	
	@Autowired
	private UserService userService;
	 @RequestMapping(value = {"/gallery"}, method = RequestMethod.GET)
	    public String gallery(HttpServletRequest request, //
		           Model model) {
		 
		 Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	      String username = auth.getName();
		 	List<Food> listFood = foodService.getFoods();
		 List<Food> listStarters = new ArrayList<Food>();
		 List<Food> listMainCourse = new ArrayList<Food>();
		 List<Food> listSalads = new ArrayList<Food>();
		 List<Food> listDesserts = new ArrayList<Food>();
		 	
		 	/*listStarters = foodService.getStartersFood(listFood);
		 	listMainCourse = foodService.getMainCourseFood(listFood);
		 	listSalads = foodService.getSaladsFood(listFood);
		 	listDesserts = foodService.getDessertsFood(listFood);
		 	*/
		 	
		 	model.addAttribute("listFood", listFood);
		 	
		 	model.addAttribute("listStarters", listStarters);
		 	model.addAttribute("listMainCourse", listMainCourse);
		 	model.addAttribute("listSalads", listSalads);
		 	model.addAttribute("listDesserts", listDesserts);
		 	model.addAttribute("username", username);
		 	
		 	//hien thi gio hang va so luong thuc an
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

	        return "gallery";  
	    }
	 
	 
}
