package SpringMVC.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import SpringMVC.dao.CategoriesDAO;
import SpringMVC.entity.Categories;
@Repository
public class CategoriesDAOImpl implements CategoriesDAO {
	@Autowired
	private SessionFactory sessionFactory;
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	@Override
	public void addCategories(Categories categories) {
		// TODO Auto-generated method stub
		getCurrentSession().save(categories);
	}

	@Override
	public void updateCategories(Categories categories) {
		// TODO Auto-generated method stub
		Categories catToUpdate = getCategories(categories.getId());
		catToUpdate.setName(categories.getName());
		getCurrentSession().update(catToUpdate);
	}

	@Override
	public Categories getCategories(int id) {
		// TODO Auto-generated method stub
		Categories cate = getCurrentSession().get(Categories.class, id);
		return cate;
	}

	@Override
	public void deleteCategories(int id) {
		// TODO Auto-generated method stub
		Categories food = getCategories(id);
		if(food != null) {
			getCurrentSession().delete(food);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Categories> getListCategories() {
		// TODO Auto-generated method stub
		return getCurrentSession().createQuery("Select e from " + Categories.class.getName() + " e").list();
	}

}
