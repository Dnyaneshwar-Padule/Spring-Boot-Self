package com.tca.entity;

import org.springframework.stereotype.Component;

/*
 	This annotation says to Spring, that he has to manage this class
 	i.e creating it's object and managing their life cycle
 */

@Component
public class Programmer {

	public void code() {
		System.out.println("Coding....");
	}
	
}
