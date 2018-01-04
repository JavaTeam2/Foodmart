package SpringMVC.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import SpringMVC.entity.Branch;
import SpringMVC.entity.Food;
import SpringMVC.entity.Order;
import SpringMVC.service.BranchService;
import SpringMVC.service.OrderService;
import SpringMVC.service.UserService;
import SpringMVC.util.Utils;
@Controller
public class OurBranchesController {
	@Autowired
	private BranchService branchService;
	@Autowired
	private OrderService orderService;
	
	@Autowired
	private UserService userService;
    @RequestMapping("/our_branches")
    public String listBranch(Model model, HttpServletRequest request) {
    	List<Branch> listBranches = branchService.getBranches();
	 	List<Branch> listHCM = new ArrayList<Branch>();
	 	List<Branch> listHANOI = new ArrayList<Branch>();
	 	List<Branch> listDANANG = new ArrayList<Branch>();
	 	List<Branch> listNHATRANG = new ArrayList<Branch>();
	 	
	 	listHCM = branchService.getHCMBranches(listBranches);
	 	listHANOI = branchService.getHaNoiBranches(listBranches);
	 	listDANANG = branchService.getDaNangBranches(listBranches);
	 	listNHATRANG = branchService.getNhaTrangBranches(listBranches);
	 	
	 	model.addAttribute("listBranches", listBranches);
	 	
	 	model.addAttribute("listHCM", listHCM);
	 	model.addAttribute("listHANOI", listHANOI);
	 	model.addAttribute("listDANANG", listDANANG);
	 	model.addAttribute("listNHATRANG", listNHATRANG);
	 	//model.addAttribute("listBranch", listBranch);
	 	
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
	      
        return "our_branches";
        
    }
}
