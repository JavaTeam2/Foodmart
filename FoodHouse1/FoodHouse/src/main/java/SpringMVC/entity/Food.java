package SpringMVC.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "foods",
		uniqueConstraints = {@UniqueConstraint(columnNames = {"id"})})
public class Food {
	private int id;
	private String name;
	private double price;
	private double price_promotion;
	private String image;
	private String description;
	private Set<Branch> branches = new HashSet<Branch>(0);
	private Set<Categories> categories = new HashSet<Categories>(0);
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
	@Column(name = "name", length = 64, nullable = false)
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
	@Column(name = "image", length = 512, nullable = false)
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
	
	@ManyToMany(fetch = FetchType.LAZY, mappedBy ="foods")
	public Set<Branch> getBranches() {
		return branches;
	}
	public void setBranches(Set<Branch> branches) {
		this.branches = branches;
	}
	
	@ManyToMany(fetch = FetchType.LAZY, mappedBy ="foods")
	public Set<Categories> getCates() {
		return categories;
	}
	public void setCates(Set<Categories> cates) {
		this.categories = cates;
	}
	
	
	
}
