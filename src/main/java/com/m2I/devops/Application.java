package com.m2I.devops;

public class Application {

	public static void main(String[] args) {
		System.out.println("Hello world!");
		
		Calculator c = new Calculator();
		c.add(2, 3);
		c.sub(9, 2);
	}

}
