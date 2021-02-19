package com.qa.exercises.objects;

import java.util.ArrayList;

public class PeopleListArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void addPeople() {
		ArrayList<Person> personList = new ArrayList<>();

		Person person2 = new Person("Lucy", 50, "mechanic");

		personList.add(person2);

		System.out.println(personList);

	}

}
