package com.fd;

public abstract class Mobile {

	protected double tax;
	abstract double getTax();
	
	double  totalPrice(double price,double tax){
		this.tax=tax;
      return tax*price;
		
	}
}
