package com.example.service;

import java.util.List;

import com.example.model.Property;

public interface PropertyService {
	Property getPropertyById(String loanNumber);
	List<Property> getAllProperties();
}
