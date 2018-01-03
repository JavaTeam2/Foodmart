package SpringMVC.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import SpringMVC.dao.BranchDAO;
import SpringMVC.entity.Branch;

@Repository
public class BranchDAOImpl implements BranchDAO {
	@Autowired
	private SessionFactory sessionFactory;
	public Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void addBranch(Branch branch) {
		// TODO Auto-generated method stub
		getCurrentSession().save(branch);
	}

	@Override
	public void updateBranch(Branch branch) {
		// TODO Auto-generated method stub
		Branch branchToUpdate = getBranch(branch.getId());
		branchToUpdate.setName(branch.getName());
		branchToUpdate.setAddress(branch.getAddress());
		branchToUpdate.setProvince(branch.getProvince());
		branchToUpdate.setImage(branch.getImage());
		branchToUpdate.setPhone(branch.getImage());
		branchToUpdate.setTable_quantity(branch.getTable_quantity());
		getCurrentSession().update(branchToUpdate);
	}

	@Override
	public Branch getBranch(int id) {
		// TODO Auto-generated method stub
		Branch branch = getCurrentSession().get(Branch.class, id);
		return branch;
	}

	@Override
	public void deleteBranch(int id) {
		// TODO Auto-generated method stub
		Branch branch = getBranch(id);
		if(branch != null) {
			getCurrentSession().delete(branch);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Branch> getBranches() {
		// TODO Auto-generated method stub
		return getCurrentSession().createQuery("Select e from " + Branch.class.getName() + " e").list();
	}
	
}
