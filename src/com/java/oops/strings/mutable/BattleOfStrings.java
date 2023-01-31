package com.java.oops.strings.mutable;

public class BattleOfStrings {

	public static void main(String[] args) {

		String x = "Woo";

		//1 
		int times = 10000;

		long start = System.nanoTime();
		for (int i = 0; i < times; i++) {//10000
			x += " Hoo";
		}
		long end = System.nanoTime();

		System.out.println("Time diff for String Immutable " + (end - start));

		
		//2
		StringBuilder sb = new StringBuilder("Woo");//1

		start = System.nanoTime();
		for (int i = 0; i < times; i++) {
			sb.append(" Hoo");
		}
		end = System.nanoTime();
		System.out.println("Time diff for String Mutable " + (end - start));
		
		
		

	}

}
