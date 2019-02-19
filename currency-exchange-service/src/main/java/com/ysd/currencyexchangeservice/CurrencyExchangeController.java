package com.ysd.currencyexchangeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ysd.currencyexchangeservice.bean.ExchangeValue;

@RestController
public class CurrencyExchangeController {

	@Autowired
	private Environment environment; 
	
	@Autowired
	CurrencyExchangeRepository repository;

	@GetMapping("/exchange-value/from/{from}/to/{to}")
	public ExchangeValue getExchangeValue(@PathVariable String from, @PathVariable String to) {
System.out.println(environment.getProperty("local.server.port"));
		return repository.findByFromAndTo(from, to);
	}

}