package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Property;

@Repository
public interface PropertyRepo extends JpaRepository<Property,Integer>{

}
