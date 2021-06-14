package com.cg.service;

public interface CartItemService {
	
	removeItemFromCart(Cart,medicine);
	increaseQuantity(cart,medicine,qty);
	decreaseQuantity(cart,medicine,qty);

}
