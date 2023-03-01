package com.jwtauth.security.model;

import jakarta.annotation.Generated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

	@jakarta.persistence.Id
	@Generated(value = { "id" })
	private int id;
	
	private String name;
	private String role;

}
