package com.mongo.bongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.bongo.user.UserModel;
import com.mongo.bongo.user.UserService;

@RestController
public class LoginController {

	@Autowired
	UserService userService;
	
	@RequestMapping(method=RequestMethod.GET,value = "/login")
	public String login(@RequestBody UserModel user) {
		return userService.login(user);
	}
	
	@RequestMapping(method=RequestMethod.POST,value = "/register")
	public UserModel register(@RequestBody UserModel user) {
		return userService.register(user);
		
	}
}
