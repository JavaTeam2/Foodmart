package SpringMVC.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "order_details")
public class OrderDetail {
	private int id;
	private Order order_id;
	private Food food_id;
	private double price;
	private int quantity;
	@Id
	@Column(name = "id")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	//@Column(name = "order_id", nullable = false)
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "order_id")
	public Order getOrder_id() {
		return order_id;
	}
	public void setOrder_id(Order order_id) {
		this.order_id = order_id;
	}
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "food_id")
	public Food getFood_id() {
		return food_id;
	}
	public void setFood_id(Food food_id) {
		this.food_id = food_id;
	}
	@Column(name = "price", nullable = false)
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Column(name = "quantity", nullable = false)
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
