package SpringMVC.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import SpringMVC.entity.Food;
import SpringMVC.entity.Order;
import SpringMVC.entity.OrderDetail;
import SpringMVC.service.FoodService;
import SpringMVC.service.OrderDetailService;
import SpringMVC.service.OrderService;

@Controller
public class HomeController {
	/*@Autowired
	private OrderService orderService;*/
	
	@Autowired
	private OrderDetailService orderDetailService;
	
	@RequestMapping(value= {"/home", "/", ""})
	public String home(Model model) {
		List<OrderDetail> listOrderDetails = orderDetailService.getOrderDetails();
		
		for(int i = 0; i < listOrderDetails.size(); i++) {
			
			System.out.println(listOrderDetails.get(i).getPrice());
		}
		//System.out.println(listFood.get(0).getCustomer_city());
		List<Food> listSpecial = new ArrayList<Food>();
		/*listSpecial = foodService.getSpecialFood(listFood);*/
		
		model.addAttribute("listSpecial", listSpecial);
		return "index";
	}
}
