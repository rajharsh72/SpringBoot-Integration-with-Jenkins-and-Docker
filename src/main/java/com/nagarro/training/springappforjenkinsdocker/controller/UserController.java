package com.nagarro.training.springappforjenkinsdocker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.training.springappforjenkinsdocker.model.User;
import com.nagarro.training.springappforjenkinsdocker.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
//	@GetMapping
//	public ResponseEntity<List<User>> getUser(){
//		List<User> users = this.userService.getUser();
//		return ResponseEntity.ok().body(users);
//	}
	@GetMapping
	  public ResponseEntity<List<User>> getUser() {
	    try {
	      List<User> users = userService.getUser();
	      return ResponseEntity.ok(users);
	    } catch (Exception e) {
	      // Handle exception appropriately (e.g., log error, return specific error code)
	      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	    }
	  }
}
