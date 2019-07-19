package com.lanpascal.lanbackend.service;

import java.util.List;

import com.lanpascal.lanbackend.model.User;
import com.lanpascal.lanbackend.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	private UserRepository repository;

	public List<User> findAll() {

		List<User> users = (List<User>) repository.findAll();

		return users;
	}
}
