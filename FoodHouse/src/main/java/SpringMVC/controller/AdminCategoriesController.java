package SpringMVC.controller;

import java.util.Date;
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
	public String addCategories(Model model) {
		Categories categoriesForm = new Categories();
		model.addAttribute("categoriesForm", categoriesForm);
		return "ad_addCategories";
	}

	@RequestMapping(value = "admin/categories/add", method = RequestMethod.POST)
	public String addCategories(Model model, @ModelAttribute("bookCategories") Categories categories,
			BindingResult result) {
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

	@RequestMapping({ "/admin/edit-categories/{id}" })
	public String editCategories(Model model, @PathVariable("id") int id) {
		Categories categories;
		categories = categoriesService.getCategories(id);
		if (categories != null) {
			model.addAttribute("categoriesForm", categories);
			return "ad_editCategories";
		}
		return "redirect:/admin/categories";
	}

	@RequestMapping(value = "admin/edit-categories/{id}", method = RequestMethod.POST)
	public String editCategories(Model model, @ModelAttribute("categoriesForm") Categories categories,
			BindingResult result) {
		String message = "";

		categories.setId(categories.getId());

		categories.setName(categories.getName().trim());

		if (message.equals("")) {
			this.categoriesService.updateCategories(categories);
			return "redirect:/admin/categories";
		}

		model.addAttribute("message", message);

		return "ad_addCategories";
	}

	@RequestMapping(value = "admin/categories/delete-categories", method = RequestMethod.POST)
	public String deleteMultiCategories(@RequestParam("check") int[] id, Model model) {
		// System.out.println("1");
		if (id == null) {
			return "redirect:/admin/categories";
		}

		for (int i = 0; i < id.length; i++) {
			this.categoriesService.deleteCategories(id[i]);
		}
		return "redirect:/admin/categories";
	}

	@RequestMapping(value = "admin/categories/delete-categories/{id}", method = RequestMethod.GET)
	public String deleteSingleCategories( @PathVariable Integer id) {
		 //System.out.println("2");
		if (id <= 0) {
			return "redirect:/admin/categories";
		}

		this.categoriesService.deleteCategories(id);

		return "redirect:/admin/categories";
	}

}
