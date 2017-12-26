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
public class GalleryController {
	@Autowired
	private FoodService foodService;
	
	 @RequestMapping("/gallery")
	    public String gallery(Model model) {
		 System.out.println("dfsdfsdf");
		 	List<Food> listFood = foodService.getFoods();
		 	List<Food> listStarters = new ArrayList<Food>();
		 	List<Food> listMainCourse = new ArrayList<Food>();
		 	List<Food> listSalads = new ArrayList<Food>();
		 	List<Food> listDesserts = new ArrayList<Food>();
		 	
		 	/*listStarters = foodService.getStartersFood(listFood);
		 	listMainCourse = foodService.getMainCourseFood(listFood);
		 	listSalads = foodService.getSaladsFood(listFood);
		 	listDesserts = foodService.getDessertsFood(listFood);
		 	*/
		 	
		 	model.addAttribute("listFood", listFood);
		 	
		 	model.addAttribute("listStarters", listStarters);
		 	model.addAttribute("listMainCourse", listMainCourse);
		 	model.addAttribute("listSalads", listSalads);
		 	model.addAttribute("listDesserts", listDesserts);
		 	
		 	for(int i = 0; i < listFood.size(); i++) {
		 		System.out.println(listFood.get(i).getName());
		 	}
		 	
	        return "gallery";  
	    }
}
