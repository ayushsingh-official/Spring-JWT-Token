package com.jwtauth.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jwtauth.security.Repository.UserRepository;

@Service
public class UserService {

	
	@Autowired
	private UserRepository userRepository;
	
//	public User getUser(int id) {
//
//		return userRepository.save(null);
//	}

}
