package com.qa.exercises;

public class resultsV2 {

	public static int physics;
	public static int chemistry;
	public static int biology;

	public static int total;
	public static double percentage;

	public static double physicsPercentage;
	public static double chemistryPercentage;
	public static double biologyPercentage;

	public static void main(String[] args) {

		physics = 45;
		chemistry = 35;
		biology = 47;

		total = physics + chemistry + biology;

		getResults();
		System.out.println(getPercentage());

		/*
		 * if (percentage > 60 && physicsPercentage > 60 && chemistryPercentage > 60 &&
		 * biologyPercentage > 60) { System.out.println("Well done, you passed"); } else
		 * if (physicsPercentage < 60) {
		 * System.out.println("You didn't pass physics, your mark was " + physics); }
		 * else if (chemistryPercentage < 60) {
		 * System.out.println("You didn't pass chem, your mark was" + chemistry); } else
		 * if (biologyPercentage < 60) {
		 * System.out.println("You didn't pass bio, your mark was" + biology); } else if
		 * (biologyPercentage < 60 ) {
		 * System.out.println("You didn't pass bio, your mark was" + biology); }else {
		 * System.out.println("Oh no, you failed"); }
		 */

		if (percentage > 60 /*
							 * && physicsPercentage > 60 && chemistryPercentage > 60 && biologyPercentage >
							 * 60
							 */) {
			System.out.println("Well done, you passed");

//			if (physicsPercentage < 60 && chemistryPercentage < 60) {
//				System.out.println("You didn't pass this though, Phy " + physics, " Chem " + chemistry);
//			}
//			if (biologyPercentage < 60 && chemistryPercentage < 60) {
//				System.out.println("You didn't pass this though, Bio " + biology, " Chem " + chemistry);
//			}
//			if (physicsPercentage < 60 && biologyPercentage < 60) {
//				System.out.println("You didn't pass this though, Phy " + physics, " Bio " + biology);
//			} else {
//				System.out.println("All modules passed");
//
//			}

		} else {
			System.out.println("Oh no, you failed");
		}

	}

	public static void getResults() {
		System.out
				.println("Physics:" + physics + " Chemistry:" + chemistry + " biology: " + biology + " Total:" + total);
		physicsPercentage = (physics / 150.0) * 100;
		chemistryPercentage = (chemistry / 150.0) * 100;
		biologyPercentage = (biology / 150.0) * 100;

	}

	public static double getPercentage() {

		return percentage = (total / 150.0) * 100;

		// System.out.println("Percentage: " + percentage);

	}

}
