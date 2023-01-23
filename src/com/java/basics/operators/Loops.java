package com.java.basics.operators;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x;
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);/// 10

//		FOR LOOP
		System.out.println("FOR loop");
		for (int i = 1; i <= 10; i += 1) {// initailisation;condition;updation
//			int x;
			System.out.print(i + " ");
		}
		System.out.println();

//		Fibonacci Series
//		 0 1 1 2 3 5 8 13 .

		System.out.println("While loop");
//		While Loop
		int i = 1;
		while (i <= 10) {
			if (i % 2 != 0) {
				i++;
				continue;
//				break;
			}
			System.out.print(i + " ");
			i++;
		}

		System.out.println("\ni" + i);// 11
		System.out.println("Do While loop");
//		Do While
		do {
			System.out.print(i + " ");
//			i--;
		} while (i <= 10);// will atleast run for one time no matter what

//		for each

	}

}
//STrings
//Arrays