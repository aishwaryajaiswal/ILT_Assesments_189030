package com.solid;

public class MainClass {
public static void main(String[] args) {
	//Single Responsibility
	BookClass book =new BookClass("Fault in our stars", "John Green", "Novel");
	BookPrinter bp= new BookPrinter();
	bp.printBook(book);
	
	//Open-Close Principle
	//Liskov Substitution
	TextBook tb= new TextBook("Mathematics", "KSC", "Education");
	bp.printBook(tb);
	Novel n=new Novel("Fault in our stars", "John Green", "Novel");
	bp.printBook(n);
	
	//Interface Segregation
	tb.TextBook();
	n.Novel();
	
	
}
}
