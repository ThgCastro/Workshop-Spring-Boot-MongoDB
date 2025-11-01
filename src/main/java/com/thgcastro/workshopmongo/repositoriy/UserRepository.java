package com.thgcastro.workshopmongo.repositoriy;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.thgcastro.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

	
}
