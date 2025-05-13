package com.example.demo.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.User;
import com.example.demo.serviceimpl.UserServiceImp;

@Controller
public class ViewController {
	
	@Autowired
	private UserServiceImp userservice; 
	User user = new User();
	
	@RequestMapping("/login2")
	public String login2(@RequestParam String id,@RequestParam String name,@RequestParam String username,@RequestParam String password) {
		user.setName(name);
		user.setId(id);
		user.setUsername(username);
		user.setPassword(password);
		userservice.createUser(user);
		return "index";
	}
	
	@RequestMapping("/login")
	public String login(){
		return "index";
	}
	@RequestMapping("/register")
	public String register() {
		return "register";
	}
	
	@RequestMapping("/home")
	public String home(@RequestParam String username,@RequestParam String password) {
		System.out.println(username + "\t"+ password);
		User user=userservice.checkAuth(username, password);
		if(user!=null){
	    	return "home";
	    }
	    return "register";
	}
}
