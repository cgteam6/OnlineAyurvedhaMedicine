package com.cg.entities;

public class CartItem {
	
	String itemId;
	Cart cart;
	Medicine medicine;
	int quantity;
	public CartItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CartItem(String itemId, Cart cart, Medicine medicine, int quantity) {
		super();
		this.itemId = itemId;
		this.cart = cart;
		this.medicine = medicine;
		this.quantity = quantity;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public Medicine getMedicine() {
		return medicine;
	}
	public void setMedicine(Medicine medicine) {
		this.medicine = medicine;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	

}
