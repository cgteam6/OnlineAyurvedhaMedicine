package com.cg.entities;

import java.util.List;

public class Cart {
	String cartId;
	Customer customer;
	List<CartItem> items;
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Cart(String cartId, Customer customer, List<CartItem> items) {
		super();
		this.cartId = cartId;
		this.customer = customer;
		this.items = items;
	}



	public String getCartId() {
		return cartId;
	}
	public void setCartId(String cartId) {
		this.cartId = cartId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public List<CartItem> getItems() {
		return items;
	}
	public void setItems(List<CartItem> items) {
		this.items = items;
	}
	
	
	

}
