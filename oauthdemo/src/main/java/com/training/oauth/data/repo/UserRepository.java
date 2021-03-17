package com.training.oauth.data.repo;

import org.springframework.data.repository.CrudRepository;

import com.training.oauth.data.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	User findByName(String name);

}
