package com.qa.exercises;

public class calculatorV2 {
	public static double sum;

	public static void main(String[] args) {

		System.out.println(divide(3, 45));

	}

	public static double divide(double num1, double num2) {
		if (num1 < num2) {
			double sum = num2 / num1;
			return sum;

		} else {
			System.out.println("Sorry number 1 is not small enough");
		}
		return sum;

	}
}
