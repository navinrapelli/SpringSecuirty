package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;



public interface SecurityRepo extends MongoRepository<Users,String> {

	
	Users findByUsername(String username);
}
