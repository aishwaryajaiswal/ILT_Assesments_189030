package com.solid;

public class BookClass {

	public BookClass(String name, String author, String category) {
		super();
		//implementation of Dependency inversion 
		this.name = name;
		this.author = author;
		this.category = category;
	}
	private String name;
	private String author;
	private String category;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
}
