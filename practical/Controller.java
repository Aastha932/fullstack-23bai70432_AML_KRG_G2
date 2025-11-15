package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.Service;

@RestController
public class Controller {
	@Autowired
	Service  service;
	
	@PostMapping("/hello")
	public String sayHello(@RequestBody User user) {
		return service.processUser(user);
	}
	
	

}
