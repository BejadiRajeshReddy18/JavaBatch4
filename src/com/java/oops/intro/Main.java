package com.java.oops.intro;

public class Main {

	public static void main(String[] args) {

		int i;
		Car mazda = new Car();// new is a keyword to create new objects
		Car kushaq = new Car();// all the objects are independet of each other

//		Car kushaq ==> kushaq ia reference variable
		new Car();

//		Car = 3
//		Ref Variable
		// Every objects you create will be residing in HEAP area

		System.out.println(mazda.mileage);
		System.out.println(mazda.color);
		System.out.println(mazda.isManual);
		System.out.println(mazda.model);
		System.out.println(mazda.speed);

		mazda.mileage = 20;
		System.out.println(mazda.mileage);

		mazda.riding();
		mazda = null;

//		DSA
//		Design Pattens
		System.out.println(mazda);// null
		System.out.println(kushaq);// com.java.oops.intro.Car@182decdb
		System.out.println(kushaq.hashCode());// hashCodce is available for every objects

		System.out.println(kushaq.mileage);
	}

}

class Van {
	public static void main(String[] args) {
		System.out.println("VAN");
	}

}
