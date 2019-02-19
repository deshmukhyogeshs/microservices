package com.ysd.limitsservice.bean;

public class LimitService {

	private int minimum;
	private int maximum;

	public LimitService(int minimum, int maximum) {
		super();
		this.minimum = minimum;
		this.maximum = maximum;
	}

	public int getMinimum() {
		return minimum;
	}

	public int getMaximum() {
		return maximum;
	}

}
