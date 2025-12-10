package com.tca.entities;

public class Address {
	private String city;
	
	public void  setCity(String city) {
		this.city = city;
		System.out.println("Address.setCity()");
	}

	public String getCity() {
		return city;
	}
}
