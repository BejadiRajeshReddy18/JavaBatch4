package com.java.basics.operators;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		// Menu Driven Programs

//		K:V
		// 1 ==> water
		// 2 ==> cocacola
		// 3 ==> real juice

		Scanner sc = new Scanner(System.in);// Scanner Object

		// break continue --> can be use in any loops | break is also used ins witch
		// cases

		
		int input;
		menu: while (true) {
			System.out.println("MENU ==> \n1 : Water \n2: CocaCola\n3:Real Juice \n0: To Exit	");
			System.out.println("Enter your option");
			input = sc.nextInt();
			switch (input) {
			case 1: {
				System.out.println("Heres a glass of water");
				break;
			}
			case 2: {
				System.out.println("Enjoy your Coke");
				break;
			}
			case 3: {
				System.out.println("Enjoy your Real juice");
				break;
			}
			case 0: {
				System.out.println("Thanks USER");
//				System.exit(89);
				sc.close();
				break menu;
			}
			default:
				System.out.println("Invaldi Option");
				break;
			}
		}

	}

}

//Find a leap Year
//Find Armstrong Numbers
