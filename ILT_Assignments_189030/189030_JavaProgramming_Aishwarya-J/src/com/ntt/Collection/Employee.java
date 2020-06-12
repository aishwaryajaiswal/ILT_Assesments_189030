package com.ntt.Collection;

public class Employee {
	 private int employeeId;
	 private String employeeName;
	 private String employeeAddress;
	 private double employeeSalary;
	 private String employeeGrade;
	 private String employeeMobile;
	 private String employeeEmail;
	 
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

	public String getEmployeeGrade() {
		return employeeGrade;
	}

	public void setEmployeeGrade(String employeeGrade) {
		this.employeeGrade = employeeGrade;
	}

	public String getEmployeeMobile() {
		return employeeMobile;
	}

	public void setEmployeeMobile(String employeeMobile) {
		this.employeeMobile = employeeMobile;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public Employee(int employeeId, String employeeName, String employeeAddress, double employeeSalary,
			String employeeGrade, String employeeMobile, String employeeEmail) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeeSalary = employeeSalary;
		this.employeeGrade = employeeGrade;
		this.employeeMobile = employeeMobile;
		this.employeeEmail = employeeEmail;
	}

	@Override
	public String toString() {
		return "EmployeeId=" + employeeId + "\nEmployeeName=" + employeeName + "\nEmployeeAddress="
				+ employeeAddress + "\nEmployeeSalary=" + employeeSalary + "\nEmployeeGrade=" + employeeGrade
				+ "\nEmployeeMobile=" + employeeMobile + "\nEmployeeEmail=" + employeeEmail + "\n"+"=================================\n";
	}
	
}
