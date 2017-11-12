package SpringMVC.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="user_roles", uniqueConstraints = 
			@UniqueConstraint(columnNames = {"username", "role"}))
public class UserRole {
	private int userRoleID;
	private User username;
	private String role;
	
	public UserRole() {
		
	}
	
	public UserRole(User username, String role) {
		super();
		this.username = username;
		this.role = role;
	}
	@Id
	@Column(name = "user_role_id", nullable = false)
	public int getUserRoleID() {
		return userRoleID;
	}
	public void setUserRoleID(int userRoleID) {
		this.userRoleID = userRoleID;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "username")
	public User getUsername() {
		return username;
	}
	public void setUsername(User username) {
		this.username = username;
	}
	
	@Column(name = "role", length = 45, nullable = false)
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
}
