package com.java.oops.abstraction.interfaces.special;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {

		DulLake dulLake = new DulLake();// 1
		dulLake.swim();

		Lake lake2 = new Lake() {// 2 Anonymous inner classes

			@Override
			public void swim() {
				System.out.println("Swim carefully in the lake");

			}
		};

		lake2.swim();

		Lake lake3 = () -> {// 3 lambda expression only works on functional interfaces
			System.out.println("Swimimg in the lake full of crocdiles");
		};

		lake3.swim();

		// MARKER Interface
		Student s1 = new Student("John", 89, new Email("john@gmail.com", "1234"));
//		Student s3 = new Student("John", 89, new Email("john@gmail.com", "1234"));
		System.out.println(s1.hashCode());

		Object clone = s1.clone();
		// Mutating on 1st object

		s1.name = "Joker";
		s1.email.emailId = "joker@gmail.com";

		Student s2 = (Student) clone;// down casting
		System.out.println(s2);
		System.out.println(s2.hashCode());
		System.out.println(s1);

	}

}
