package org.cap.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(value = {"handler","hibernateLazyInitializer"})
@Entity
public class Customer {

	@GeneratedValue
	@Id
	private int customerID;
	private String name;

	@OneToMany(targetEntity = Orders.class, mappedBy = "customer", cascade = CascadeType.ALL)
	private List<Orders> Orders = new ArrayList<Orders>();

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String name, List<Orders> Orders) {
		super();
		this.name = name;
		this.Orders = Orders;
	}

	public int getCustomerID() {
		System.out.println("Get Customer id");
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Orders> getOrders() {
		return Orders;
	}

	public void setOrders(List<Orders> Orders) {
		this.Orders = Orders;
	}

	/*
	 * @PrePersist private void prePersist() { Orders.forEach(c ->
	 * c.setCustomer(this)); }
	 */
	

}
