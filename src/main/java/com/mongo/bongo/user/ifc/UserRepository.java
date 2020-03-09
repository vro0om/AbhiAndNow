package com.mongo.bongo.user.ifc;

import org.springframework.data.repository.CrudRepository;

import com.mongo.bongo.user.UserModel;

public interface UserRepository extends CrudRepository<UserModel, String>{
	
}
