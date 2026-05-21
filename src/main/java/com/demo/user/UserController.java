package com.demo.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@GetMapping("getall")
	public List<User> getAll()
	{
		return service.getAll();
	}
	@PostMapping("logout")
	public void logout(String email)
	{
		service.logout(email);
	}
	
	@PostMapping("register")
	public void register(@RequestBody User user)
	{
		 service.register(user);
	}
	
}
