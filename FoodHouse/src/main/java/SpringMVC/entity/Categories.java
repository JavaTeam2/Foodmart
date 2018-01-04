package SpringMVC.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "categories")
public class Categories {
	private int id;
	private String name;
	private Set<Food> foods = new HashSet<Food>(0);
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name = "name", length = 1024, nullable = false)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name = "categories_foods",joinColumns = {
			@JoinColumn(name = "cat_id", nullable = false, updatable = false) },
			inverseJoinColumns = { @JoinColumn(name = "food_id",
			nullable = false, updatable = false) })
	public Set<Food> getFoods() {
		return foods;
	}
	public void setFoods(Set<Food> foods) {
		this.foods = foods;
	}
	
	
}
