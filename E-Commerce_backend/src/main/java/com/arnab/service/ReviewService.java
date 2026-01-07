package com.arnab.service;

import java.util.List;

import com.arnab.exception.ProductException;
import com.arnab.modal.Review;
import com.arnab.modal.User;
import com.arnab.request.ReviewRequest;

public interface ReviewService {

	public Review createReview(ReviewRequest req,User user) throws ProductException;
	
	public List<Review> getAllReview(Long productId);
	
	
}
