package com.oops.abstraction;

class CarRide implements InterfaceWay {

	public void bookRide(String source, String destination) {
		System.out.println("Car ride booked from " + source + " to " + destination);
	}

	public double calculateFare(double distance) {
		return distance * 15;
	}

}

class BikeRide implements InterfaceWay {
	public void bookRide(String source, String destination) {
		System.out.println("Bike ride booked from " + source + " to " + destination);
	}

	public double calculateFare(double distance) {
		return distance * 7;
	}
}

public class Ride {

	public static void main(String[] args) {
		InterfaceWay carRide = new CarRide();
		carRide.bookRide("Airpor", "Hotel");

		System.out.println("Fare: ₹" + carRide.calculateFare(10));
		
		InterfaceWay bikeRide = new BikeRide();
		bikeRide.bookRide("Airpor", "Hotel");

		System.out.println("Fare: ₹" + bikeRide.calculateFare(10));
	}
}
