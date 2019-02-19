package com.ysd.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ysd.currencyexchangeservice.bean.ExchangeValue;

public interface CurrencyExchangeRepository extends JpaRepository<ExchangeValue, Integer> {

	public ExchangeValue findByFromAndTo(String from, String to);

}
