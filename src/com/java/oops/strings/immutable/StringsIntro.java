package com.java.oops.strings.immutable;

public class StringsIntro {

	public static void main(String[] args) {

		
		//String in itself is immutable
		// String are Java Objects used to store sequence ofd Characters

		// 1st Using String Literal
		String a = "Sita Raman";
		String b = "Sita Raman";
		String b2 = "Sita RamaN";

		if (a == b) {//a and b are object refrences | == is use to compare object address
			System.out.println("EQUAL");
		} else {
			System.out.println("UN-EQUAL");
		}

		if(a.equals(b)) {
			System.out.println("a&b EQUAL");
		}
		// Using new Keyword
		String c = new String("Sita Raman");
		String d = new String("Sita Raman");

		if (c == d) {
			System.out.println("EQUAL");
		} else {
			System.out.println("UN-EQUAL");
		}
		
		if(c.equals(d)) {
			System.out.println("c&d EQUAL");
		}
		
		
		if(c.equalsIgnoreCase(b2)) {
			System.out.println("c&d EQUAL case insensitive");
		}
		
		
		

	}

}
