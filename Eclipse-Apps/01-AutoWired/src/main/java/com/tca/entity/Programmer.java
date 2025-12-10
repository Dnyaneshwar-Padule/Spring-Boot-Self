package com.tca.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Programmer {

	/*
	  Spring will create object of Developer,
	  we don't need to initialize it,....
	 */
	
	@Autowired
	private Developer dev;
	
	public void code() { 
		System.out.println("Coding...");
		System.out.println(dev.develop());
	}
	
}
