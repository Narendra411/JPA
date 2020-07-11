package org.cap.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Orders {

	@Id
	@GeneratedValue
	private int orderNo;
	private String orderDetail;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "customerID")
	@JsonIgnore
	private Customer customer;

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public String getOrderDetail() {
		return orderDetail;
	}

	public void setOrderDetail(String orderDetail) {
		this.orderDetail = orderDetail;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public Orders() {
		// TODO Auto-generated constructor stub
	}

	public Orders(int orderNo, String orderDetail) {
		super();
		this.orderNo = orderNo;
		this.orderDetail = orderDetail;
	}

	@Override
	public String toString() {
		return "Order [orderNo=" + orderNo + ", orderDetail=" + orderDetail + "]";
	}
	
	
	
	
}
