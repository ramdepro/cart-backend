package com.niit.cartbackend.dao;

import com.niit.cartbackend.model.Cart;

public interface CartDAO {
	
	public void addCart(Cart cart);
	public void updateCart(Cart cart);
	public Cart getCartById(int cartId);


}
