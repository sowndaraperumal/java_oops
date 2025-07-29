package com.oops.inheritance;



class Vechile{
	void startEngine() {
		System.out.println("Engine Stared");
	}
}
class Car extends Vechile{
	void drive() {
		System.out.println("Car is driving");
	}
}
public class Inheritance {

	public static void main(String[] args) {
		Car myCar =new Car();
		myCar.startEngine();
		myCar.drive();
	}
}
