package com.ntt.Client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ntt.AutoWiring.Categories;

public class Client {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Categories cat = (Categories) context.getBean("cat");
		cat.setName("Programming");
		cat.Display();

	}
}
