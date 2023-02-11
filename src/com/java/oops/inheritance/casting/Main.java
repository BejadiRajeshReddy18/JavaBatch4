package com.java.oops.inheritance.casting;

public class Main {

	public static void main(String[] args) {

		B bObject = new B();
		A upCastedB = bObject;// Typecasting [Upcasting] Implicit
		
		upCastedB.staticTestA();
		A.staticTestA();
		B.staticTestA();

		upCastedB.testA();
//		upCastedB.testB();

//		B aObject = (B) new A();// We cannot downcast directly
//		System.out.println(aObject);// java.lang.ClassCastException:
		
//		You can only downcast things which is already upcasted | Downcasting is always explicit
		B bObjectDownCasted = (B) upCastedB;
		System.out.println(bObjectDownCasted);
		bObjectDownCasted.testB();

	}

}
