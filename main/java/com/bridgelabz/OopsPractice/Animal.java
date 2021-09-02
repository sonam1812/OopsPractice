package com.bridgelabz.OopsPractice;

public class Animal {
	void move() {
		System.out.println("Animal can move");
	}
}
 class Dog extends Animal{
	void move() {
		System.out.println("Dog can Walk");
	}
}
class test{
	public static void main(String[] args) {
	Animal a = new Animal();
	Animal b = new Dog();
}
}