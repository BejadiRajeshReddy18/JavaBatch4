package com.java.oops.strings.immutable;

import java.util.Scanner;

public class PalindromOneLiner {

	public static void main(String[] args) {

		String input = new Scanner(System.in).next();// used to take a single input without any space
//		nextLine() is used to take String input with a String havong spaces
		System.out.println(input);
		System.out.println(new StringBuilder(input).reverse().toString().equals(input));
	}

}

//20 4 understood = 16

//M : P1
