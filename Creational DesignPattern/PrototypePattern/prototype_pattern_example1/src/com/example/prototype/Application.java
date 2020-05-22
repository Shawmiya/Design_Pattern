package com.example.prototype;

public class Application {
	public static void main(String[] args) {
		Registry registry = new Registry();
		Car car = (Car) registry.getVehicle(VehicleType.CAR);
		System.out.println(car);

		car.setType("newtype");
		System.out.println(car);

		Car car1 = (Car) registry.getVehicle(VehicleType.CAR);
		System.out.println(car1);

	}
}
