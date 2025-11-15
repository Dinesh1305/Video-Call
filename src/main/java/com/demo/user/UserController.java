package com.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*")
public class UserController {

	
	@Autowired
	UserService service;
	

	@PostMapping("login")
	public User login(@RequestBody User user){
		
		System.out.println(user);
		return service.login(user);
	}
	
	@PostMapping("logout")
	public void logout(String email)
	{
		service.logout(email);
	}
	
	@PostMapping("register")
	public void register(User user)
	{
		 service.register(user);
	}
	
}
