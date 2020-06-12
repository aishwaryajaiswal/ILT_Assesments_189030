package com.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Client {
public static void main(String[] args) {
	
	List<Employee> empList=new ArrayList<Employee>();
	
	empList.add(new Employee(101, "Mahie", 10000));
	empList.add(new Employee(102, "Raksha", 15000));
	empList.add(new Employee(103, "Mouna", 6000));
	empList.add(new Employee(104, "Mohan", 50000));
	empList.add(new Employee(105, "Kavya", 7000));
	empList.add(new Employee(106, "Rudra", 80000));
	empList.add(new Employee(107, "Shiva", 50000));
	empList.add(new Employee(108, "Suma", 8000));
	empList.add(new Employee(109, "Kumar", 30000));
	empList.add(new Employee(110, "Krithi", 20000));
	
	System.out.println(empList);
	
	List<Double> employeeSalaryList=empList.stream().filter(p->p.getEmpSalary()>10000).map(p->p.getEmpSalary()).collect(Collectors.toList());
	System.out.println("The employee's salary more than 10000 is as follows:"+employeeSalaryList);
	
	long count=employeeSalaryList.stream().collect(Collectors.counting());
	System.out.println("Number of employee's whose salary is greater than 10000:\n"+count);
}
}
