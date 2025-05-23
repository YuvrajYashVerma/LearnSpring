
package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column
	private String name;
	@Column
	private String username;
	@Column
	private String password;
	
	public User(){}
	public User(Integer id) {
   	 super();
   	 this.id=id;
    }
	public User(Integer id,String name,String username,String password){
		super();
		this.id=id;
		this.name=name;
		this.username=username;
		this.password=password;
	}
	
	@Override
	public String toString(){
		return "User[id = "+id+", name = "+name+", username = "+username+", password = "+password+" ]";
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}