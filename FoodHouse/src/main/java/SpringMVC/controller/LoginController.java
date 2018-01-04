package SpringMVC.controller;

import java.security.Principal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import SpringMVC.entity.Order;
import SpringMVC.entity.User;
import SpringMVC.service.OrderService;
import SpringMVC.service.UserService;
import SpringMVC.util.Utils;

@Controller
public class LoginController {
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserDetailsService userRoleService;
	@Autowired
	private OrderService orderService;
	
	@RequestMapping(value = { "/", "/welcome" }, method = RequestMethod.GET)
   public String welcomePage(Model model) {
       model.addAttribute("title", "Welcome");
       model.addAttribute("message", "This is welcome page!");
       return "welcomePage";
   }
 
   @RequestMapping(value = "/admin", method = RequestMethod.GET)
   public String adminPage(Model model) {
       return "ad_index";
   }
 
   @RequestMapping(value = "/login", method = RequestMethod.GET)
   public String loginPage(Model model, HttpServletRequest request) {
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
       return "login";
   }
 
   @RequestMapping(value = "/logoutSuccessful", method = RequestMethod.GET)
   public String logoutSuccessfulPage(Model model) {
       //model.addAttribute("title", "Logout");
       return "redirect:/home";
   }
 
   @RequestMapping(value = "/userInfo", method = RequestMethod.GET)
   public String userInfo(Model model, Principal principal) {
 
       // After user login successfully.
       String userName = principal.getName();
 
       System.out.println("User Name: "+ userName);
 
       return "gallery";
   }
 
   @RequestMapping(value = "/403", method = RequestMethod.GET)
   public String accessDenied(Model model, Principal principal) {
        
       if (principal != null) {
           model.addAttribute("message", "Hi " + principal.getName()
                   + "<br> You do not have permission to access this page!");
       } else {
           model.addAttribute("msg",
                   "You do not have permission to access this page!");
       }
       return "403Page";
   }
}
