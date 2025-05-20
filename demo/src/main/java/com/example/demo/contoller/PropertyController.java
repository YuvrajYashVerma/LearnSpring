package com.example.demo.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Property;
import com.example.demo.serviceimpl.PropertyServiceImp;

@RestController
@RequestMapping("/property")
public class PropertyController {
	@Autowired
	PropertyServiceImp propertyServiceImp;
	
	@PostMapping("/add")
	public Property addProperty(@RequestBody Property property) {
		return propertyServiceImp.addProperty(property);
	}
	
	@GetMapping("/get")
	public List<Property> addProperty(){
		return propertyServiceImp.getAllProperty();
	}
}
