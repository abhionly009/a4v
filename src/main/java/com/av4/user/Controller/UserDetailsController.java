package com.av4.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.av4.user.model.UserInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RestController
@RequestMapping("/user")
public class UserDetailsController {

	Logger logger = LoggerFactory.getLogger(UserDetailsController.class);
	@GetMapping
	public String getInfo() {
		
//		final String uri = "http://localhost:8080/check/id";
//	     
//	    RestTemplate restTemplate = new RestTemplate();
//	    String result = restTemplate.getForObject(uri, String.class);
//	     
//	    System.out.println(result);
//	    
//	    
	    return "resukt";
	}

	
	@PostMapping("/register")
	public UserInfo registerUser(@RequestBody UserInfo userInfo) {
	logger.info(userInfo.getAddress());
	logger.debug("DEBUG");
	
	logger.error("Error");
		return userInfo; 
	}
}
