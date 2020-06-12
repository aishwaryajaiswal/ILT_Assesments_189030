package com.ntt.vehicleSimulation;

public class Bike extends Vehicle{
	public void start()
	{
		System.out.println("Bike started");
	}
	public void stop()
	{
		System.out.println("Bike stopped");
	}
	public void displayDetails()
	{
		Vehicle vehicle=new Vehicle();
		vehicle.setNumber(567);
		vehicle.setName("Royal Enfield Classic 350");
		vehicle.setPrice(350000);
		vehicle.setGearType("Manual");
		vehicle.setFueltype("Petrol");
		System.out.println(vehicle.toString());	
	}
}
