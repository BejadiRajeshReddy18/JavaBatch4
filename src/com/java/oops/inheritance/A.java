package com.java.oops.inheritance;

// Circular inheritance is also not possible

//public class A extends B{
//
//}
//
//class B extends A{
//	
//}

final class X {// final class cannot be inherited

}

public class A {
	private int secret = 98;

	private void secret() {

	}

	final void test1() {// final methhods cannot be oveidden
		System.out.println("test1");
	}
}

class B extends A {

	final int TEST_EXAMPLE;

	public B(int tEST) {
		super();
		TEST_EXAMPLE = tEST;
	}

	// @Override
	void test() {
//		TEST = 10;
		System.out.println("test2");
//		secret();
	}
}
