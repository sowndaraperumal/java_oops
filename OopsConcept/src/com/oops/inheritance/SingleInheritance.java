package com.oops.inheritance;

//A Bank account system where all types of accounts inherit basic functiionalitiies like deposit and withdraw

class BankAccount {
	double balance = 0;

	void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited: " + amount);
		System.out.println("Balance: " + balance);
	}

	void withdraw(double amount) {
		balance -= amount;
		System.out.println("Withdraw: " + amount);
		System.out.println("Balance: " + balance);
	}
}

class SavingAccount extends BankAccount {
	void addInterest() {
		double interest = balance * 0.5;
		balance += interest;
		System.out.println("Interest added:  " + interest);
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		SavingAccount account = new SavingAccount();
		account.deposit(1000);
		account.addInterest();
		account.withdraw(200);

	}
}
