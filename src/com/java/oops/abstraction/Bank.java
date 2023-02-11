package com.java.oops.abstraction;

//using abstract class you can achieve abstratcion between 0 -100%
public abstract class Bank {
//You have to declare the class as abstract if there are atleast one abstract method
	String name;
	String IFSC;
	
	abstract long checkBalance(int ID);//abstract method
	
	void enquireLoan(){//concrete method
		System.out.println("You  loan request is processing");
	}
	
	
}
