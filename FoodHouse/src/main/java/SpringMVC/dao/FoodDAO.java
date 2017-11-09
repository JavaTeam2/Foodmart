package SpringMVC.dao;

import java.util.List;

import SpringMVC.entity.Food;

public interface FoodDAO {
	public void addFood(Food food);
	public void updateFood(Food food);
	public Food getFood(int id);
	public void deleteFood(int id);
	public List<Food> getFoods();
}
