package com.javaSecurity.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaSecurity.Repository.UserRepository;
import com.javaSecurity.dto.UserRequest;
import com.javaSecurity.model.User;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	private ModelMapper modelMapper = new ModelMapper();

	public User addUser(UserRequest userDto) {

		User user = modelMapper.map(userDto, User.class);
		User us = userRepository.save(user);
		System.out.println("user added : " + us.toString());
		return us;

	}

//	public User getUser(int id) {
//
//		return userRepository.save(null);
//	}

}
