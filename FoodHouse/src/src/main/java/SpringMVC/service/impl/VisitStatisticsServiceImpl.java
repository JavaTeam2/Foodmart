package SpringMVC.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import SpringMVC.dao.VisitStatisticsDAO;
import SpringMVC.entity.VisitStatistics;
import SpringMVC.service.VisitStatisticsService;
@Service
@Transactional
public class VisitStatisticsServiceImpl implements VisitStatisticsService{
	@Autowired
	private VisitStatisticsDAO visitStatisticsDAO;
	
	public void addVisitStatistics(VisitStatistics visitStatistics) {
		// TODO Auto-generated method stub
		visitStatisticsDAO.addVisitStatistics(visitStatistics);
	}

	
	public void updateVisitStatistics(VisitStatistics visitStatistics) {
		// TODO Auto-generated method stub
		visitStatisticsDAO.updateVisitStatistics(visitStatistics);
	}

	
	public VisitStatistics getVisitStatistics(int id) {
		// TODO Auto-generated method stub
		return visitStatisticsDAO.getVisitStatistics(id);
	}

	
	public void deleteVisitStatistics(int id) {
		// TODO Auto-generated method stub
		visitStatisticsDAO.deleteVisitStatistics(id);
	}

	
	public List<VisitStatistics> getListVisitStatistics() {
		// TODO Auto-generated method stub
		return visitStatisticsDAO.getListVisitStatistics();
	}

}
