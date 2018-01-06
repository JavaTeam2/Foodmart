package SpringMVC.service.impl;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import SpringMVC.dao.FoodDAO;
import SpringMVC.entity.Categories;
import SpringMVC.entity.Food;
import SpringMVC.service.FoodService;
@Service
@Transactional
public class FoodServiceImpl implements FoodService{
	
	@Autowired
	private FoodDAO foodDAO;
	
	
	private static final String STARTERS_FOOD = "Starters";
	private static final String MAINCOURSE_FOOD = "Maincourse";
	private static final String SALADS_FOOD = "Salads";
	private static final String DESSERTS_FOOD = "Desserts";
	private static final String SPECIAL_FOOD = "Special";
	
	public List<Food> getStartersFood(List<Food> listFood) {
		List<Food> listStartersFood = new ArrayList<Food>();
		for(Food food:listFood) {
			Set<Categories> listCate = food.getCategories();
			for (Iterator<Categories> iterator = listCate.iterator(); iterator.hasNext();){
				Categories cate = (Categories) iterator.next(); 
				if(cate.getName().equals(STARTERS_FOOD)) {
					listStartersFood.add(food);
				}
	        }
		}
		return listStartersFood;
	}
	
	@Override
	public List<Food> getMainCourseFood(List<Food> listFood) {
		// TODO Auto-generated method stub
		List<Food> listMainCourseFood = new ArrayList<Food>();
		for(Food food:listFood) {
			Set<Categories> listCate = food.getCategories();
			for (Iterator<Categories> iterator = listCate.iterator(); iterator.hasNext();){
				Categories cate = (Categories) iterator.next(); 
				if(cate.getName().equals(MAINCOURSE_FOOD)) {
					listMainCourseFood.add(food);
				}
	        }
		}
		return listMainCourseFood;
	}
	@Override
	public List<Food> getSaladsFood(List<Food> listFood) {
		// TODO Auto-generated method stub
		List<Food> listSaladsFood = new ArrayList<Food>();
		for(Food food:listFood) {
			Set<Categories> listCate = food.getCategories();
			for (Iterator<Categories> iterator = listCate.iterator(); iterator.hasNext();){
				Categories cate = (Categories) iterator.next(); 
				if(cate.getName().equals(SALADS_FOOD)) {
					listSaladsFood.add(food);
				}
	        }
		}
		return listSaladsFood;
	}
	@Override
	public List<Food> getDessertsFood(List<Food> listFood) {
		// TODO Auto-generated method stub
		List<Food> listDessertsFood = new ArrayList<Food>();
		for(Food food:listFood) {
			Set<Categories> listCate = food.getCategories();
			for (Iterator<Categories> iterator = listCate.iterator(); iterator.hasNext();){
				Categories cate = (Categories) iterator.next(); 
				if(cate.getName().equals(DESSERTS_FOOD)) {
					listDessertsFood.add(food);
				}
	        }
		}
		return listDessertsFood;
	}
	
	@Override
	public List<Food> getSpecialFood(List<Food> listFood) {
		// TODO Auto-generated method stub
		List<Food> listSpecialFood = new ArrayList<Food>();
		for(Food food:listFood) {
			Set<Categories> listCate = food.getCategories();
			for (Iterator<Categories> iterator = listCate.iterator(); iterator.hasNext();){
				Categories cate = (Categories) iterator.next(); 
				if(cate.getName().equals(SPECIAL_FOOD)) {
					listSpecialFood.add(food);
				}
	        }
		}
		return listSpecialFood;
	}
	
	
	public void addFood(Food food) {
		// TODO Auto-generated method stub
		foodDAO.addFood(food);
	}

	
	public void updateFood(Food food) {
		// TODO Auto-generated method stub
		foodDAO.updateFood(food);
	}

	
	public Food getFood(int id) {
		// TODO Auto-generated method stub
		return foodDAO.getFood(id);
	}

	
	public void deleteFood(int id) {
		// TODO Auto-generated method stub
		foodDAO.deleteFood(id);
	}

	
	public List<Food> getFoods() {
		// TODO Auto-generated method stub
		return foodDAO.getFoods();
	}


	
	
	
}
