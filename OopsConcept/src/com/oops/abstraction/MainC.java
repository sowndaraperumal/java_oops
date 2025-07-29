package com.oops.abstraction;

public class MainC extends AbstractClass{

	public void pay() {
		System.out.println("abstract class");
		
	}
	public static void main(String[] args) {
		MainC m= new MainC();
		m.pay();
		m.msg();
	}

}
