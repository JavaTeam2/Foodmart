package SpringMVC.dao.impl;

import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import SpringMVC.dao.FoodDAO;
import SpringMVC.entity.Food;

@Repository
public class FoodDAOImpl implements FoodDAO{
	@Autowired
	private SessionFactory sessionFactory;
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	
	public void addFood(Food food) {
		// TODO Auto-generated method stub
		getCurrentSession().save(food);
	}
	

	public void updateFood(Food food) {
		// TODO Auto-generated method stub
		Food foodToUpdate = getFood(food.getId());
		foodToUpdate.setName(food.getName());
		foodToUpdate.setPrice(food.getPrice());
		foodToUpdate.setPrice_promotion(food.getPrice_promotion());
		foodToUpdate.setImage(food.getImage());
		foodToUpdate.setDescription(food.getDescription());
		getCurrentSession().update(foodToUpdate);
	}


	public Food getFood(int id) {
		// TODO Auto-generated method stub
		Food food = (Food) getCurrentSession().get(Food.class, id);
		return food;
	}


	public void deleteFood(int id) {
		// TODO Auto-generated method stub
		Food food = getFood(id);
		if(food != null) {
			getCurrentSession().delete(food);
		}
	}

	@SuppressWarnings("unchecked")
	public List<Food> getFoods() {
		// TODO Auto-generated method stub
		return getCurrentSession().createQuery("Select e from " + Food.class.getName() + " e").list();
	}
	
}
