package SpringMVC.service;

import java.util.List;

import SpringMVC.entity.Categories;

public interface CategoriesService {
	public void addCategories(Categories categories);
	public void updateCategories(Categories categories);
	public Categories getCategories(int id);
	public void deleteCategories(int id);
	public List<Categories> getListCategories();
}
