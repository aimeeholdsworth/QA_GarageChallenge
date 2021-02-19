package com.qa.exercises.objects;

import java.util.ArrayList;

public class ObjectChallengeBeforeChanges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create a person class modelling name, age and hob title
		// create a method to return all thress of these in a strng
		// create some example objects with this class

		// beginning way
//		person person1 = new person();
//		person.name = "Sue";
//		person.age = 45;
//		person.jobTitle = "Lawyer";

		// creating a person using the constructor
		Person person2 = new Person("Ken", 50, "mechanic");
		Person person3 = new Person("Judith", 100, "retired lady");

		printperson(person2);
		printperson(person3);

	}

	ArrayList<Person> personList = new ArrayList<>();

	// personList.add(person2);

	// System.out.println(personList.size());

	private static void printperson(Person person) { // move this to person later !
		// TODO Auto-generated method stub
		System.out.println("This is " + person.name + " they are " + person.age + " years old and they work as a "
				+ person.jobTitle);

	}

}
