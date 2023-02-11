package com.java.oops.inheritance.casting;

public class A {

	int var1;

	void testA() {
		System.out.println("testA");
	}

	static void staticTestA() {
		System.out.println("static testA");

	}
}

class B extends A {

	int var2;

	void testB() {
		System.out.println("testB");
	}

//	@Override
	static void staticTestA() {// static methods canot be overiden
		System.out.println(" Overriden static testA");

	}
}
