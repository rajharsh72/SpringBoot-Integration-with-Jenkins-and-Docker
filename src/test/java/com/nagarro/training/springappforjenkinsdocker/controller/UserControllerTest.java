package com.nagarro.training.springappforjenkinsdocker.controller;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import com.nagarro.training.springappforjenkinsdocker.SpringAppForJenkinsDockerApplication;
import com.nagarro.training.springappforjenkinsdocker.model.User;
import com.nagarro.training.springappforjenkinsdocker.service.UserService;


@RunWith(MockitoJUnitRunner.class)
@SpringBootTest(classes = SpringAppForJenkinsDockerApplication.class)
public class UserControllerTest {
	
	@Mock 
	private UserService userService;
	
	@InjectMocks
	private UserController userController;
	
	@Test
	 public void testGetUsers_withUserService() throws Exception {
		List<User> expectedUsers = new ArrayList<>(Arrays.asList(
			      new User("Harsh Raj", "hr@gmail.com"),
			      new User("Jane Doe", "jane.doe@gmail.com"),
			      new User("Piyush Pander", "piyush@gmail.com"),
			      new User("Shreya Rathour", "shreyasingh@gmail.com")
			  ));
	
	    Mockito.when(userService.getUser()).thenReturn(expectedUsers);
	
	    ResponseEntity<List<User>> actualUsers = userController.getUser();
	
	    assertEquals(expectedUsers, actualUsers);
	  }
	
	@Test
	  public void testGetUsers_withoutUserService() throws Exception {
		List<User> expectedUsers = new ArrayList<>(Arrays.asList(
			      new User("Harsh Raj", "hr@gmail.com"),
			      new User("Jane Doe", "jane.doe@gmail.com"),
			      new User("Piyush Pander", "piyush@gmail.com"),
			      new User("Shreya Rathour", "shreyasingh@gmail.com")
			  ));

	    ResponseEntity<List<User>> actualUsers = userController.getUser();

	    assertEquals(expectedUsers, actualUsers);
	  }

}
