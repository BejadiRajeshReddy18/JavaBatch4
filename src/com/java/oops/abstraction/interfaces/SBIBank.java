package com.java.oops.abstraction.interfaces;

//Multiple implementation  is possible
public class SBIBank implements Bank, WorlBank {// SBIBank is a implementaion class for Bank interface

	@Override
	public long checkBalance(int id) {
		System.out.println("BALANCE ==> " + Math.random() * 10000);
		return 0;
	}

	@Override
	public void enquireLoan() {
		System.out.println("You  loan request is processing");
	}

}
