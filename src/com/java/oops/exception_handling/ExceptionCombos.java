package com.java.oops.exception_handling;

import java.util.Scanner;

public class ExceptionCombos {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		try {
//			return;
			System.out.println(8 / 0);
//			while(true) {
//				
//			}
//			System.exit(0);

		} catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("END 1");
			scanner.close();
		}

		try {
			System.out.println(8 / 0);
		} finally {// write resource closing code
			System.out.println("END 2");
		}

		System.out.println("END");

	}

}
