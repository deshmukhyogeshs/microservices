package com.env;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Test {

	@Autowired
	AppConfiguration confg;
	
	public Test() {
	}
	
	public void sayHello() {
		
		System.out.println("from test "+confg.getDesc());
	}
}
