package com.java.oops.intro;

public class WrapperClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
		int x_ = 9;// always stack PRIMITIVE DATA TYPES ==> STACK FRAME
//		char c = 'd';
		// Pruitimitove varibles will make not make th code total Object Oriented

//		Wrapper Classes

		Integer i1 = new Integer(10);// @Deprecation
		Integer x = 9;// x is a object OBJECTS ==> HEAP
		Character c = 'f';
		Boolean b = false;

		int r = x;// auto unboxing
		Integer b1 = r;// auto boxing

	}

}
