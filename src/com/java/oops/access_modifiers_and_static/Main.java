package com.java.oops.access_modifiers_and_static;

import java.sql.Date;
import java.util.Arrays;


//Main.main();
public class Main {

	public static void main(String[] args) {

		Student[] students = new Student[5];
		System.out.println(Arrays.toString(students));

		for (int i = 0; i < students.length; i++) {
			students[i] = new Student("Jane", new Date(1999, 11, 12));
		}

//		Student s1 = new Student("ID", "Jane", new Date(1999, 11, 12));
//		System.out.println(s1);
//		System.out.println(s1.name);
//		System.out.println(s1.getId());

		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);

		}

		students[3].counter = 9999;

		System.out.println(students[3].counter);
		System.out.println(students[0].counter);

		System.out.println(Student.counter);// correct way of accessing static elements is via their class name

//		Student.test();
	}
	
	
}
