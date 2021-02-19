package com.qa.exercises.garage;

public class Vehicle {

	private int wheels;

	private int doors;

	private int seats;

	private String vtype;

	public Vehicle() {
		super();
	}

	public Vehicle(String vtype, int wheels, int doors, int seats) {
		this.vtype = vtype;
		this.wheels = wheels;
		this.doors = doors;
		this.seats = seats;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public int getSeats() {
		return seats;
	}

	public void getSeats(int seats) {
		this.seats = seats;
	}

	public String getType() {
		return vtype;
	}

	public void getType(String type) {
		this.vtype = type;
	}

	public void print() {
		System.out.println("This is a " + this.getType() + " , it has " + this.getWheels() + " wheels" + " and "
				+ this.getDoors() + " doors and " + this.getSeats() + " number of seats.");
	}

}
