package com.example.demo.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepo;
import com.example.demo.serviceimpl.UserServiceImp;

@Controller
public class ViewController {
	
	@Autowired
	private UserServiceImp userservice; 
	User user = new User();
	
	@RequestMapping("/login2")
	public String login2(@RequestParam String name,@RequestParam String username,@RequestParam String password) {
		user.setName(name);
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
	public String home(@RequestParam String username,@RequestParam String password, Model model) {
		System.out.println(username + "\t"+ password);
		User user=userservice.checkAuth(username, password);
		    if(user!=null){
			    model.addAttribute("user", user);
	    	    return "home";
	        }
	    return "register";
	}
}
