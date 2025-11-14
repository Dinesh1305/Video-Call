package com.demo.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {

	private static final List<User>list=new ArrayList<>();

	
	
	public void register(User user)	{
		
		user.setStatus("online");
		list.add(user);;
	}
}
