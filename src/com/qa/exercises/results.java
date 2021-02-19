package com.qa.exercises;

public class results {
	
	static double total = 0;
	//answers
	//public static int physics;
	//public static int chemistry;
	//public static int biology;
			
	//public static int total;
	//public static int percentage;
	

	public static void main(String[] args) {
		examMarks();
		examPercentage();
		
		//answers
		// physics = 45;
		// chemistry =35;
		// biology = 47;
		
		// total = physics + chemistry + biology;
		
		//System.out.println(getResults());
			

	}
	
	public static void examMarks() { 
		double physics = 40; 
		double chemistry = 145;
		double biology = 125;
		
		total = physics + chemistry + biology;
		
		System.out.println("Total mark = " + total);
		
	}
	
	//answers
	// public static String getResults() {
	// return "Physics:" + physics + " Chemistry:"+ chemistry + " biology: " + biology + " Total:" + total;
	//}
	
	public static void examPercentage() {
		double percentage = (total * 100) /450;
		System.out.println("Exam mark = " + percentage);
	}
	
	//answers
	// public static void getPercentage(){
	// percentage = total/150.0 *100; (didn't follow questions setup)
	// System.out.println("Percentage: " + percentage);
	//}

}
