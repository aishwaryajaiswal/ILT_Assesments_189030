package com.Singleton;

public class SingletonClass {

	 private static SingletonClass obj=null;
	 private SingletonClass() {}
	 
	 public static SingletonClass getInstanceOfSingleton() {
		 if(obj==null) {
			 obj=new SingletonClass();
		 }
		 return obj;
	 }
	 
	 public void dispaly(String msg) {
		 System.out.println(msg);
	 }
}
