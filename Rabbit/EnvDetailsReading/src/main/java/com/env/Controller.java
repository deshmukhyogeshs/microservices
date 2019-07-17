package com.env;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Autowired
	AppConfiguration confg;
	
	@Autowired
	Test test;

	@GetMapping(path="/hi")
	public String sayHi() {
		test.sayHello();
		System.out.println(confg.getName());
		return confg.getName();
	}
	
}