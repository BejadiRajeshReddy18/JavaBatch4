package com.java.oops.strings.immutable;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {

		String x = "1";

		if (x.length() == 0) {
			System.out.println("true");
		}
		
		

		
	
		System.out.println(x.isEmpty());
		x = "AvataR";
		System.out.println(x.length());
		System.out.println(x.charAt(5));
		System.out.println(x.charAt(0));
		System.out.println(x.charAt(x.length() - 1));

		x = x + "- The way of water";// + concatination means joinin
//		+ = Maths Addition
//		+ = String contination

//		+ is a overloaded operator
		x = x.concat(" Nice movie");
		System.out.println(x);// AvataR- The way of water Nice movie

		int indexOf = x.indexOf('v');
		System.out.println(indexOf);
		x = x.toUpperCase();
		String[] split = x.split(" ");
		System.out.println(Arrays.toString(split));
		System.gc();// invoking GC manualy

	}
//Mutable Strings
}
