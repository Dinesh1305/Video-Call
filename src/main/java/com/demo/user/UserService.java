package com.demo.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserService {

	private static final List<User>list=new ArrayList<>();	
	public void register( User user)	{
		
		user.setStatus("online");
		
		list.add(user);
		System.out.println(list);
		}
	
	
	public User login(User user)
	{
		for(int j=0;j<list.size();j++)
		{
			if(list.get(j).getUsername().equals(user.getUsername()) && list.get(j).getPassword().equals(user.getPassword()))
			{
				user.setStatus("online");
				return user;
			}
		}
		
		return null;
	}
	
	public void logout(String email)
	{
		for(int j=0;j<list.size();j++)
		{
			if(list.get(j).getUsername().equals(email))
			{
				list.get(j).setStatus("offline");
				//return user;
			}
		}
	}
}
