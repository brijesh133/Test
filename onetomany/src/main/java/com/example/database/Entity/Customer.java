package com.example.database.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity(name="customerdt")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String name;
	private String ph;
	@OneToMany(targetEntity=Orders.class,cascade=CascadeType.ALL)
	@JoinColumn(name="Cust_Id",referencedColumnName="id")
	private List<Orders> orders;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPh() {
		return ph;
	}
	public void setPh(String ph) {
		this.ph = ph;
	}
	public List<Orders> getOrders() {
		return orders;
	}
	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", ph=" + ph + ", orders=" + orders + "]";
	}
	public Customer(long id, String name, String ph, List<Orders> orders) {
		super();
		this.id = id;
		this.name = name;
		this.ph = ph;
		this.orders = orders;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	} 
	
	
	
}
