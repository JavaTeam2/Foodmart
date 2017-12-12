package SpringMVC.service;

import java.util.List;

import SpringMVC.entity.CostsIncurred;

public interface CostsIncurredService {
	public void addCostsIncurred(CostsIncurred costsIncurred);
	public void updateCostsIncurred(CostsIncurred costsIncurred);
	public CostsIncurred getCostsIncurred(int id);
	public void deleteCostsIncurred(int id);
	public List<CostsIncurred> getListCostsIncurred();
}
