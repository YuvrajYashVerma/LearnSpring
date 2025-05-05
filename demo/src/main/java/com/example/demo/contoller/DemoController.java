package com.example.demo.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.serviceimpl.UserServiceImp;
@RestController
public class DemoController{
	@Autowired
	UserServiceImp userServiceImp;
	
	@GetMapping("/test")
	public String getName() {
		return "Yuvraj ji";
	}
	@PostMapping("/create")
	public String show(@RequestBody User user){
		user = userServiceImp.createUser(user);
		return user.toString();
	}
}














/*public class DemoController {
	@RequestMapping("/abc")
	public String getName(){
		return "yuvraj";
	} 
	@PostMapping("/id")
	public String getId(){
		return ""+10;
	}
	@GetMapping("/pass")
	public String getPassword(@RequestParam("un") String un){
		return ""+un;
	}
}*/


