package SpringMVC.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import SpringMVC.dao.BranchDAO;
import SpringMVC.entity.Branch;
import SpringMVC.service.BranchService;
@Service
@Transactional
public class BranchServiceImpl implements BranchService {
	private static final String TPHCM = "TP HCM";
	private static final String HANOI = "Ha Noi";
	private static final String DANANG = "Da Nang";
	private static final String NHATRANG = "Nha Trang";
	
	@Autowired
	private BranchDAO branchDAO;
	
	@Override
	public List<Branch> getHCMBranches(List<Branch> list) {
		// TODO Auto-generated method stub
		List<Branch> listHCM = new ArrayList<Branch>();
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getProvince().equals(TPHCM)) {
				listHCM.add(list.get(i));
			}
		}
		return listHCM;
	}

	@Override
	public List<Branch> getHaNoiBranches(List<Branch> list) {
		// TODO Auto-generated method stub
		List<Branch> listHANOI = new ArrayList<Branch>();
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getProvince().equals(HANOI)) {
				listHANOI.add(list.get(i));
			}
		}
		return listHANOI;
	}

	@Override
	public List<Branch> getDaNangBranches(List<Branch> list) {
		// TODO Auto-generated method stub
		List<Branch> listDANANG = new ArrayList<Branch>();
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getProvince().equals(DANANG)) {
				listDANANG.add(list.get(i));
			}
		}
		return listDANANG;
	}

	@Override
	public List<Branch> getNhaTrangBranches(List<Branch> list) {
		// TODO Auto-generated method stub
		List<Branch> listNHATRANG = new ArrayList<Branch>();
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getProvince().equals(NHATRANG)) {
				listNHATRANG.add(list.get(i));
			}
		}
		return listNHATRANG;
	}
	
	@Override
	public void addBranch(Branch branch) {
		// TODO Auto-generated method stub
		branchDAO.addBranch(branch);
	}

	@Override
	public void updateBranch(Branch branch) {
		// TODO Auto-generated method stub
		branchDAO.updateBranch(branch);
	}

	@Override
	public Branch getBranch(int id) {
		// TODO Auto-generated method stub
		return branchDAO.getBranch(id);
	}

	@Override
	public void deleteBranch(int id) {
		// TODO Auto-generated method stub
		branchDAO.deleteBranch(id);
	}

	@Override
	public List<Branch> getBranches() {
		// TODO Auto-generated method stub
		return branchDAO.getBranches();
	}

	



}
