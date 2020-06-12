package com.ntt.vehicleSimulation;

public class Vehicle {
private int number;
private String name;
private double price;
private String gearType;
private String fueltype;
public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getGearType() {
	return gearType;
}
public void setGearType(String gearType) {
	this.gearType = gearType;
}
public String getFueltype() {
	return fueltype;
}
public void setFueltype(String fueltype) {
	this.fueltype = fueltype;
}
@Override
public String toString() {
	return "number=" + number + "\nname=" + name + "\nprice=" + price + "\ngearType=" + gearType
			+ "\nfueltype=" + fueltype;
}

}
