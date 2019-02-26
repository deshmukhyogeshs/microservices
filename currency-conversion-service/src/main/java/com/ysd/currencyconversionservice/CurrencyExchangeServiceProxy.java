package com.ysd.currencyconversionservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ysd.currencyconversionservice.beans.CurrencyConversionBean;

//@FeignClient(name = "currency-exchange-service", url = "localhost:8000")
@FeignClient(name = "currency-exchange-service")
@RibbonClient(name="currency-exchange-service")
public interface CurrencyExchangeServiceProxy {

	@GetMapping("/exchange-value/from/{from}/to/{to}")
	public CurrencyConversionBean getExchangeValue(@PathVariable String from, @PathVariable String to);
}