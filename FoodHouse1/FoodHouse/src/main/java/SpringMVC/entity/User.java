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
	private int id;
	private String name;
	private String email;
	private String username;
	private String password;
	private String city;
	private String province;
	private String address;
	private String phone;
	private Set<UserRole> userRole = new HashSet<UserRole>(0);
	private Set<VisitStatistics> visitStatistics = new HashSet<VisitStatistics>(0);
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String name, String email, String username, String password, String city, String province,
			String address, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.username = username;
		this.password = password;
		this.city = city;
		this.province = province;
		this.address = address;
		this.phone = phone;
	}
	public User(int id, String name, String email, String username, String password, String city, String province,
			String address, String phone, Set<UserRole> userRole) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.username = username;
		this.password = password;
		this.city = city;
		this.province = province;
		this.address = address;
		this.phone = phone;
		this.userRole = userRole;
	}
	@Id
	@Column(name = "id")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name = "name", length = 64, nullable = false)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name = "email", length = 512, nullable = false)
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Column(name = "username", length = 64, nullable = false)
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Column(name = "password", length = 64, nullable = false)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Column(name = "city", length = 64, nullable = false)
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Column(name = "province", length = 64, nullable = false)
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	@Column(name = "address", length = 128, nullable = false)
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Column(name = "phone", length = 16, nullable = false)
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
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "id")
	public Set<VisitStatistics> getVisitStatistics() {
		return visitStatistics;
	}
	public void setVisitStatistics(Set<VisitStatistics> visitStatistics) {
		this.visitStatistics = visitStatistics;
	}
	
	
	/*private String username;
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
	
	*/
}
