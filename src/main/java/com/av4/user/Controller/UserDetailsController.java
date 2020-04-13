package com.av4.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.av4.user.model.UserInfo;

@RestController
@RequestMapping("/user")
public class UserDetailsController {

	
	@GetMapping
	public String getInfo() {
		return "Welcome here";
	}


	
	@PostMapping("/register")
	public UserInfo registerUser(@RequestBody UserInfo userInfo) {
		return userInfo; 
	}
}
