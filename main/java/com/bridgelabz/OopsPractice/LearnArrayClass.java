package com.bridgelabz.OopsPractice;
import java.util.Arrays;

public class LearnArrayClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]numbers= {1,2,3,4,5,6,7,8,9,10};
int index=Arrays.binarySearch(numbers, 4);
System.out.println("The index of element 4 in the array is "+ index);

//to sort the array
Arrays.sort(numbers);
for(int i: numbers) {
	System.out.println(i+ " ");
	
}
//to fill same value
Arrays.fill(numbers, 12);
for (int i: numbers) {
	System.out.println(i+ " ");
}
	}

}
