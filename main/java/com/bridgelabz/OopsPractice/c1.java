package com.bridgelabz.OopsPractice;

public class c1 {
	int i;          
	static String name = "Hello";
	static void update() {
		name = "Hello Everyone";
	} 
static void display(){    
	System.out.println(name);
	
}
public static void main(String[] args) {
	update();
	c1 obj = new c1();
	c1.display();
}
	}


