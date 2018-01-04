package SpringMVC.dao;

import java.util.List;

import SpringMVC.entity.Branch;

public interface BranchDAO {
	public void addBranch(Branch branch);
	public void updateBranch(Branch branch);
	public Branch getBranch(int id);
	public void deleteBranch(int id);
	public List<Branch> getBranches();
}
