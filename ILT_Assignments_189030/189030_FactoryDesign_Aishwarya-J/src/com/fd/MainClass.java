package com.fd;

import java.util.Scanner;

public class MainClass {
public static void main(String[] args) {

getPrice gp=new getPrice();
	
	try{
		System.out.println("Enter the Mobile Brand:");
	
	Scanner sc=new Scanner(System.in);
	String mobileName=sc.next();
	
	Mobile m= gp.getPrice(mobileName);
	
	System.out.println("Enter the price of the Mobile:");
	double price=sc.nextDouble();
	
		
	double tax= m.getTax();
	
	double totalPrice=m.totalPrice(price,tax);
	
	System.out.println(mobileName+" Price is India "+totalPrice);
}catch(NullPointerException e) {
	System.out.println("Please enter name as: Samsung, Iphone or Nokia");
}
}
}

