package SpringMVC.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import SpringMVC.entity.Categories;
import SpringMVC.service.CategoriesService;

@Controller
public class AdminCategoriesController {
	@Autowired
	private CategoriesService categoriesService;

	@RequestMapping("admin/categories")
	public String categories(Model model) {
		List<Categories> categories = categoriesService.getListCategories();
		model.addAttribute("categories", categories);
		return "ad_categories";

	}
	
	@RequestMapping({ "admin/categories/add" })
	public String addbook(Model model) {
		Categories categoriesForm = new Categories();
		model.addAttribute("categoriesForm", categoriesForm);
		return "ad_addCategories";
	}

	
	@RequestMapping(value = "admin/categories/add", method = RequestMethod.POST)
	public String addbook(Model model, @ModelAttribute("bookCategories") Categories categories, BindingResult result) {
		String message = "";
		
		categories.setId(categories.getId());
		categories.setName(categories.getName().trim());
		
		if (message.equals("")) {
			this.categoriesService.addCategories(categories);
			return "redirect:/admin/categories";
		}

		model.addAttribute("message", message);

		return "ad_addCategories";
	}

}
