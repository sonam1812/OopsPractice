package com.bridgelabz.OopsPractice;

public abstract class Children {
	abstract void sound();
		
	}
class dog extends Children{
	void sound() {
		System.out.println("wooof");
		
	}
	public static void main(String[] args) {
		Children a = new dog ();
		a.sound();
	}
}
