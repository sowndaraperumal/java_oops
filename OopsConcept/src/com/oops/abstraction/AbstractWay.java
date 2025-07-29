package com.oops.abstraction;

/*
 * Abstraction means hiding implementation detail
 * only showing the feature.
 * it help you to focusing on what object does instead of how its does it.
 */

class SavingsAccountTransaction extends BankTransaction {
	@Override
	void authenticateUser() {
		System.out.println("Authenticating savings account holder...");
	}

	@Override
	void performTransaction() {
		System.out.println("Performing savings account transaction...");
	}
}

public class AbstractWay {

	public static void main(String[] args) {
		BankTransaction bt = new SavingsAccountTransaction();
		bt.process();
	}

}
