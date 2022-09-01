package com.example.database.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Orders {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String ordername;
	private String price;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getOrdername() {
		return ordername;
	}
	public void setOrdername(String ordername) {
		this.ordername = ordername;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Orders [id=" + id + ", ordername=" + ordername + ", price=" + price + "]";
	}
	public Orders(long id, String ordername, String price) {
		super();
		this.id = id;
		this.ordername = ordername;
		this.price = price;
	}
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
