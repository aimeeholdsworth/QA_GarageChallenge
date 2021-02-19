package com.qa.exercises.objects;

public class ObjectChallenge {

	public static void main(String[] args) {

		// creating a person using the constructor
		Person person2 = new Person("Ken", 50, "mechanic");
		Person person3 = new Person("Judith", 100, "retired lady");

		printperson(person2);
		printperson(person3);

	}

	private static void printperson(Person person) { // move this to person later !
		// TODO Auto-generated method stub
		System.out.println("This is " + person.name + " they are " + person.age + " years old and they work as a "
				+ person.jobTitle);

	}

}
