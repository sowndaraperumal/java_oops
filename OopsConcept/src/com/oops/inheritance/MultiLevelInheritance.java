package com.oops.inheritance;

class Person {
	String name = "sowndar";
}

class Employees extends Person {
	int empId = 1001;
}

class Maganer extends Employees {
	String department = "Finace";

	void displayDetails() {
		System.out.println("Name: " + name);
		System.out.println("ID: " + empId);
		System.out.println("Department: " + department);
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		Maganer managerDetaisl = new Maganer();
		managerDetaisl.displayDetails();
	}

}
