package SpringMVC.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import SpringMVC.entity.Branch;
import SpringMVC.entity.Food;
import SpringMVC.service.BranchService;
@Controller
public class OurBranchesController {
	@Autowired
	private BranchService branchService;
	
    @RequestMapping("/our_branches")
    public String listBranch(Model model) {
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
        return "our_branches";
        
    }
}
