package SpringMVC.entity;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
	private Time date_time;
	private String status;
	private String note;
	private List<OrderDetail> listUserDetails = new ArrayList<OrderDetail>();
	
	
	
	
	
	public Order() {
		super();
	}
	
	public Order(User customer_id, Branch branch_id, String customer_name, String customer_phone, String customer_email,
			String customer_address, String customer_city, String customer_province, double total_money, Time date_time,
			String status, String note) {
		super();
		this.customer_id = customer_id;
		this.branch_id = branch_id;
		this.customer_name = customer_name;
		this.customer_phone = customer_phone;
		this.customer_email = customer_email;
		this.customer_address = customer_address;
		this.customer_city = customer_city;
		this.customer_province = customer_province;
		this.total_money = total_money;
		this.date_time = date_time;
		this.status = status;
		this.note = note;
	}

	@Id
	@Column(name = "id")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "customer_id")
	public User getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(User customer_id) {
		this.customer_id = customer_id;
	}
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "branch_id")
	public Branch getBranch_id() {
		return branch_id;
	}
	public void setBranch_id(Branch branch_id) {
		this.branch_id = branch_id;
	}
	@Column(name = "customer_name", length = 64)
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	@Column(name = "customer_phone", length = 16)
	public String getCustomer_phone() {
		return customer_phone;
	}
	public void setCustomer_phone(String customer_phone) {
		this.customer_phone = customer_phone;
	}
	@Column(name = "customer_email", length = 512)
	public String getCustomer_email() {
		return customer_email;
	}
	public void setCustomer_email(String customer_email) {
		this.customer_email = customer_email;
	}
	@Column(name = "customer_address", length = 128)
	public String getCustomer_address() {
		return customer_address;
	}
	public void setCustomer_address(String customer_address) {
		this.customer_address = customer_address;
	}
	@Column(name = "customer_city", length = 64)
	public String getCustomer_city() {
		return customer_city;
	}
	public void setCustomer_city(String customer_city) {
		this.customer_city = customer_city;
	}
	@Column(name = "customer_province", length = 64)
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
	public Time getDate_time() {
		return (Time) date_time;
	}
	public void setDate_time(Time date_time) {
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
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "order_id")
	public List<OrderDetail> getListUserDetails() {
		return listUserDetails;
	}
	public void setListUserDetails(List<OrderDetail> listUserDetails) {
		this.listUserDetails = listUserDetails;
	}
	
	 @SuppressWarnings("unused")
	public OrderDetail findLineById(int id) {
	        for (OrderDetail line : this.listUserDetails) {
	            if (line.getFood_id().getId() == id) {
	                return line;
	            }
	        }
	        return null;
	    }
	 
    public void addFood(Food food, int quantity) {
    	OrderDetail line = this.findLineById(food.getId());
 
        if (line == null) {
            line = new OrderDetail();
            line.setOrder_id(this);
            line.setFood_id(food);
            line.setQuantity(0);
            line.setPrice(food.getPrice()*quantity);
            this.listUserDetails.add(line);
        }
        int newQuantity = line.getQuantity() + quantity;
        if (newQuantity <= 0) {
            this.listUserDetails.remove(line);
        } else {
            line.setQuantity(newQuantity);
        }
    }
    public void updateProduct(int id, int quantity) {
        OrderDetail line = this.findLineById(id);
 
        if (line != null) {
            if (quantity <= 0) {
                this.listUserDetails.remove(line);
            } else {
                line.setQuantity(quantity);
            }
        }
    }
    
    public void updateQuantity(Order order) {
        if (order != null) {
			List<OrderDetail> lines = order.getListUserDetails();
			System.out.println("Danh sach mon an da order: " + lines.size());
            for (int i = 0; i < lines.size(); i++) {
            	System.out.println("Ten thuc an la: " + lines.get(i).getFood_id().getName());
                this.updateProduct(lines.get(i).getFood_id().getId(), lines.get(i).getQuantity());
            }
        }
 
    }
}