package com.lanpascal.lanbackend.repository;

import com.lanpascal.lanbackend.model.User;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
	User findByUsername(String username);
}
