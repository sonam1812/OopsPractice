package com.bridgelabz.OopsPractice;


import java.util.Set;
import java.util.TreeSet;

public class LearnTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer>set = new TreeSet();
		set.add(32); //to add element althrough duplicate elements are not allowed in set
		set.add(2);
		set.add(54);
		set.add(21);
		set.add(65);
		System.out.println(set);  //output will be in a sorted way 
		// to remove an element
		set.remove(54);
		System.out.println(set);
		//check if element is present or not
		System.out.println(set.contains(100));
		System.out.println(set.contains(21));
		// to check set is empty or not
		System.out.println(set.isEmpty());
		// to check how many element is present in set
		System.out.println(set.size());
		// to clear set
		set.clear();
		System.out.println(set);

	}

}
