package com.av4.user.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserDetailsController {

	
	@GetMapping
	public String getInfo() {
		return "Welcome here";
	}

}
