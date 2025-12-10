package com.tca.service;

public class GreetingServiceImpl implements GreetingService {
	private String message;
	
	public GreetingServiceImpl() {}
	
	public GreetingServiceImpl(String message) {
		this.message = message;
	}
	
	@Override
	public void greet() {
		System.out.println(message);
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
}
