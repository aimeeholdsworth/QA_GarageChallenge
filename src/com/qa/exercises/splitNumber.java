package com.qa.exercises;

public class splitNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// recursion(65);

		private int[] numList = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		private int num1;
		private int ind;

	}

//	public static void recursion(int number) {
//		if (number > 0) {
//			recursion(number / 10);
//			System.out.println(number % 10);
//			
//		}

	private int method() {
		int num1;
		if (num1 >= 10 && num1 < 20) {
			this.ind = 0;
			setNum1(this.num1 - 10);
		} else if (num1 >= 20 && num1 < 30) {
			this.ind = 1;
			setNum1(this.num1 - 20);
		} else if (num1 >= 30 && num1 < 40) {
			this.ind = 2;
			setNum1(this.num1 - 30);
		} else if (num1 >= 40 && num1 < 50) {
			this.ind = 3;
			setNum1(this.num1 - 40);
		} else if (num1 >= 50 && num1 < 60) {
			this.ind = 4;
			setNum1(this.num1 - 50);
		} else if (num1 >= 60 && num1 < 70) {
			this.ind = 5;
			setNum1(this.num1 - 60);
		} else if (num1 >= 70 && num1 < 80) {
			this.ind = 6;
			setNum1(this.num1 - 70);
		} else if (num1 >= 80 && num1 < 90) {
			this.ind = 7;
			setNum1(this.num1 - 80);
		} else if (num1 >= 90 && num1 < 100) {
			this.ind = 8;
			setNum1(this.num1 - 90);
		} else {
			throw new ArithmeticException("Number you've inputted is less than 10 or greater than 99");
		}
		return numList[ind] + num1;
	}

	private void setNum1(int i) {
		// TODO Auto-generated method stub

	}

}
