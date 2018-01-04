package SpringMVC.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import SpringMVC.dao.VisitStatisticsDAO;
import SpringMVC.entity.VisitStatistics;
@Repository
public class VisitStatisticsDAOImpl implements  VisitStatisticsDAO{
	@Autowired
	private SessionFactory sessionFactory;
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	@Override
	public void addVisitStatistics(VisitStatistics visitStatistics) {
		// TODO Auto-generated method stub
		getCurrentSession().save(visitStatistics);
	}
	@Override
	public void updateVisitStatistics(VisitStatistics visitStatistics) {
		// TODO Auto-generated method stub
		VisitStatistics statisToUpdate = getVisitStatistics(visitStatistics.getId());
		statisToUpdate.setUser_id(visitStatistics.getUser_id());
		statisToUpdate.setDate_time(visitStatistics.getDate_time());
		statisToUpdate.setRoute(visitStatistics.getRoute());
	}
	@Override
	public VisitStatistics getVisitStatistics(int id) {
		// TODO Auto-generated method stub
		VisitStatistics statis = getCurrentSession().get(VisitStatistics.class, id);
		return statis;
	}
	@Override
	public void deleteVisitStatistics(int id) {
		// TODO Auto-generated method stub
		VisitStatistics statis = getVisitStatistics(id);
		if(statis != null) {
			getCurrentSession().delete(statis);
		}
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<VisitStatistics> getListVisitStatistics() {
		// TODO Auto-generated method stub
		return getCurrentSession().createQuery("Select e from " + VisitStatistics.class.getName() + " e").list();
	}
	
}
