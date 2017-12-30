package SpringMVC.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
	private int id;
	private User customer_id;
	private Branch branch_id;
	private String customer_name;
	private String customer_phone;
	private String customer_email;
	private String customer_address;
	private String customer_city;
	private String customer_province;
	private double total_money;
	private Date date_time;
	private String status;
	private String note;
	private Set<OrderDetail> listUserDetails = new HashSet<OrderDetail>(0);
	@Id
	@Column(name = "id")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "customer_id")
	public User getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(User customer_id) {
		this.customer_id = customer_id;
	}
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "branch_id")
	public Branch getBranch_id() {
		return branch_id;
	}
	public void setBranch_id(Branch branch_id) {
		this.branch_id = branch_id;
	}
	@Column(name = "customer_name", length = 64, nullable = false)
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	@Column(name = "customer_phone", length = 16, nullable = false)
	public String getCustomer_phone() {
		return customer_phone;
	}
	public void setCustomer_phone(String customer_phone) {
		this.customer_phone = customer_phone;
	}
	@Column(name = "customer_email", length = 512, nullable = false)
	public String getCustomer_email() {
		return customer_email;
	}
	public void setCustomer_email(String customer_email) {
		this.customer_email = customer_email;
	}
	@Column(name = "customer_address", length = 128, nullable = false)
	public String getCustomer_address() {
		return customer_address;
	}
	public void setCustomer_address(String customer_address) {
		this.customer_address = customer_address;
	}
	@Column(name = "customer_city", length = 64, nullable = false)
	public String getCustomer_city() {
		return customer_city;
	}
	public void setCustomer_city(String customer_city) {
		this.customer_city = customer_city;
	}
	@Column(name = "customer_province", length = 64, nullable = false)
	public String getCustomer_province() {
		return customer_province;
	}
	public void setCustomer_province(String customer_province) {
		this.customer_province = customer_province;
	}
	@Column(name = "total_money", nullable = false)
	public double getTotal_money() {
		return total_money;
	}
	public void setTotal_money(double total_money) {
		this.total_money = total_money;
	}
	@Column(name = "date_time", nullable = false)
	public Date getDate_time() {
		return date_time;
	}
	public void setDate_time(Date date_time) {
		this.date_time = date_time;
	}
	@Column(name = "status", length = 64)
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Column(name = "note", length = 1024)
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "id")
	public Set<OrderDetail> getListUserDetails() {
		return listUserDetails;
	}
	public void setListUserDetails(Set<OrderDetail> listUserDetails) {
		this.listUserDetails = listUserDetails;
	}
	
	
}