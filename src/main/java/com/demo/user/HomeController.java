package com.demo.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String login()
	{
		return "login"	;
		
	}
	@RequestMapping("/home")
	public String home()
	{
		return "home";
	}
    @GetMapping("/register")
    public String registerForm() {
        return "register"; // resolves to templates/register.html
    }
}
