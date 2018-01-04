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
	@Override
	public void addCategories(Categories categories) {
		// TODO Auto-generated method stub
		categoriesDAO.addCategories(categories);
	}

	@Override
	public void updateCategories(Categories categories) {
		// TODO Auto-generated method stub
		categoriesDAO.updateCategories(categories);
	}

	@Override
	public Categories getCategories(int id) {
		// TODO Auto-generated method stub
		return categoriesDAO.getCategories(id);
	}

	@Override
	public void deleteCategories(int id) {
		// TODO Auto-generated method stub
		categoriesDAO.deleteCategories(id);
	}

	@Override
	public List<Categories> getListCategories() {
		// TODO Auto-generated method stub
		return categoriesDAO.getListCategories();
	}

}
