package com.java.oops.strings.mutable;

public class MutableStringsExample {

	public static void main(String[] args) {

		String name = "Parrot";// immutable
		name = "Crow";
		name += "Black";

		// Mutable Strings
//		1. Using String Builder
		StringBuilder sbl = new StringBuilder("Sparrow");
//		sbl += "golden";
		sbl.append(" is a beautiful bird.");

		System.out.println(sbl);
		sbl.reverse();
		System.out.println(sbl);
		String substring = sbl.substring(0, 4);// 0 - 3
		System.out.println(substring);
		System.out.println(sbl);

		StringBuilder moon1 = new StringBuilder("Moon");
		String moon2 = "moon";
		String moon3 = new String("moon");// Immutable Strings ====> equals() works fine

//		1kg of Rice or 1Gb of data
//		Rabbit or phone

		String moonString = moon1.toString();
		if (moon1.toString().equalsIgnoreCase(moon3))
			System.out.println(true);
		else
			System.out.println(false);

	}

}
