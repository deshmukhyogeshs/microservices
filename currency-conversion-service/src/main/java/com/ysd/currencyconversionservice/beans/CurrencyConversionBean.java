package com.ysd.currencyconversionservice.beans;

import java.math.BigDecimal;

public class CurrencyConversionBean {

	private int id;
	private String from;
	private String to;
	private BigDecimal conversionMultiple;
	private BigDecimal qualtity;
	private BigDecimal totalCalculatedAmount;
	private int port;

	public CurrencyConversionBean() {
	}

	public CurrencyConversionBean(int id, String from, String to, BigDecimal conversionMultiple, BigDecimal qualtity,
			BigDecimal totalCalculatedAmount, int port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
		this.qualtity = qualtity;
		this.totalCalculatedAmount = totalCalculatedAmount;
		this.port = port;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}

	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}

	public BigDecimal getQualtity() {
		return qualtity;
	}

	public void setQualtity(BigDecimal qualtity) {
		this.qualtity = qualtity;
	}

	public BigDecimal getTotalCalculatedAmount() {
		return totalCalculatedAmount;
	}

	public void setTotalCalculatedAmount(BigDecimal totalCalculatedAmount) {
		this.totalCalculatedAmount = totalCalculatedAmount;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

}
