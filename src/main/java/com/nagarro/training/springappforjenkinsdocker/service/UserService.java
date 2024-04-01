package com.nagarro.training.springappforjenkinsdocker.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.nagarro.training.springappforjenkinsdocker.model.User;

@Service
public class UserService {
	
	private List<User> users = new ArrayList<>(Arrays.asList(
		      new User("Harsh Raj", "hr@gmail.com"),
		      new User("Jane Doe", "jane.doe@gmail.com"),
		      new User("Piyush Pander", "piyush@gmail.com"),
		      new User("Shreya Rathour", "shreyasingh@gmail.com")
		  ));
	
	public List<User> getUser(){
		return this.users;
	}

}
