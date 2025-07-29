package com.oops.encapsulation;

public class AtmAccount {

	private double balance;
	private int pin;

	public AtmAccount(double balance, int pin) {
		this.balance = balance;
		this.pin = pin;
	}

	public boolean verifyPin(int enteredPin) {
		return pin == enteredPin;
	}

	public double getBalance(int enteredPin) {
		if (verifyPin(enteredPin)) {
			return balance;
		} else {
			System.out.println("Incorrect PIN");
			return -1;
		}

	}
	
	public void withdraw(int enteredPin,double amount) {
		if (verifyPin(enteredPin)) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawn: $" + amount);
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Incorrect PIN");
        }
	}

}
