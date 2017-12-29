package SpringMVC.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import SpringMVC.dao.CostsIncurredDAO;
import SpringMVC.entity.CostsIncurred;
import SpringMVC.service.CostsIncurredService;
@Service
@Transactional
public class CostsIncurredServiceImpl implements CostsIncurredService {
	@Autowired
	private CostsIncurredDAO costsIncurredDAO;
	
	public void addCostsIncurred(CostsIncurred costsIncurred) {
		// TODO Auto-generated method stub
		costsIncurredDAO.addCostsIncurred(costsIncurred);
	}

	
	public void updateCostsIncurred(CostsIncurred costsIncurred) {
		// TODO Auto-generated method stub
		costsIncurredDAO.updateCostsIncurred(costsIncurred);
	}

	
	public CostsIncurred getCostsIncurred(int id) {
		// TODO Auto-generated method stub
		return costsIncurredDAO.getCostsIncurred(id);
	}

	
	public void deleteCostsIncurred(int id) {
		// TODO Auto-generated method stub
		costsIncurredDAO.deleteCostsIncurred(id);
	}

	
	public List<CostsIncurred> getListCostsIncurred() {
		// TODO Auto-generated method stub
		return costsIncurredDAO.getListCostsIncurred();
	}

}
