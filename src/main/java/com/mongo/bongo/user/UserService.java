package com.mongo.bongo.user;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongo.bongo.user.ifc.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository repo;

	public UserModel register(UserModel user) {

		return repo.save(user);

	}

	public String login(UserModel user) {
		String result = "Fail";
		UserModel userModel = repo.findById(user.getUser()).get();
		if (user.getPassword().equals(userModel.getPassword())) {
			result = "Success";
		}
		return result;
	}
}
