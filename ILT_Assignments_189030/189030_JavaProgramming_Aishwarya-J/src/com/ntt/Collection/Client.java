package com.ntt.Collection;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;


public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,Employee> set=new TreeMap<>();
		set.put(1,new Employee(103, "Sandhya", "Bangalore", 25000, "Grade 4", "939274333", "abc@gmail.com"));
		set.put(4,new Employee(105, "Keerthana", "Chennai", 25000, "Grade 4", "7563545578", "xyz@gmail.com"));
		set.put(2,new Employee(104, "Neeraja", "Hydrabad", 25000, "Grade 4", "834395349", "cde@gmail.com"));
		set.put(3,new Employee(106, "Himaja", "Hydrabad", 25000, "Grade 4", "7857454572", "asd@gmail.com"));
		set.put(5,new Employee(107, "Mownika", "Nellore", 25000, "Grade 4", "9765454522", "ghi@gmail.com"));
		System.out.println("=================EMPLOYEE DETAILS=================");
		System.out.println(set);
	
	}

}
