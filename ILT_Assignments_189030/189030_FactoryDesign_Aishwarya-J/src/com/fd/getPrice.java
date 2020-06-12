package com.fd;

public class getPrice {

	public Mobile getPrice(String mobileBrand) {
		
		if(mobileBrand.equalsIgnoreCase("Iphone")) {
			return new Iphone();
		}
		
		if(mobileBrand.equalsIgnoreCase("Samsung")) {
			return new Samsung();
		}
		
		if(mobileBrand.equalsIgnoreCase("Nokia")) {
			return new Nokia();
		}
		
		if(mobileBrand==null) {
			return null;
		}
	return null;
	}
}
