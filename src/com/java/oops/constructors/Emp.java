package com.java.oops.constructors;

import java.util.Scanner;

//Java is a strictly encapsulated language
 class Emp {

	 //Default by default because we have not assigned any modifiers
	int id;
	String name;
	Scanner sc;

	void nameTheEmpl() {
		System.out.println(name);
	}

	public Emp() {// Non parameterized explicit constructor
		System.out.println("Emp() called");
	}

	// this points to the current object
	public Emp(int id, String name) {// parameterized explicit constructor

//		! this() should be the 1st statement in the constructor
		this();// calling another constructor form a constructor is called constructor chaining

		System.out.println("Emp(id,name) called");
		System.out.println("Emp(id,name) called");
		this.id = id;// usually we assign tha values to our instance variables
		this.name = name;// shadow problem

		this.sc = new Scanner(System.in);
	}
	// A constructor executes only once while creation of object

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}

}

//When there is no explicit constructors defined , JVM will add a default constructor
