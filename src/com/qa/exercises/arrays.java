package com.qa.exercises;

public class arrays {

	// Create an array that will hold 10 integer values, populate the array with
	// values, then call and output each element.

//	public static int[] firstArray = { 2, 45, 3, 23, 67, 89, 12, 9, 55, 100 };
//
//	public static void main(String[] args) {
//		
//		for (int i : firstArray) {
//			System.out.println("Number: " + i);
//		}
	// }

	public static void main(String[] args) {

		int numbers[] = new int[10];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i;
			System.out.println(numbers[i] * 10);
		}

	}
}
