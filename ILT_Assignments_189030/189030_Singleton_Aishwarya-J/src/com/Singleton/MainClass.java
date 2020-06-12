package com.Singleton;

public class MainClass {
public static void main(String[] args) {
	//SingletonClass singletonObj=new SingletonClass();
	SingletonClass obj1=SingletonClass.getInstanceOfSingleton(); 
	System.out.println(obj1);
	
	SingletonClass obj2=SingletonClass.getInstanceOfSingleton(); 
	System.out.println(obj2);
	
	System.out.println("Both are same... Only one object is created");
}
}
