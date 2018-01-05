package SpringMVC.dao.impl;

import SpringMVC.dao.SellerDAO;
import SpringMVC.dao.UserDAO;
import SpringMVC.entity.Seller;
import SpringMVC.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.jws.soap.SOAPBinding;
import java.util.List;

@Service
@Transactional
public class SellerDAOImpl implements SellerDAO {
	@Autowired
	private SessionFactory sessionFactory;
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	public void addSeller(Seller seller) {
		// TODO Auto-generated method stub
		getCurrentSession().save(seller);
	}

	public void updateSeller(Seller seller) {
		// TODO Auto-generated method stub
		Seller sellerToUpdate = getSeller(seller.getId());
		sellerToUpdate.setBranch(seller.getBranch());
		sellerToUpdate.setUser(seller.getUser());
	}


	public Seller getSeller(int id) {
		// TODO Auto-generated method stub
		Seller seller = (Seller) getCurrentSession().get(Seller.class, id);
		return seller;
	}


	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		Seller seller = getSeller(id);
		if(seller != null) {
			getCurrentSession().delete(seller);
		}
	}


	public Seller getSellerByUsername(String username) {
		// TODO Auto-generated method stub
		Seller seller = (Seller) getCurrentSession().createQuery("SELECT e from " +Seller.class.getName() +
				" e where e.user.username = '" + username+"'").uniqueResult();
		return  seller;
	}
}
