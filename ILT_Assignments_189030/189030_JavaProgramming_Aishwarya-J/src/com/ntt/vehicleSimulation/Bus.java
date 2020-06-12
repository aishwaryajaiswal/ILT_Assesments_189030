package com.ntt.vehicleSimulation;

public class Bus extends Vehicle{
	public void start()
	{
		System.out.println("Bus started");
	}
	public void stop()
	{
		System.out.println("Bus stopped");
	}
	public void displayDetails()
	{
		Vehicle vehicle=new Vehicle();
		vehicle.setNumber(890);
		vehicle.setName("Sleeper 2 Deck");
		vehicle.setPrice(500000);
		vehicle.setGearType("Manual");
		vehicle.setFueltype("Petrol");
		System.out.println(vehicle.toString());	
	}

}
