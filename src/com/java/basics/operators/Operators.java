package com.java.basics.operators;

public class Operators {

	public static void main(String[] args) {

		int x = 9;// assignment operator

//		Pre and Post Increment and Decrement Operators
		x = x + 1;
		x += 1;// shorthand notation
		x = 10;
//		++x;//pre increment
//		x++;// post increment

//		x--
//		--x;

//		System.out.println(x++);
		System.out.println(++x);
		System.out.println(x);

		x = 100;

//		x = 502
		x = ++x + --x + x++ + --x - ++x + x++ + --x;// 101 + 100 + 100 + 100 - 101 + 101 + 101
		// 101 + 100 + 100 + 100 + 101 //502

		System.out.println(x);// 704 //404 //301 //597 //499 * 2 //499 //501* 4 //101 * 3 //502

//		Shorthand Notation
//		x = x * 7;
//		x -= 7;

//		Comparison Operators
		boolean result = x == 502;
		System.out.println(result);

//		if (!(x == 502)) {
		if (x < 1 && returnBool()) {
			System.out.println("INSIDE IF");
		} else {
			System.out.println("INSIDE ELSE");
		}

//		Logical Operators
//		&& (Logical AND )   ||(Logical OR)

//		Bit Wise Operators
		System.out.println(7 | 8);// 15 | bitwise OR
		System.out.println(7 & 8);// bitwise AND
		System.out.println(9 ^ 8);// bitwise XOR
		System.out.println(~8);// bitwise NOT , Negation Opertator

		int y = 8;
		y = y << 3;// 8 * 2*2 *2 = 64
		y = y >> 1;

		System.out.println(y);

	}

	static boolean returnBool() {
		System.exit(0);
		return false;
	}

}

//Fira Code, Jet Brains MONO, Source Code Pro -> Lignaturing
