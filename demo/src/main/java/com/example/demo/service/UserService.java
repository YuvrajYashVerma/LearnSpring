package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
@Service
public interface UserService {
	
	User createUser(User user);
	
	List<User> getAllUsers();
	
	User updateUser(Integer id, User user);
	
    User deleteUser(Integer id);
    
    User checkAuth(String username,String password);
}
