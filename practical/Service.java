package com.example.demo.service;

import com.example.demo.model.User;

@org.springframework.stereotype.Service

public class Service {
	public String processUser(User user) {
		return "hello"+user.getName();
		
	}

}
