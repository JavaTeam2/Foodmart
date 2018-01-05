package SpringMVC.controller;

import java.security.Principal;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import SpringMVC.entity.Branch;
import SpringMVC.entity.Food;
import SpringMVC.entity.Order;
import SpringMVC.entity.OrderDetail;
import SpringMVC.entity.User;
import SpringMVC.service.FoodService;
import SpringMVC.service.OrderDetailService;
import SpringMVC.service.OrderService;
import SpringMVC.service.UserService;
import SpringMVC.util.Utils;
@Controller
public class CartController {
	
	@Autowired
	private FoodService foodService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private OrderService orderService;
	
	@Autowired
	private OrderDetailService orderDetailService;
	
	@RequestMapping(value = { "/deleteFood" }, method = RequestMethod.POST)
	public String deleteFood(HttpServletRequest request, Model model, 
							@RequestParam(value = "code", defaultValue = "") String code,
							@ModelAttribute("cartForm") Order cartForm) {
		int id  = -1;
		System.out.println("cartForm: " + cartForm.getId());
	       Food food = null;
	       if (code != null && code.length() > 0) {
	    	  id  = Integer.parseInt(code);
	    	   food = foodService.getFood(id);
	    	   System.out.println("name: " + food.getName());
	       }
	       if (food != null) {
	    	   
 			   //cartForm.getListUserDetails().remove(i);
 			   for(int i = 0; i < cartForm.getListUserDetails().size(); i++) {
 				   if(cartForm.getListUserDetails().get(i).getFood_id().getId() == food.getId()) {
 					   cartForm.getListUserDetails().remove(i);
 					  orderDetailService.deleteOrderDetails(cartForm.getListUserDetails().get(i).getId());
 				   }
 			   }
	    	   
 			   double total = 0;
 			   for(int m = 0; m < cartForm.getListUserDetails().size(); m++) {
	   				total = total + cartForm.getListUserDetails().get(m).getPrice();
 			   }

	   			  cartForm.setTotal_money(total);
	   			  orderService.updateOrder(cartForm);
	       }
		return "redirect:/shoppingCart";
	}
	
	/*@RequestMapping(value = { "/userDeleteFood" }, method = RequestMethod.POST)
	public String userDeleteFood(HttpServletRequest request, Model model, 
			@RequestParam(value = "code", defaultValue = "") String code,
			@ModelAttribute("cartForm") Order cartForm) {
		
		return "redirect:/shoppingCart";
	}*/
	
	@RequestMapping({ "/buyProduct" })
	   public String listProductHandler(HttpServletRequest request, Model model, //
	           @RequestParam(value = "code", defaultValue = "") String code) {
		   int id  = -1;
	       Food food = null;
	       if (code != null && code.length() > 0) {
	    	  id  = Integer.parseInt(code);
	    	   food = foodService.getFood(id);
	    	   System.out.println("name: " + food.getName());
	       }
	       if (food != null) {
	 
	         
	           // Thông tin giỏ hàng có thể đã lưu vào trong Session trước đó.
	           Order order = Utils.getOrderInSession(request);
	           //System.out.println("id order:" + order.getId());
	           System.out.println("loa loa loa");
	           order.addFood(food, 1);
	           double total = 0;
	   			  for(int m = 0; m < order.getListUserDetails().size(); m++) {
	   					total = total + order.getListUserDetails().get(m).getPrice();
	   			  }
	   			order.setTotal_money(total);
	           System.out.println("loa loa loa");
	           //orderDetailService.addOrderDetail(orderDetail);

	       }
	    
	       // Chuyển sang trang danh sách các sản phẩm đã mua.
	       return "redirect:/shoppingCart";
	   }
	 
