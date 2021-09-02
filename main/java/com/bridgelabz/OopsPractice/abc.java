package com.bridgelabz.OopsPractice;

public class abc {
	static int i;
	static String name;
	static float f;

	abc (int x, String n, float y){
		i=x;
		name= n;
		f= y;
		
		
	}
	public static void main(String[] args) {
		abc obj = new abc (20, "Hello", 7.8f);
		System.out.println("int i: "+i);
		System.out.println("name : "+name);
		System.out.println("float f: "+f);
		
	}
}
