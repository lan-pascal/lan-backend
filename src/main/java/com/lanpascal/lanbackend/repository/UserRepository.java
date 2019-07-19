package com.lanpascal.lanbackend.repository;

import com.lanpascal.lanbackend.model.User;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
