package com.java.oops.access_modifiers_and_static;

import java.sql.Date;

//static are not object level, they are class level
public class Student {

//	std1, std2, std3
	private String id;
	String name;
	private Date dob;
	static int counter;// 1 // static things are shared among all the objects of its classes

	static {//staic block can be used to invoke static methods and initialize staic variables
		counter = 10;
		test();
	}

	public String getId() {
		return id;
	}

	public Student(String name, Date dob) {
		super();
		this.id = "std" + ++counter;
		this.name = name;
		this.dob = dob;
	}

	public Student(String id, String name, Date dob) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
	}

	@Override
	public String toString() {
//		confidential();
		return "Student [id=" + id + ", name=" + name + ", dob=" + dob + "]";
	}

	private void confidential() {
//		int dob = 9;
		System.out.println("DOB => " + this.dob);
	}

	static void test() {// only static things can be DIRCTLY accessd in a static
		System.out.println(counter);
//		test2();
		System.out.println("TEST static");
	}

	static void test2() {// only static things can be DIRCTLY accessd in a static
//		test();
		System.out.println("TEST2 static");
	}

}
