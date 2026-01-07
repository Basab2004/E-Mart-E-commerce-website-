package com.arnab.service;

import java.util.List;

import com.arnab.exception.ProductException;
import com.arnab.modal.Rating;
import com.arnab.modal.User;
import com.arnab.request.RatingRequest;

public interface RatingServices {
	
	public Rating createRating(RatingRequest req,User user) throws ProductException;
	
	public List<Rating> getProductsRating(Long productId);

}
