package com.java.oops.abstraction.interfaces.special;

@FunctionalInterface
public interface Lake {

	void swim();// one abstract method

//	void demo5();

	static void test() {

	}
}

class DulLake implements Lake {

	@Override
	public void swim() {
		System.out.println("Dal lake is a nice place for swimming");
	}

}


