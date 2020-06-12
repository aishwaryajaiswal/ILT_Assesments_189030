package com.nttdata.Model;

public class Employee {
private int employeeId;
private String employeeName;
private String employeeAddress;
private double employeeSalary;
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public String getEmployeeAddress() {
	return employeeAddress;
}
public void setEmployeeAddress(String employeeAddress) {
	this.employeeAddress = employeeAddress;
}
public double getEmployeeSalary() {
	return employeeSalary;
}
public void setEmployeeSalary(double employeeSalary) {
	this.employeeSalary = employeeSalary;
}
public Employee(int employeeId, String employeeName, String employeeAddress, double employeeSalary) {
	super();
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	this.employeeAddress = employeeAddress;
	this.employeeSalary = employeeSalary;
}
@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeAddress="
			+ employeeAddress + ", employeeSalary=" + employeeSalary + "]";
}

}
