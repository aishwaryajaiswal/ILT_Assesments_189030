package com.ntt.vehicleSimulation;

import java.util.Scanner;

public class Client {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n"+"======================================================================================");
		System.out.println("Welcome to Vehicle Simulation");
		System.out.println("\n"+"======================================================================================");
		System.out.println("Press below numbers for more details\r\n" + 
				"1.Car 2.Bike 3.Bus 4.Quit");
		int select;
		Scanner scanner=new Scanner(System.in);
		int choice=scanner.nextInt();
		if(choice==1)
		{
	
			System.out.println("\n"+"======================================================================================");
			System.out.println("Welcome to Car Simulation");
			Car car=new Car();
			System.out.println("\n"+"======================================================================================");
			System.out.println("Following are the Car details");
			car.displayDetails();
			System.out.println("\n"+"======================================================================================");
			System.out.println("press \n1.To start Car\n2.To stop Car\r\n" + 
					"3.To exit from car\r\n" + 
					"");
			select=scanner.nextInt();
			if(select==1)
			{
				car.start();
			}
			else if(select==2) {
				car.stop();
			}
			else if(select==3)
			{
				System.exit(select);
			}
			else
			{
				System.out.println("OOPS!!Invalid Choice..Try Again..");
			}}
		else if(choice==2)
		{
			System.out.println("\n"+"======================================================================================");
			System.out.println("Welcome to Bike Simulation");
			Bike bike=new Bike();
			System.out.println("\n"+"======================================================================================");
			System.out.println("Following are the Bike details");
			bike.displayDetails();
			System.out.println("\n"+"======================================================================================");
			System.out.println("press \n1.To start Bike\n2.To stop Bike\r\n" + 
					"3.To exit from Bike\r\n" + 
					"");
			select=scanner.nextInt();
			if(select==1)
			{
				bike.start();
			}
			else if(select==2) {
				bike.stop();
			}
			else if(select==3)
			{
				System.exit(select);
			}
			else
			{
				System.out.println("OOPS!!Invalid Choice..Try Again..");
			}
		}
		else if(choice==3) {
			System.out.println("\n"+"======================================================================================");
			System.out.println("Welcome to Bus Simulation");
			Bus bus=new Bus();
			System.out.println("\n"+"======================================================================================");
			System.out.println("Following are the Bus details");
			bus.displayDetails();
			System.out.println("\n"+"======================================================================================");
			System.out.println("press \n1.To start Bus\n2.To stop Bus\r\n" + 
					"3.To exit from Bus\r\n" + 
					"");
			select=scanner.nextInt();
			if(select==1)
			{
				bus.start();
			}
			else if(select==2) {
				bus.stop();
			}
			else if(select==3)
			{
				System.exit(select);
			}
			else
			{
				System.out.println("OOPS!!Invalid Choice..Try Again..");
			}}
		else if(choice==4)
		{
			System.exit(0);
		}
		else
		{
			System.out.println("OOPS!!Invalid Choice..Try Again..");
		}
		System.out.println("Press 1 to continue else press any key to quit");
		int n=scanner.nextInt();
		if(n==1)
		{
		main(null);	
		}
		
    System.out.println("================================THANK YOU================================================");
			}
		
	}


