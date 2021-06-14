package com.cg.entities;

import java.util.List;

public class Customer {
	int customerId;
	String customerName;
	String customerPassword;
	List<Medicine> medicineList;
	Order order;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int customerId, String customerName, String customerPassword, List<Medicine> medicineList,
			Order order) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerPassword = customerPassword;
		this.medicineList = medicineList;
		this.order = order;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerPassword() {
		return customerPassword;
	}
	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}
	public List<Medicine> getMedicineList() {
		return medicineList;
	}
	public void setMedicineList(List<Medicine> medicineList) {
		this.medicineList = medicineList;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	
	
	

}
