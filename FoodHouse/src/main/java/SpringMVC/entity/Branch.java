package SpringMVC.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="branches",
		uniqueConstraints = {@UniqueConstraint(columnNames = {"id"})})
public class Branch {
	private int id;
	private String name;
	private String address;
	private String province;
	private String city;
	private String phone;
	private Date open_time;
	private Date close_time;
	private int table_quantity;
	private String image;
	private String description;
	private Set<Food> foods = new HashSet<Food>(0);
	private Set<CostsIncurred> costsIncurred = new HashSet<CostsIncurred>(0);
	public Branch() {
		
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
	
	@Column(name = "address", length = 128, nullable = false)
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Column(name = "province", length = 64, nullable = false)
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	
	@Column(name = "city", length = 64, nullable = false)
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Column(name = "phone", length = 16, nullable = false)
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Column(name = "open_time", nullable = false)
	public Date getOpen_time() {
		return open_time;
	}
	public void setOpen_time(Date open_time) {
		this.open_time = open_time;
	}
	
	@Column(name = "close_time", nullable = false)
	public Date getClose_time() {
		return close_time;
	}
	public void setClose_time(Date close_time) {
		this.close_time = close_time;
	}
	
	@Column(name = "table_quantity", nullable = false)
	public int getTable_quantity() {
		return table_quantity;
	}
	public void setTable_quantity(int table_quantity) {
		this.table_quantity = table_quantity;
	}
	
	@Column(name = "image", length = 1024, nullable = false)
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	@Column(name = "description", length = 1024, nullable = false)
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "branches_foods",joinColumns = {
			@JoinColumn(name = "branch_id", nullable = false, updatable = false) },
			inverseJoinColumns = { @JoinColumn(name = "food_id",
			nullable = false, updatable = false) })
	public Set<Food> getFoods() {
		return foods;
	}
	public void setFoods(Set<Food> foods) {
		this.foods = foods;
	}
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "id")
	public Set<CostsIncurred> getCostsIncurred() {
		return costsIncurred;
	}
	public void setCostsIncurred(Set<CostsIncurred> costsIncurred) {
		this.costsIncurred = costsIncurred;
	}
	
	
}
