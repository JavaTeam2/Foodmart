package SpringMVC.service;

import java.util.List;

import SpringMVC.entity.Branch;

public interface BranchService {
	public void addBranch(Branch branch);
	public void updateBranch(Branch branch);
	public Branch getBranch(int id);
	public void deleteBranch(int id);
	public List<Branch> getBranches();
	public List<Branch> getHCMBranches(List<Branch> list);
	public List<Branch> getHaNoiBranches(List<Branch> list);
	public List<Branch> getDaNangBranches(List<Branch> list);
	public List<Branch> getNhaTrangBranches(List<Branch> list);
}
