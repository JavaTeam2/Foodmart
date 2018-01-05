package SpringMVC.dao;

import SpringMVC.entity.Seller;
import SpringMVC.entity.User;

import java.util.List;

public interface SellerDAO {
	public void addSeller(Seller seller);
	public void updateSeller(Seller seller);
	public Seller getSeller(int id);
	public void deleteUser(int id);
	public Seller getSellerByUsername(String username);
}
