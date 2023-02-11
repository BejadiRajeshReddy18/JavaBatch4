package com.java.oops.abstraction.interfaces;

public interface Bank extends RBI{// 100% abstraction

	// Variable inside interfaces are final and static implicitly
	String name = "SBI";
	static final String IFSC = "SBI009";

	long checkBalance(int id);// abstract method

	abstract void enquireLoan();

	// intefaces cannot have concrete methods
	// SInce JDK 8 , intfaces can have default and static methods

	static void rbiGuideLines() {
		System.out.println("All banks should abiod by the offical guildelines");
	}

	default void getHolidayList() {
		System.out.println("Sunday and national holiday --> bank remains closed");
	}
//	JDK 9   private method also
}

//FunctionalInterface
//MarkerInterface
