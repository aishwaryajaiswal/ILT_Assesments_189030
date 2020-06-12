package com.solid;

public class TextBook extends BookClass implements TextBookInterface {
// Open-Close implementation
	public TextBook(String name, String author, String category) {
		super(name, author, category);
		
	}

@Override
public void TextBook() {
	System.out.println("\n");
	System.out.println("TextBook interface method");
	System.out.println("implementation of Interface Segregation");
	
	
}



}
