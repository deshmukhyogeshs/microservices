package com.env;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@EnableAutoConfiguration
@SpringBootApplication
public class EnvDetailsReadingApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnvDetailsReadingApplication.class, args);
	}

}
