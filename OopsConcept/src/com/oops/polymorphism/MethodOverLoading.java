package com.oops.polymorphism;

/*
 * polymorphism allow method behave differently based on the object invokes them.
 * Its include method overloading and overriding
 */
class Shipping {
	void calculateCost(double weight) {
		System.out.println("Cost: $ " + weight * 5);
	}
	void calculateCost(double weight,double distance) {
		System.out.println("Cost: $ " +( weight * 5+distance*0.2));
	}
	void calculateCost(double weight,double distance,boolean express) {
		double cost =weight * 5+distance*0.2;
		if(express) cost+=20;
		System.out.println("Cost: $ " +cost);
	}
}

public class MethodOverLoading {
	public static void main(String[] args) {
		Shipping shipDetails= new Shipping();
		shipDetails.calculateCost(10);
		shipDetails.calculateCost(10,2);
		shipDetails.calculateCost(10,5,true);
		}
}
