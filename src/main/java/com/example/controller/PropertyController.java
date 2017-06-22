package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Property;
import com.example.service.PropertyService;

@RestController
public class PropertyController {
	
	@Autowired
	private PropertyService propertyService;
	
    @RequestMapping(value = "/property", method = RequestMethod.GET)
    public List<Property> getEmployees() {
		return propertyService.getAllProperties();
	}

    @RequestMapping(value = "/property/{loanNumber}", method = RequestMethod.GET)
    public Property getEmployee(@PathVariable("loanNumber") String loanNumber) {
		return propertyService.getPropertyById(loanNumber);
	}
}


