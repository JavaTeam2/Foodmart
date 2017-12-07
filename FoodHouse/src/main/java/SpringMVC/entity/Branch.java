package SpringMVC.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="branch",
		uniqueConstraints = {@UniqueConstraint(columnNames = {"id"})})
public class Branch {
	private int id;
	private String name;
	private String address;
	private String province;
	private String image;
	private String phone;
	private int numOfTable;
	private String infoTable;
	
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
	@Column(name = "name", length = 45, nullable = false)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Column(name = "address", length = 1000, nullable = false)
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	@Column(name = "province", length = 45, nullable = false)
	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}
	@Column(name = "image", length = 500, nullable = false)
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	@Column(name = "phone", length = 15, nullable = false)
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Column(name = "numOfTable", nullable = false)
	public int getNumOfTable() {
		return numOfTable;
	}

	public void setNumOfTable(int numOfTable) {
		this.numOfTable = numOfTable;
	}
	@Column(name = "infoTable", length = 500)
	public String getInfoTable() {
		return infoTable;
	}

	public void setInfoTable(String infoTable) {
		this.infoTable = infoTable;
	}
	
	
}
