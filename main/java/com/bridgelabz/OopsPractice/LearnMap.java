package com.bridgelabz.OopsPractice;

import java.util.HashMap;
import java.util.Map;

public class LearnMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<String,Integer>numbers = new HashMap();
numbers.put("One", 1); //key should be unique otherwise override happens
numbers.put("Two", 2);
numbers.put("Three", 3);
System.out.println(numbers);
numbers.putIfAbsent("Two", 23);
System.out.println(numbers);
numbers.put("Two", 23);
System.out.println(numbers);	
if(!numbers.containsKey("Two")) {
	numbers.put("Two", 23);
	
}
System.out.println(numbers);
	}
}
