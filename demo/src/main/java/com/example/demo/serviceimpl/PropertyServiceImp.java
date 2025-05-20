package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Property;
import com.example.demo.repository.PropertyRepo;
import com.example.demo.service.PropertyService;

@Service
public class PropertyServiceImp implements PropertyService{
	@Autowired
	PropertyRepo propertyRepo;
	@Override
	public Property addProperty(Property property) {
		return propertyRepo.save(property);
	}
	@Override
	public List<Property> getAllProperty(){
		return propertyRepo.findAll();
	}
	@Override
	public List<Property> getAllPropertyByFilter(){
		return null;
	}
}
