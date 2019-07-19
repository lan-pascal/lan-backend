package com.lanpascal.lanbackend.model;

import lombok.Data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "users")
public class User {

	@Id
	private String id;

	private String username;

	public User(final String username) {
		this.username = username;
	}
}
