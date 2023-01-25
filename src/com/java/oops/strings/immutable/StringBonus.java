package com.java.oops.strings.immutable;

public class StringBonus {

	public static void main(String[] args) {

		String x = "Java";// SCP
		String y = new String("JS");// HEAP
		
//		y = "JS";
		y = y.intern();
		
		Integer i =  9;
		Integer j = 9;
		if(i==j)
			System.out.println(true);
		
//		equals()
		
				

	}

}


