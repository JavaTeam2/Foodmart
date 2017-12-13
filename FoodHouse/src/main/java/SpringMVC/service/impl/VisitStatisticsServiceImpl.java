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
	@Override
	public void addVisitStatistics(VisitStatistics visitStatistics) {
		// TODO Auto-generated method stub
		visitStatisticsDAO.addVisitStatistics(visitStatistics);
	}

	@Override
	public void updateVisitStatistics(VisitStatistics visitStatistics) {
		// TODO Auto-generated method stub
		visitStatisticsDAO.updateVisitStatistics(visitStatistics);
	}

	@Override
	public VisitStatistics getVisitStatistics(int id) {
		// TODO Auto-generated method stub
		return visitStatisticsDAO.getVisitStatistics(id);
	}

	@Override
	public void deleteVisitStatistics(int id) {
		// TODO Auto-generated method stub
		visitStatisticsDAO.deleteVisitStatistics(id);
	}

	@Override
	public List<VisitStatistics> getListVisitStatistics() {
		// TODO Auto-generated method stub
		return visitStatisticsDAO.getListVisitStatistics();
	}

}
