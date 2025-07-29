package com.oops.polymorphism;

class Account {
	void Transaction(double amount) {
		System.out.println("Standard transaction: $ " + amount);
	}

}

class SavingAccount extends Account {
	@Override
	void Transaction(double amount) {
		System.out.println("SavingAccount transaction: $ " + amount);
	}
}
class BusinessAccount extends Account {
	@Override
	void Transaction(double amount) {
		System.out.println("BusinessAccount transaction: $ " + amount);
	}
}


public class MethodOverriding {

	public static void main(String[] args) {
		Account acc;
		acc=new SavingAccount();
		acc.Transaction(1000);
		
		acc=new BusinessAccount();
		acc.Transaction(200);
	}
}
