package com.oops.encapsulation;

/*
 * Encapsulation is concept of hidden internal details of a class and
 * restricting access to a certain component using access modifiers
 */
public class Encapsulation {

	public static void main(String[] args) {
		AtmAccount amt = new AtmAccount(1000, 1234);
		amt.getBalance(1111);

		amt.withdraw(1234, 200);
		System.out.println("Balance: $" + amt.getBalance(1234));

	}
}
