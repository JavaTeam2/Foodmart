package SpringMVC.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
	private String username;
	private String password;
	private String name;
	private String phone;
	private Set<UserRole> userRole = new HashSet<UserRole>(0);
	
	public User() {
		
	}
	
	public User(String username, String password, String name, String phone) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.phone = phone;
	}
	public User(String username, String password, String name, String phone, Set<UserRole> userRole) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.phone = phone;
		this.userRole = userRole;
	}
	@Id
	@Column(name = "username")
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Column(name = "password", length = 45, nullable = false)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Column(name = "name", length = 45, nullable = false)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name = "phone", length = 45, nullable = false)
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "username")
	public Set<UserRole> getUserRole() {
		return userRole;
	}

	public void setUserRole(Set<UserRole> userRole) {
		this.userRole = userRole;
	}
	
	
}
