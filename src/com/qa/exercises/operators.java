package com.qa.exercises;

public class operators {

	public static void main(String[] args) {
		addition();
		multiply();
		subtraction();
		division();

		// answers
		// System.out.println(add(12,45));
		// System.out.println(subtract(12,45));

	}

	public static void addition() { // method
		int num1 = 3;
		int num2 = 12;
		int answer = num1 + num2;
		System.out.println(answer);
	}

	public static void multiply() { // method
		int num1 = 3;
		int num2 = 12;
		int answer = num1 * num2;
		System.out.println(answer);
	}

	public static void subtraction() { // method
		int num1 = 3;
		int num2 = 12;
		int answer = num2 - num1;
		System.out.println(answer);
	}

	public static void division() { // method
		int num1 = 3;
		int num2 = 12;
		int answer = num2 / num1;
		System.out.println(answer);
	}

	// answers
	public static int add(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}

	public static int subtract(int num1, int num2) {
		return num1 - num2;
	}

}
