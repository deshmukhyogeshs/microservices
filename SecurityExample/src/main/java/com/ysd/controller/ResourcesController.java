package com.ysd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info/")
public class ResourcesController {

	@GetMapping("/developerInfo")
	public String getDeveloperInfo() {
		
		return "My name is Yogesh, i am developer";
	}
	
	@GetMapping("/managerInfo")
	public String getManagerInfo() {
		
		return "My name is Adam, i am manager";
	}
	
	@GetMapping("/testerInfo")
	public String getTesterInfo() {
		
		return "My name is Adam, i am tester";
	}
}
