package com.solid;

public class BookPrinter  {
	// Single Responsibility implementation
	void printBook(BookClass b) {
		System.out.println("\n");
	System.out.println("Name is "+b.getName()+" author is "+b.getAuthor()+" and category is "+b.getCategory());
	System.out.println("Single Responsibility implementation");
}
}