package SpringMVC.authentication;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import SpringMVC.dao.UserDAO;
import SpringMVC.entity.UserRole;


@Service("userDetailsService")
public class MyUserDetailsService implements UserDetailsService {
	@Autowired
	private UserDAO userDAO;
	
	@Transactional(readOnly=true)
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		SpringMVC.entity.User user = userDAO.getUserByUsername(username);
		System.out.println("UserInfo= " + user.getName());
		System.out.println("UserRole= " + user.getUserRole());
		if(user == null) {
			throw new UsernameNotFoundException("User " + username + " was not found in the database");
		}
		
		// [customer, manager, admin
		System.out.println("role" + user.getUserRole());
		List<GrantedAuthority> authorities =
                buildUserAuthority(user.getUserRole());
		

		return (UserDetails) buildUserForAuthentication(user, authorities);
	}
	private User buildUserForAuthentication(SpringMVC.entity.User user, List<GrantedAuthority> authorities) {
		return new User(user.getUsername(), user.getPassword(), true, true, true, true, authorities);
		
	}

	private List<GrantedAuthority> buildUserAuthority(Set<UserRole> userRoles) {

		Set<GrantedAuthority> setAuths = new HashSet<GrantedAuthority>();

		// Build user's authorities
		for (UserRole userRole : userRoles) {
			setAuths.add(new SimpleGrantedAuthority(userRole.getRole()));
		}

		List<GrantedAuthority> Result = new ArrayList<GrantedAuthority>(setAuths);

		return Result;
	}
}
