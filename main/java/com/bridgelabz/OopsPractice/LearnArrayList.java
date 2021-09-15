package com.bridgelabz.OopsPractice;
import java.util.ArrayList;
import java.util.List;

public class LearnArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String[] studentName = new String[30];
//studentName[1] = "Rakesh";
//studentName[1]...........studentName[28]
//studentName[29] = "Harish";
//New Student enter
//studentName[30] = "Raman";
//ArrayList<String> studentName = new ArrayList();
//studentName.add("Rakesh");
List<Integer>list = new ArrayList();
list.add(1);
list.add(2);
list.add(3);
list.add(4);
System.out.println(list);
list.add(5);
System.out.println(list);
//list.add (index: 1, element: 50);
//System.out.println(list);
//to add new list in previous list
List<Integer>newlist = new ArrayList();
newlist.add(150);
newlist.add(160);
list.addAll(newlist);
System.out.println(list);
System.out.println(list.get(1)); // TO GET PARTICULAR INDEX VALUE
System.out.println(list.get(5));
System.out.println(list.get(3));
//TO REMOVE INDEX VALUE
//list.remove(index:1);
//System.out.println(list);
//TO REMOVE LIST
//list.clear();
//System.out.println(list);
//TO UPDATE INDEX VALUE

	}

}
