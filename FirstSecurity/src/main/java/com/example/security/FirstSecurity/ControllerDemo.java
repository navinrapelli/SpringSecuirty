package com.example.security.FirstSecurity;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerDemo {
	
	
	@GetMapping("/home")
	public String home()
	{
		return "Welcome";
		
		
		
	}
	
	@GetMapping("/user")
	public String user()
	{
		return "Welcome user";
		
		
		
	}
	
	@GetMapping("/admin")
	public String admin()
	{
		return "Welcome admin";
		
		
		
	}
	@GetMapping("/log")
	public String log()
	{
		return "login" ;
		
		
		
	}

}
