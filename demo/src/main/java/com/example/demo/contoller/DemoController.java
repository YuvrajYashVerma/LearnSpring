package com.example.demo.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.serviceimpl.UserServiceImp;
@RestController
@RequestMapping("/user")
public class DemoController{
	
	@Autowired
	private UserServiceImp userService;
	
	@PostMapping("/register")
	public User createUser(@RequestBody User user){
	    return  userService.createUser(user);
	}
	@GetMapping("/all")
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	@PutMapping("/update/{id}")
	public User  updateUser(@PathVariable Integer id, @RequestBody User user){
		return userService.updateUser(id,user);
	}
	@DeleteMapping("/delete/{id}")
	public User deleteUser(@PathVariable Integer id){
		return userService.deleteUser(id);
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


