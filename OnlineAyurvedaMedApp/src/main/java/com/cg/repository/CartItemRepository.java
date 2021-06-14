package com.cg.repository;

public interface CartItemRepository {

	removeItemFromCart(Cart,medicine);
	increaseQuantity(cart,medicine,qty);
	decreaseQuantity(cart,medicine,qty);
}
