package SpringMVC.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "food",
		uniqueConstraints = {@UniqueConstraint(columnNames = {"id"})})
public class Food {
	private int id;
	private String name;
	private double price;
	private double price_promotion;
	private String kindOfFood;
	private String image;
	private String description;
	
	public Food() {
		
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
	@Column(name = "price", nullable = false)
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	@Column(name = "price_promotion", nullable = false)
	public double getPrice_promotion() {
		return price_promotion;
	}

	public void setPrice_promotion(double price_promotion) {
		this.price_promotion = price_promotion;
	}
	@Column(name = "kindOfFood", length = 100, nullable = false)
	public String getKindOfFood() {
		return kindOfFood;
	}

	public void setKindOfFood(String kindOfFood) {
		this.kindOfFood = kindOfFood;
	}
	@Column(name = "image", length = 500, nullable = false)
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	@Column(name = "description", length = 1000, nullable = false)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
