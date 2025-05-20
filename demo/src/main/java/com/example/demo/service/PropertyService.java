package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Property;

@Service
public interface PropertyService {
	public Property addProperty(Property property);
	public List<Property> getAllProperty();
	public List<Property> getAllPropertyByFilter();
}
