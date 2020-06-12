package com.ntt.vehicleSimulation;

public class Car extends Vehicle{
	public void start()
	{
		System.out.println("Car started");
	}
	public void stop()
	{
		System.out.println("Car stopped");
	}
	public void displayDetails()
	{
		Vehicle vehicle=new Vehicle();
		vehicle.setNumber(123);
		vehicle.setName("Mercedes Benz");
		vehicle.setPrice(1200000);
		vehicle.setGearType("Automatic");
		vehicle.setFueltype("Petrol");
		System.out.println(vehicle.toString());	
	}
}
