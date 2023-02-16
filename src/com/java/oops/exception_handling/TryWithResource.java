package com.java.oops.exception_handling;

import java.util.Scanner;

public class TryWithResource {

	public static void main(String[] args) {// DEH

		try (Scanner scanner = new Scanner(System.in);) {// try with resource can be used for AutoClosseable resource
			call();
			System.out.println(args[0]);// Index Out Of Bounds
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void call() throws InterruptedException {
		for (int i = 0; i < 10; i++) {
//strictfp
			System.out.println(0.1 + 0.1 + 0.1);
			Thread.sleep(500);
			System.out.println(0 / 0);

		}

	}

}
