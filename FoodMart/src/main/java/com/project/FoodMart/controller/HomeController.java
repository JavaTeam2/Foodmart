package com.project.FoodMart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	@RequestMapping("/Home")
	public String home(Model model) {       
	        return "index";
	}
	    
	@RequestMapping("/Checkout")
	public String checkout(Model model) {       
	        return "checkout";
	}
	
	@RequestMapping("/Contact")
	public String contact(Model model) {       
	        return "contact";
	}
	
	@RequestMapping("/Login")
	public String login(Model model) {       
	        return "login";
	}
	
	@RequestMapping("/Order")
	public String order(Model model) {       
	        return "order";
	}
	
	@RequestMapping("/Order-list")
	public String orders_list(Model model) {       
	        return "orders-list";
	}
	
	@RequestMapping("/Register")
	public String register(Model model) {       
	        return "register";
	}
	
	@RequestMapping("/Restaurants")
	public String restaurants(Model model) {       
	        return "restaurants";
	}
}
