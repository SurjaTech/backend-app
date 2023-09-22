package com.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.application.model.User;
import com.application.services.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController 
{
	@Autowired
	private UserService userService;
	
	@PostMapping("/signup")
	public User registerUser(@RequestBody User user) throws Exception
	{
		String currEmail = user.getEmail();

		if(currEmail != null)
		{
			User userObj = userService.fetchUserByEmail(currEmail);
			if(userObj != null)
			{
				throw new Exception("User with "+currEmail+" already exists !!!");
			}
		}
		
		User userObj = null;
		
		user.setRole("USER");
		user.setStatus("A");
		user.setCratedBy(user.getFullName());
		user.setCratedDate(java.time.LocalDateTime.now().toString());

		userObj = userService.saveUser(user);
		return userObj;
	}
}
