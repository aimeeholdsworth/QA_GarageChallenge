package com.qa.exercises.garage;

import java.util.ArrayList;

public class Garage {
	private ArrayList<Vehicle> vehicles = new ArrayList<>();

	public Vehicle findVehicleByType(String vtype) {
		for (Vehicle vehicle : vehicles) {

			if (vehicle.getType() == vtype) {
				return vehicle;
			}
		}

		System.out.println("Couldn't find a vehicle");
		return null;

	}

	public void addVehicle(Vehicle vehicle) {
		this.vehicles.add(vehicle);
	}

	public void removeVehicle(Vehicle vehicle) {
		this.vehicles.remove(vehicle);
	}

	//////////////////////// BILLL //////////////////////

	private double bill;
	public int basePrice = 50;

	public void makeBill(Vehicle vehicle) {
		if (vehicle instanceof Car) {
			bill = basePrice * 2;
		} else if (vehicle instanceof Motorbike) {
			bill = basePrice * 0.5;
		} else if (vehicle instanceof Bus) {
			bill = basePrice * 4;
		} else {
			bill = basePrice * 1.5;
		}

	}

}
