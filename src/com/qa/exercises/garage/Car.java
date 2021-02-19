package com.qa.exercises.garage;

public class Car extends Vehicle {

	private String colour;

	public Car(String vtype, int wheels, int doors, int seats, String colour) {
		super(vtype, wheels, doors, seats);
		this.setColour(colour);
	}

	@Override
	public void print() {
		System.out.println(
				"This is a " + this.getType() + " , it has " + this.getWheels() + " wheels" + " and " + this.getDoors()
						+ " doors and " + this.getSeats() + " number of seats. The colour of it is " + getColour());
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

}
