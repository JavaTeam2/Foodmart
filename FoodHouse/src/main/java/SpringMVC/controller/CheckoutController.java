package SpringMVC.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import SpringMVC.entity.*;
import SpringMVC.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import SpringMVC.util.Utils;

@Controller
public class CheckoutController {
	@Autowired
	private UserService userService;
	
	@Autowired
	private BranchService branchService;
	
	@Autowired
	private OrderService orderService;
	
	@Autowired
	private FoodService foodService;

	@Autowired
	private OrderDetailService orderDetailService;
	/*@InitBinder
	public void initBinder(WebDataBinder binder) {
	    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
	    sdf.setLenient(true);
	    binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
	}*/
	
	@RequestMapping(value = { "/checkout" }, method = RequestMethod.GET)
	public String checkoutHandler(HttpServletRequest request, Model model) {
		List<Food> listFood = foodService.getFoods();
		List<Food> listSpecial = new ArrayList<Food>();
		listSpecial = foodService.getSpecialFood(listFood);			
		model.addAttribute("listSpecial", listSpecial);
		
	
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	      String username = auth.getName();
	      Order myCart = null;
		 if(username.equals("anonymousUser")) {
			 myCart = Utils.getOrderInSession(request);
			 model.addAttribute("cartForm", myCart);
			 model.addAttribute("cartForm_list", myCart.getListUserDetails());
			 model.addAttribute("count", myCart.getListUserDetails().size());
	      }
	      else {
	    	  List<Order> listOrder = orderService.getOrderByUsername(userService.getUserByUsername(username));
	    	  for(int i = 0; i < listOrder.size(); i++) {
	    		  if(listOrder.get(i).getStatus().equals("Choose")) {
	    			  model.addAttribute("cartForm", listOrder.get(i));
					  model.addAttribute("cartForm_list", listOrder.get(i).getListUserDetails());
	    			  model.addAttribute("count",listOrder.get(i).getListUserDetails().size());
	    		  }
	    	  }
	    	  User user = userService.getUserByUsername(username);
	    	  model.addAttribute("user", user);
	      }
		 List<Branch> listBranch = branchService.getBranches();
		 model.addAttribute("listBranch", listBranch);
		 model.addAttribute("username", username);
		 
		return "checkout";
	}
	
	@RequestMapping(value = {"/checkoutConfirmation"}, method = RequestMethod.POST)
	public String checkoutConfirmation(HttpServletRequest request,
									   Model model,
									   @ModelAttribute("cartForm") Order cartForm, @RequestParam(value = "orderdetails")String[] orderdetails) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	      String username = auth.getName();

	      //System.out.println("cart form id checkout confirm: " + cartForm.getCustomer_name());
	      Order myCart = null;
	      if(username.equals("anonymousUser")) {
	    	  myCart = Utils.getOrderInSession(request);
	    	  myCart.setCustomer_name(cartForm.getCustomer_name());
	    	  myCart.setCustomer_phone(cartForm.getCustomer_phone());
	    	  myCart.setCustomer_address(cartForm.getCustomer_address());
	    	  myCart.setCustomer_city(cartForm.getCustomer_city());
	    	  myCart.setNote(cartForm.getNote());
	    	  myCart.setStatus("Place");
			  for (int i =0; i< orderdetails.length/4; i++){
				  int order_id =Integer.valueOf(orderdetails[i]);
				  int food_id = Integer.valueOf(orderdetails[i+1]);
				  double price = Double.valueOf(orderdetails[i+2]);
				  int odd_id = Integer.valueOf(orderdetails[i+3]);
				  OrderDetail orderDetail = new OrderDetail();
				  orderDetail.setFood_id(foodService.getFood(food_id));
				  orderDetail.setPrice(price);
				  orderDetail.setOrder_id(cartForm);
				  orderDetailService.addOrderDetail(orderDetail);
			  }
	    	  orderService.calTotalCost(myCart);
	      }
	      else {
	    	  //myCart = orderService.getOrderByUsername(userService.getUserByUsername(username));
	    	  String branch_id=request.getParameter("shipping_branch");
	    	  cartForm.setCustomer_id(userService.getUser(cartForm.getCustomer_id().getId()));
	    	  cartForm.setBranch_id(branchService.getBranch(Integer.parseInt(branch_id)));
	    	  cartForm.setStatus("Place");
			  for (int i =0; i< orderdetails.length/4; i++){
				  int order_id =Integer.valueOf(orderdetails[i]);
				  int food_id = Integer.valueOf(orderdetails[i+1]);
				  double price = Double.valueOf(orderdetails[i+2]);
				  int odd_id = Integer.valueOf(orderdetails[i+3]);
				  OrderDetail orderDetail = new OrderDetail();
				  orderDetail.setFood_id(foodService.getFood(food_id));
				  orderDetail.setPrice(price);
				  orderDetail.setOrder_id(cartForm);
				  orderDetailService.addOrderDetail(orderDetail);
			  }
	    	  orderService.calTotalCost(cartForm);
	    	  System.out.println("Cart form note: " + cartForm.getNote());
	    	  orderService.updateOrder(cartForm);
	      }
	      model.addAttribute("username", username);
		return "redirect:/orderHistory";
	}
			   
}
