package SpringMVC.dao;

import java.util.List;

import SpringMVC.entity.VisitStatistics;

public interface VisitStatisticsDAO {
	public void addVisitStatistics(VisitStatistics visitStatistics);
	public void updateVisitStatistics(VisitStatistics visitStatistics);
	public VisitStatistics getVisitStatistics(int id);
	public void deleteVisitStatistics(int id);
	public List<VisitStatistics> getListVisitStatistics();
}
