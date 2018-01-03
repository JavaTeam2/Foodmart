package SpringMVC.service;

import java.util.List;

import SpringMVC.entity.VisitStatistics;

public interface VisitStatisticsService {
	public void addVisitStatistics(VisitStatistics visitStatistics);
	public void updateVisitStatistics(VisitStatistics visitStatistics);
	public VisitStatistics getVisitStatistics(int id);
	public void deleteVisitStatistics(int id);
	public List<VisitStatistics> getListVisitStatistics();
}