	// GET: Hiển thị giỏ hàng.
	   @RequestMapping(value = { "/shoppingCart" }, method = RequestMethod.GET)
	   public String shoppingCartHandler(HttpServletRequest request, Model model) {
		   //model.addAttribute("cartForm", new Order());
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
	       return "cart";
	   }
	   
	   
	   // POST: Cập nhập số lượng cho các sản phẩm đã mua.
	   @RequestMapping(value = { "/shoppingCart" }, method = RequestMethod.POST)
	   public String shoppingCartUpdateQty(HttpServletRequest request, //
	           Model model, //
	           @ModelAttribute("cartForm") Order cartForm) {
		   Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		      String username = auth.getName();
		      
		   Order myCart = null;
		      if(username.equals("anonymousUser")) {
		    	  myCart = Utils.getOrderInSession(request);
		    	  myCart.updateQuantity(cartForm);
		    	  
		    	  
		    	  double total = 0;
	   			  for(int m = 0; m < myCart.getListUserDetails().size(); m++) {
	   					total = total + myCart.getListUserDetails().get(m).getPrice();
	   			  }
		    	  myCart.setTotal_money(total);
		      }
		      else {
		    	  //myCart = orderService.getOrderByUsername(userService.getUserByUsername(username));
		    	  System.out.println("cart form id shopping cart: " + cartForm.getCustomer_name());
		    	  for(int i = 0; i < cartForm.getListUserDetails().size(); i++) {
		    		  if(cartForm.getListUserDetails().get(i).getQuantity() == 0) {
		    			  orderDetailService.deleteOrderDetails(cartForm.getListUserDetails().get(i).getId());
		    			  cartForm.getListUserDetails().remove(i);
		    			  
		    			  double total = 0;
			   			  for(int m = 0; m < cartForm.getListUserDetails().size(); m++) {
			   					total = total + cartForm.getListUserDetails().get(m).getPrice();
			   			  }

			   			  cartForm.setTotal_money(total);
			   			  orderService.updateOrder(cartForm);
		    		  }
		    		  else {
		    			  //cartForm.getListUserDetails().get(i).setPrice(cartForm.getListUserDetails().get(i).getQuantity() * cartForm.getListUserDetails().get(i).getFood_id().getPrice());
		    			  //System.out.println("gia cap nhat: " + cartForm.getListUserDetails().get(i).getQuantity() * cartForm.getListUserDetails().get(i).getFood_id().getPrice());
		    			  Food food = foodService.getFood(cartForm.getListUserDetails().get(i).getFood_id().getId()); 
		    			  cartForm.getListUserDetails().get(i).setPrice(food.getPrice() * cartForm.getListUserDetails().get(i).getQuantity());
		    			  orderDetailService.updateOrderDetail(cartForm.getListUserDetails().get(i));
		    			  
		    			  ////
		    			  double total = 0;
			   			  for(int m = 0; m < cartForm.getListUserDetails().size(); m++) {
			   					total = total + cartForm.getListUserDetails().get(m).getPrice();
			   			  }

			   			  cartForm.setTotal_money(total);
			   			  orderService.updateOrder(cartForm);
		    		  }
		    	  }
				   
		    	  //orderService.updateOrder(cartForm);
		      }

	 
	     
	       // Chuyển sang trang danh sách các sản phẩm đã mua.
	       return "redirect:/shoppingCart";
	   }
	   
