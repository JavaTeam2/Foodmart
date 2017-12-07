package SpringMVC.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import SpringMVC.entity.Food;
import SpringMVC.service.FoodService;

@Controller
public class HomeController {
	@Autowired
	private FoodService foodService;
	@RequestMapping(value= {"/home", "/", ""})
	public String home(Model model) {
		List<Food> listFood = foodService.getFoods();
		
		List<Food> listSpecial = new ArrayList<Food>();
		listSpecial = foodService.getSpecialFood(listFood);
		
		model.addAttribute("listSpecial", listSpecial);
		return "index";
	}
}
