package com.java.oops.access_modifiers;

import java.sql.Date;

public class Main {

	public static void main(String[] args) {

		Student s1 = new Student(0, "Jane", new Date(1999, 11, 12));
		System.out.println(s1);

		System.out.println(s1.name);

		System.out.println(s1.getId());

	}
}
