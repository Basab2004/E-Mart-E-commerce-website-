package com.arnab.service;

import com.arnab.exception.ProductException;
import com.arnab.modal.Cart;
import com.arnab.modal.CartItem;
import com.arnab.modal.User;
import com.arnab.request.AddItemRequest;

public interface CartService {
	
	public Cart createCart(User user);
	
	public CartItem addCartItem(Long userId,AddItemRequest req) throws ProductException;
	
	public Cart findUserCart(Long userId);

}
