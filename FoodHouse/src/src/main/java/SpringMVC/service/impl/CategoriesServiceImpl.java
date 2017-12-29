package SpringMVC.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import SpringMVC.dao.CategoriesDAO;
import SpringMVC.entity.Categories;
import SpringMVC.service.CategoriesService;
@Service
@Transactional
public class CategoriesServiceImpl implements  CategoriesService{
	@Autowired
	private CategoriesDAO categoriesDAO;

	public void addCategories(Categories categories) {
		// TODO Auto-generated method stub
		categoriesDAO.addCategories(categories);
	}


	public void updateCategories(Categories categories) {
		// TODO Auto-generated method stub
		categoriesDAO.updateCategories(categories);
	}

	
	public Categories getCategories(int id) {
		// TODO Auto-generated method stub
		return categoriesDAO.getCategories(id);
	}

	public void deleteCategories(int id) {
		// TODO Auto-generated method stub
		categoriesDAO.deleteCategories(id);
	}

	
	public List<Categories> getListCategories() {
		// TODO Auto-generated method stub
		return categoriesDAO.getListCategories();
	}

}
