package com.mongo.bongo.user;

import org.springframework.data.annotation.Id;

public class UserModel {

	@Id
	private String user;
	
	private String password;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "UserModel [user=" + user + ", password=" + password + "]";
	}

}
