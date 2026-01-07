package com.arnab.service;

import java.util.List;

import com.arnab.exception.UserException;
import com.arnab.modal.User;

public interface UserService {
	
	public User findUserById(Long userId) throws UserException;
	
	public User findUserProfileByJwt(String jwt) throws UserException;
	
	public List<User> findAllUsers();

}
