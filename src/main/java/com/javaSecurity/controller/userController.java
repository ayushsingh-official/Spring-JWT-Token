package com.javaSecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javaSecurity.dto.AuthRequest;
import com.javaSecurity.dto.UserRequest;
import com.javaSecurity.model.User;
import com.javaSecurity.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/createUser")
	public User createUser(@RequestBody UserRequest userDto) {

		System.out.println("user request : " + userDto);
		return userService.addUser(userDto);

	}

	@PostMapping("/authenticate")
	public String authenticateAndCreateToken(@RequestBody AuthRequest authRequest) {

		return "";
	}

}