	   @SuppressWarnings("deprecation")
	@RequestMapping(value = { "/userBuyProduct" }, method = RequestMethod.GET)
	   public String listUserProductHandler(HttpServletRequest request, Model model, //
	           @RequestParam(value = "code", defaultValue = "") String code,
	           Principal principal) {

		   /*int id  = -1;
	       Food food = null;
	       if (code != null && code.length() > 0) {
	    	  id  = Integer.parseInt(code);
	    	   food = foodService.getFood(id);
	    	   System.out.println("name: " + food.getName());
	       }
	       if (id != -1) {
	 
	         
	           // Thông tin giỏ hàng có thể đã lưu vào trong Session trước đó.
	           Order order = Utils.getOrderInSession(request);
	           //System.out.println("id order:" + order.getId());
	           System.out.println("loa loa loa");
	           order.addFood(food, 1);
	           System.out.println("loa loa loa");
	           //orderDetailService.addOrderDetail(orderDetail);

	       }*/
		   
		   
		   int id = -1;
		   Food food = null;
		   if (code != null && code.length() > 0) {
			   id = Integer.parseInt(code);
			   food = foodService.getFood(id);
		   }
		   
		   if(food != null) {
			   String userName = principal.getName();
			   System.out.println("user name: " + userName);
			   User user = userService.getUserByUsername(userName);
			   System.out.println("user id: " + user.getId());
			   List<Order> listOrder = orderService.getOrderByUsername(userService.getUserByUsername(userName));
			   if(listOrder.size() == 0) {
				   //tao moi order
				   Branch branch = null;
				   java.sql.Date day = new java.sql.Date(new java.util.Date().getTime());
				   //Time time = new Time(day.getTime());
				   Order order = new Order(user,  branch, user.getName(), user.getPhone(), user.getEmail(), user.getAddress(), user.getCity(), user.getProvince(), 0.0, day, "Choose", "");
				   orderService.addOrder(order);
				// Lay order vua tao
				   List<Order> list = orderService.getOrderByUsername(user);
				   for(int i = 0; i < list.size(); i++) {
					   if(list.get(i).getStatus().equals("Choose")) {
						   OrderDetail orderDetail = list.get(i).findLineById(food.getId());
			   			   if(orderDetail == null) {
			   				   orderDetail = new OrderDetail(list.get(i), food, food.getPrice(), 1);
			   				   orderDetailService.addOrderDetail(orderDetail);
			   				   list.get(i).getListUserDetails().add(orderDetail);
				   				double total = 0;
				   				for(int m = 0; m < list.get(i).getListUserDetails().size(); m++) {
				   					total = total + list.get(i).getListUserDetails().get(m).getPrice();
				   				}
				   				System.out.println("tong tien tao moi: " + total);
				   				list.get(i).setTotal_money(total);
				   				orderService.updateOrder(list.get(i));
			   			   }
			   			   else {
			   				   System.out.println("cap nhat");
			   				   orderDetail.setQuantity(orderDetail.getQuantity() + 1);
			   				   orderDetail.setPrice(orderDetail.getQuantity() * orderDetail.getFood_id().getPrice());
			   				   orderDetailService.updateOrderDetail(orderDetail);
				   				double total = 0;
				   				for(int m = 0; m < list.get(i).getListUserDetails().size(); m++) {
				   					total = total + list.get(i).getListUserDetails().get(m).getPrice();
				   				}
				   				System.out.println("tong tien cap nhat: " + total);
				   				list.get(i).setTotal_money(total);
				   				orderService.updateOrder(list.get(i));
			   			
			   			   }
					   }
				   }
				   
			   }
			   else {
				   boolean hasChoose = false;
				    for(int i = 0; i < listOrder.size(); i++) {
			    		if(listOrder.get(i).getStatus().equals("Choose")) {
			    			System.out.println("kiem tra sai");
			    			hasChoose = true;
			    			OrderDetail orderDetail = listOrder.get(i).findLineById(food.getId());
			    			if(orderDetail == null) {
			   				   orderDetail = new OrderDetail(listOrder.get(i), food, food.getPrice(), 1);
			   				   orderDetailService.addOrderDetail(orderDetail);
			   				   
			   				   System.out.println("truoc update: " + listOrder.get(i).getTotal_money());
			   				   listOrder.get(i).setTotal_money(listOrder.get(i).getTotal_money() + food.getPrice());
				   			//orderService.calTotalCost(listOrder.get(i));
				   			System.out.println("sau update: " + listOrder.get(i).getTotal_money());
				   			orderService.updateOrder(listOrder.get(i));
			   			    }
			   			    else {
			   				   orderDetail.setQuantity(orderDetail.getQuantity() + 1);
			   				   orderDetail.setPrice(orderDetail.getQuantity() * food.getPrice());
			   				   System.out.println("gia thuc an: " + food.getPrice());
			   				   orderDetailService.updateOrderDetail(orderDetail);
				   				double total = 0;
				   				for(int m = 0; m < listOrder.get(i).getListUserDetails().size(); m++) {
				   					total = total + listOrder.get(i).getListUserDetails().get(m).getPrice();
				   				}
				   				System.out.println("tong tien cap nhat: " + total);
				   				listOrder.get(i).setTotal_money(total);
				   				orderService.updateOrder(listOrder.get(i));
			   			    }
			    			
			    			break;
			    		}
				    }
				    if(hasChoose == false) {
				    	Branch branch = null;
						   
						   //tao moi order
				    	//java.sql.Date day = new java.sql.Date(new java.util.Date().getTime());
						   //Time time = new Time(day.getTime());
				    	   Date day = new Date();
						   Order order = new Order(user,  branch, user.getName(), user.getPhone(), user.getEmail(), user.getAddress(), user.getCity(), user.getProvince(), 0.0, day, "Choose", "");
						   orderService.addOrder(order);
						   
						// Lay order vua tao
						   List<Order> list = orderService.getOrderByUsername(user);
						   for(int i = 0; i < list.size(); i++) {
							   System.out.println("Time get: " + list.get(i).getDate_time());
							   System.out.println("Time new: " + day);
							   System.out.println("so sanh: " + list.get(i).getDate_time().equals(day));
							   if(list.get(i).getStatus().equals("Choose")) {
								   OrderDetail orderDetail = list.get(i).findLineById(food.getId());
								   System.out.println("order detail: " + orderDetail);
					   			   if(orderDetail == null) {
					   				   System.out.println("tao moi");
					   				   orderDetail = new OrderDetail(list.get(i), food, food.getPrice(), 1);
					   				   orderDetailService.addOrderDetail(orderDetail);
					   				   list.get(i).getListUserDetails().add(orderDetail);
					   				   //cap nhat tien order
					   				   
					   				double total = 0;
					   				for(int m = 0; m < list.get(i).getListUserDetails().size(); m++) {
					   					total = total + list.get(i).getListUserDetails().get(m).getPrice();
					   				}
					   				System.out.println("tong tien tao moi: " + total);
					   				list.get(i).setTotal_money(total);
					   				orderService.updateOrder(list.get(i));
					   			   }
					   			   else {
					   				   System.out.println("cap nhat");
					   				   orderDetail.setQuantity(orderDetail.getQuantity() + 1);
					   				   orderDetail.setPrice(orderDetail.getQuantity() * orderDetail.getFood_id().getPrice());
					   				   orderDetailService.updateOrderDetail(orderDetail);
					   				double total = 0;
					   				for(int m = 0; m < list.get(i).getListUserDetails().size(); m++) {
					   					total = total + list.get(i).getListUserDetails().get(m).getPrice();
					   				}
					   				System.out.println("tong tien cap nhat: " + total);
					   				list.get(i).setTotal_money(total);
					   				orderService.updateOrder(list.get(i));
					   			   }
					   			
							   }
							   
						   }
				    }
				   
				   
				   
			   }
			   
			   
			   
		   }
	       // Chuyển sang trang danh sách các sản phẩm đã mua.
	       return "redirect:/shoppingCart";
	   }
}
