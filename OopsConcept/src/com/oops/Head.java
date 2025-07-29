package com.oops;

class Car {
	String brand;
	String model;

	void drive() {
		System.out.println(brand + " " + model + "is driving");
	}
}

public class Head {

	public static void main(String[] args) {
		Car mycar = new Car();
		mycar.brand = "toyota";
		mycar.model = "Corolla";
		mycar.drive();
	}
}
