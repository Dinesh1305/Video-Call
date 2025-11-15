package com.demo.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home()
	{
		return "login"	;
		
	}
	
    @GetMapping("/register")
    public String registerForm() {
        return "register"; // resolves to templates/register.html
    }
}
