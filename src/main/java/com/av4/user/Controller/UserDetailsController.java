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
		
		System.out.println(userInfo.getName());
		System.out.println(userInfo.getAddress());
		System.out.println(userInfo.getEmail());
		System.out.println(userInfo.getCompany());
		System.out.println(userInfo.getMobile());
		
		System.out.println(userInfo.isEmailVerified());
		System.out.println(userInfo.isMobileVerified());


		return userInfo; 
	}
}
