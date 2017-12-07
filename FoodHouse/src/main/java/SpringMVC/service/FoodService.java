package SpringMVC.service;

import java.util.List;

import SpringMVC.entity.Food;

public interface FoodService {
	public void addFood(Food food);
	public void updateFood(Food food);
	public Food getFood(int id);
	public void deleteFood(int id);
	public List<Food> getFoods();
	public List<Food> getStartersFood(List<Food> listFood);
	public List<Food> getMainCourseFood(List<Food> listFood);
	public List<Food> getSaladsFood(List<Food> listFood);
	public List<Food> getDessertsFood(List<Food> listFood);
	public List<Food> getSpecialFood(List<Food> listFood);
}
