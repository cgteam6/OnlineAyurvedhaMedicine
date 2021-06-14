package com.cg.repository;

public interface CartRepository {
	addItemToCart(Cart, medicine,quantity);
	createCart(customer );
	clearCart(cart);
}
