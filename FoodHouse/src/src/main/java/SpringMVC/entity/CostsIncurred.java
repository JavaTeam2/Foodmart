package SpringMVC.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "costs_incurred")
public class CostsIncurred {
	private int id;
	private Date date;
	private Branch branch_id;
	private String cause;
	private double cost;
	@Id
	@Column(name = "id")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name = "date", nullable = false)
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "branch_id")
	public Branch getBranch_id() {
		return branch_id;
	}
	public void setBranch_id(Branch branch_id) {
		this.branch_id = branch_id;
	}
	@Column(name = "cause", nullable = false)
	public String getCause() {
		return cause;
	}
	public void setCause(String cause) {
		this.cause = cause;
	}
	@Column(name = "cost", nullable = false)
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	
}
