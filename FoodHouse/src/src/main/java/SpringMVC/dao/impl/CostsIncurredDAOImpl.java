package SpringMVC.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import SpringMVC.dao.CostsIncurredDAO;
import SpringMVC.entity.CostsIncurred;
@Repository
public class CostsIncurredDAOImpl implements CostsIncurredDAO {
	@Autowired
	private SessionFactory sessionFactory;
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	public void addCostsIncurred(CostsIncurred costsIncurred) {
		// TODO Auto-generated method stub
		getCurrentSession().save(costsIncurred);
	}

	
	public void updateCostsIncurred(CostsIncurred costsIncurred) {
		// TODO Auto-generated method stub
		CostsIncurred costsToUpdate = getCostsIncurred(costsIncurred.getId());
		costsToUpdate.setDate(costsIncurred.getDate());
		costsToUpdate.setBranch_id(costsIncurred.getBranch_id());
		costsToUpdate.setCause(costsIncurred.getCause());
		costsToUpdate.setCost(costsIncurred.getCost());
		getCurrentSession().update(costsToUpdate);
	}

	
	public CostsIncurred getCostsIncurred(int id) {
		// TODO Auto-generated method stub
		CostsIncurred costs = (CostsIncurred) getCurrentSession().get(CostsIncurred.class, id);
		return costs;
	}

	
	public void deleteCostsIncurred(int id) {
		// TODO Auto-generated method stub
		CostsIncurred costs = getCostsIncurred(id);
		if(costs != null) {
			getCurrentSession().delete(costs);
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<CostsIncurred> getListCostsIncurred() {
		// TODO Auto-generated method stub
		return getCurrentSession().createQuery("Select e from " + CostsIncurred.class.getName() + " e").list();
	}

}
