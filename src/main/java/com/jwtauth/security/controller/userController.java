package com.jwtauth.security.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.jwtauth.security.service.UserService;

public class userController {

	@Autowired
	private UserService userService;

//	@PostMapping("/{id}")
//	public User createUser(@PathVariable int id, @RequestBody User user) {
//		return userService.getUser(id);
//
//	}
}
