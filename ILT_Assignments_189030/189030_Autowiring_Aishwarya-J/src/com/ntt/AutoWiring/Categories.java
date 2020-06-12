package com.ntt.AutoWiring;

public class Categories {

	private Book book;
	private String name;
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void Display(){
        System.out.println("Category : " + name);
        System.out.println("BookName : " + book.getBookName());
        System.out.println("BookPrice : " + book.getBookPrice());


    }
}
