package com.rabbitmq;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class SimpleMessage implements Serializable {
	

	private static final long serialVersionUID = 1L;
	
	
	private String name;
	private String city;
	
	
	
	public SimpleMessage() {
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "SimpleMessage [name=" + name + ", city=" + city + "]";
	}


}
