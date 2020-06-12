package com.solid;

public class Novel extends BookClass implements NovelInterface{
//open-close implementation
	public Novel(String name, String author, String category) {
		super(name, author, category);
	}

	@Override
	public void Novel() {
		System.out.println("\n");
		System.out.println("Novel interface method");
		System.out.println("implementation of Interface Segregation");
		
		
	}
}
