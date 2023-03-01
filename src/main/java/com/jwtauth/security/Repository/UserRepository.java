package com.jwtauth.security.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jwtauth.security.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
