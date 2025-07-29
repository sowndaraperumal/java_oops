package com.oops.abstraction;

abstract class BankTransaction {
	abstract void authenticateUser();
	abstract void performTransaction();
	
	public void process() {
		authenticateUser();
		 performTransaction();
		 System.out.println("Transaction complete.");
	}
	

}
