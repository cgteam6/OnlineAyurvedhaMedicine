package com.cg.entities;

import java.time.LocalDate;

public class Order {
	int orderId;
	LocalDate orderDate;
	LocalDate dispatchDate;
	float totalCost;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int orderId, LocalDate orderDate, LocalDate dispatchDate, float totalCost) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.dispatchDate = dispatchDate;
		this.totalCost = totalCost;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public LocalDate getDispatchDate() {
		return dispatchDate;
	}
	public void setDispatchDate(LocalDate dispatchDate) {
		this.dispatchDate = dispatchDate;
	}
	public float getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(float totalCost) {
		this.totalCost = totalCost;
	}
	
	

}
