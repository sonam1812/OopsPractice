package com.bridgelabz.OopsPractice;

import java.util.HashMap;
import java.util.Map;

public class IterateMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer>numbers = new HashMap();
		numbers.put("One", 1); //key should be unique otherwise override happens
		numbers.put("Two", 2);
		numbers.put("Three", 3);
		System.out.println(numbers);
		for(Map.Entry<String, Integer>e: numbers.entrySet()) {
			System.out.println(e);
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
			for(String Key: numbers.keySet()) {
				System.out.println(Key);
			}
			for(Integer value:numbers.values()) {
				System.out.println(value);
			}
		}
	}


