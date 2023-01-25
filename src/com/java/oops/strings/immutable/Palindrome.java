package com.java.oops.strings.immutable;

//java.lang is imported by default
import java.util.Scanner;//ctrl + shift +O [Eclipse]

public class Palindrome {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string for Palindrome check");
		String input = scanner.nextLine();

//		"MADAM" "MADAM"
//		"RADAR"
//		"DEAR" "RAED"

		String x = "";
		System.out.println(x.length());// 0

		for (int i = input.length() - 1; i >= 0; i--) {
			x = x + input.charAt(i);
		}

		System.out.println(x);
		System.out.println(x.equals(input));

	}

}

//class String {
//
//}
