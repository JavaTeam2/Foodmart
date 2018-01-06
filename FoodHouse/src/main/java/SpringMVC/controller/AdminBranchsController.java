package SpringMVC.controller;

import java.util.List;
import java.util.Set;

import SpringMVC.entity.Food;
import SpringMVC.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import SpringMVC.entity.Branch;
import SpringMVC.entity.Categories;
import SpringMVC.service.BranchService;


@Controller
public class AdminBranchsController {
	@Autowired
	private BranchService branchService;
	@Autowired
	private FoodService foodService;
	
	@RequestMapping("admin/branchs")
	public String foods(Model model) {
		List<Branch> branchs = branchService.getBranches();
		model.addAttribute("branchs", branchs);
		return "ad_branchs";
	}
	
	@RequestMapping({ "admin/branchs/add" })
	public String addBranch(Model model) {
		Branch branchForm = new Branch();
		model.addAttribute("branchForm", branchForm);
		return "ad_addBranch";
	}

	@RequestMapping(value = "admin/branchs/add", method = RequestMethod.POST)
	public String addBranchs(Model model, @ModelAttribute("branchForm") Branch branch,
			BindingResult result) {
		String message = "";

		branch.setId(branch.getId());
		branch.setName(branch.getName().trim());
		System.out.println("Message: " + message);

		if (message.equals("")) {
			this.branchService.addBranch(branch);
			return "redirect:/admin/branchs";
		}

		model.addAttribute("message", message);

		return "ad_addBranchs";
	}
	
	@RequestMapping( "admin/branchs/edit-branch/{id}" )
	public String editBranch(Model model, @PathVariable("id") int id) {
		Branch branch;
		branch = branchService.getBranch(id);
		if (branch != null) {
			model.addAttribute("branchForm", branch);
			return "ad_editBranch";
		}
		return "redirect:/admin/branchs";
	}

	@RequestMapping(value = "admin/branchs/edit-branch/{id}", method = RequestMethod.POST)
	public String editBranch(Model model, @ModelAttribute("branchForm") Branch branch,
			BindingResult result) {
		String message = "";

		branch.setId(branch.getId());

		branch.setName(branch.getName().trim());

		if (message.equals("")) {
			this.branchService.updateBranch(branch);
			return "redirect:/admin/branchs";	
		}

		model.addAttribute("message", message);

		return "ad_editBranch";
	}
	

	@RequestMapping(value = "admin/branchs/delete-branch", method = RequestMethod.POST)
	public String deleteMultiBranchs(@RequestParam("check") int[] id, Model model) {
		// System.out.println("1");
		if (id == null) {
			return "redirect:/admin/branchs";
		}

		for (int i = 0; i < id.length; i++) {
			List<Food> foods = foodService.getFoods();
			for (Food foodItem: foods){
				foodItem.getBranches().remove(branchService.getBranch(id[i]));
			}
			this.branchService.deleteBranch(id[i]);
		}
		return "redirect:/admin/branchs";
	}

	@RequestMapping(value = "admin/branchs/delete-branch/{id}", method = RequestMethod.GET)
	public String deleteSingleBranch( @PathVariable Integer id) {
		 //System.out.println("2");
		if (id <= 0) {
			return "redirect:/admin/branchs";
		}
		Branch branch = branchService.getBranch(id);
		branch.getFoods().clear();
		for (Food foodItem: foodService.getFoods()){
			foodItem.getBranches().remove(branch);
			int a = 3;
		}
		branchService.deleteBranch(id);

		return "redirect:/admin/branchs";
	}


}
