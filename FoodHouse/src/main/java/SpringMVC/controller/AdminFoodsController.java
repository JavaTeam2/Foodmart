package SpringMVC.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import SpringMVC.entity.Categories;
import SpringMVC.entity.Food;
import SpringMVC.service.FoodService;

@Controller
public class AdminFoodsController {

	@Autowired
	private FoodService foodService;

	@RequestMapping("admin/foods")
	public String foods(Model model) {
		List<Food> foods = foodService.getFoods();
		model.addAttribute("foods", foods);
		return "ad_foods";
	}
	
	@RequestMapping( value = "admin/foods/add",  method = RequestMethod.GET  )
	public String addFood(Model model) {
		Food foodForm = new Food();
		model.addAttribute("foodForm", foodForm);
		return "ad_addFood";
	}

	@RequestMapping(value = "admin/foods/add", method = RequestMethod.POST)
	public String addFood(Model model, @ModelAttribute("foodForm") Food food,
			BindingResult result) {
		String message = "";

		food.setId(food.getId());
		food.setName(food.getName().trim());

		if (message.equals("")) {
			this.foodService.addFood(food);
			return "redirect:/admin/foods";
		}

		model.addAttribute("message", message);

		return "ad_addFood";
	}
	
	@RequestMapping({ "/admin/foods/edit-food/{id}" })
	public String editFood(Model model, @PathVariable("id") int id) {
		Food food;
		food = foodService.getFood(id);
		if (food != null) {
			model.addAttribute("foodForm", food);
			return "ad_editFood";
		}
		return "redirect:/admin/foods";
	}

	@RequestMapping(value = "admin/foods/edit-food/{id}", method = RequestMethod.POST)
	public String editFood(Model model, @ModelAttribute("foodForm") Food food,
			BindingResult result) {
		String message = "";

		food.setId(food.getId());

		food.setName(food.getName().trim());

		if (message.equals("")) {
			this.foodService.updateFood(food);
			return "redirect:/admin/foods";
		}

		model.addAttribute("message", message);

		return "ad_addFood";
	}
	
	@RequestMapping(value = "admin/foods/delete-foods", method = RequestMethod.POST)
	public String deleteMultiFoods(@RequestParam("check") int[] id, Model model) {
		// System.out.println("1");
		if (id == null) {
			return "redirect:/admin/foods";
		}

		for (int i = 0; i < id.length; i++) {
			this.foodService.deleteFood(id[i]);
		}
		return "redirect:/admin/foods";
	}

	@RequestMapping(value = "admin/foods/delete-food/{id}", method = RequestMethod.GET)
	public String deleteSingleFood( @PathVariable Integer id) {
		 //System.out.println("2");
		if (id <= 0) {
			return "redirect:/admin/foods";
		}

		this.foodService.deleteFood(id);

		return "redirect:/admin/foods";
	}

}
