package com.example.demo.contoller;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.User;

import jakarta.persistence.Entity;


import org.springframework.stereotype.Controller;
@Controller
public class AdminController {
	public AdminController() {
		System.out.println("Admin Controller ");
	}
	@Bean
	public User getUser() {
		System.out.println(" User Object");
		return new User();
	}
	@Bean
	public User getUser2() {
		System.out.println("User 2 Object");
		return new User();
	}
	
}



