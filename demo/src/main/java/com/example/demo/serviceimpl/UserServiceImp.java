package com.example.demo.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.exception.UserNotFoundException;
import com.example.demo.repository.UserRepo;
import com.example.demo.service.UserService;

@Service
public class UserServiceImp implements UserService{
	@Autowired
	private UserRepo userRepo;
	List<User> al=new ArrayList<>();
	@Override
	public User createUser(User user) {
		return userRepo.save(user);
	}
	@Override
	public List<User> getAllUsers(){
		return userRepo.findAll();
	}
	@Override
	public User updateUser(String id, User user){
		for(User u:al) {
			if(u.getId().equals(id)){
				u.setName(user.getName());
				u.setUsername(user.getUsername());
				return u;
			}
		}
		throw new UserNotFoundException("Incorrect id : ");
	}
	@Override
	public User deleteUser(String id) {
		User user = userRepo.findById(id).get();
			if(user != null){
				userRepo.delete(user); 
				return user;
			}
		throw new UserNotFoundException("Incorrect id : ");
	}
	@Override
	public User checkAuth(String username,String password) {
		List<User> a2= userRepo.findByusername(username);
		for(User u:a2) {
			if(u.getUsername().equals(username) && u.getPassword().equals(password)){
				return u;
			}
		}
		return null;
		//throw new UserNotFoundException("Incorrect id : ");
	}
	
}
