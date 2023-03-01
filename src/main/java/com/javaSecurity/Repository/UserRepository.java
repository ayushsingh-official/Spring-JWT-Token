package com.javaSecurity.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javaSecurity.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
