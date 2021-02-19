package com.qa.exercises;

public class forFlow {

	public static void main(String[] args) {
//		for (int a = 100; a <= 200; a++) {
//			System.out.println(a);
//		}

//		for (int a = 100; a <= 200; a++) {
//			if (a % 2 == 0) {
//				System.out.println(a + "-");
//			} else {
//				System.out.println(a + "+");
//			}
//		}

//		int a = 0;  // shouldn't use while loop
//		while (a < 10) {
//			for (int b = 1; b < 11; b++) {
//				System.out.println(b);
//			}
//			a++;
//		}

//		for (int a = 0; a < 10; a++) {
//			for (int b = 1; b < 11; b++) {
//				System.out.println(b);
//			}
//		}

		for (int a = 0; a < 11; a++) {
			for (int b = 0; b < a; b++) {
				System.out.println(a);
			}
		}

	}

}
