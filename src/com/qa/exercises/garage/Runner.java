package com.qa.exercises.garage;

public class Runner {

	public static void main(String[] args) {

		Vehicle vehicle1 = new Car("car", 4, 5, 7, "silver");
		Vehicle vehicle2 = new Motorbike("motorbike", 2, 0, 1);
		Vehicle vehicle3 = new Bus("bus", 6, 1, 55);
		Vehicle vehicle4 = new Bus("bus", 6, 1, 2);

		Garage manager = new Garage();
		manager.addVehicle(vehicle1);
		manager.addVehicle(vehicle2);
		manager.addVehicle(vehicle3);

		manager.addVehicle(vehicle4);
		manager.removeVehicle(vehicle4);

		Vehicle found = manager.findVehicleByType("bus");
		found.print();

	}

}
