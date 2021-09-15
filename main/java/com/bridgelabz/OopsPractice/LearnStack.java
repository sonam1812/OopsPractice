package com.bridgelabz.OopsPractice;
import java.util.Stack;
public class LearnStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack<String> animals = new Stack();
animals.push ( "Lion");
animals.push ( "Dog");
animals.push ( "Horse");
animals.push ("Cat");
System.out.println("Stack:" +animals);
//pop operation & peek operation
System.out.println(animals.peek());
animals.pop();
System.out.println(animals.peek());
//to see all in stack
System.out.println("Stack: "+ animals);
	}

}
