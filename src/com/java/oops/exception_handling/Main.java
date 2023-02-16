package com.java.oops.exception_handling;

public class Main {

	public static void main(String[] args) {

		System.out.println("START");
		int[] arr = { 53, 456, 4565, 53, 345, 8 };
//		System.out.println(arr[8 / 0]);// Index Out Of Bounds
		try {
//			System.out.println(arr[8 / 0]);// Index Out Of Bounds
			call();
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
			e.printStackTrace();
//			try {
//				call();
//			} catch (Throwable th) {
//				th.printStackTrace();
//			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
		catch (Throwable e) {
			System.out.println("CAUGHTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT");
			e.printStackTrace();//errors are caught
		}

		for (int i = 0; i < 10; i++) {
			try {
				System.out.println(i);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("END");

//		call();
	}

	private static void call() {
		call();

	}

}
