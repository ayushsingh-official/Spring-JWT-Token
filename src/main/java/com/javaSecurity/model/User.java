package com.javaSecurity.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "mst_User")
public class User {

	@jakarta.persistence.Id
	@GeneratedValue
	private int id;

	@Column
	private String name;

	@Column
	private String role;

}
