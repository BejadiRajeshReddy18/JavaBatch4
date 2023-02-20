package com.java.oops.io.serialization.multithreading;

public class VisiblityProblem {

	volatile static boolean flag = true;

	public static void main(String[] args) {

		System.out.println("START ==> " + Thread.currentThread().getState());
		Thread t1 = new Thread(() -> {

			while (flag) {
//					Thread.sleep(500);
					System.out.println("STOP me if you can");
			}

		});

		Thread t2 = new Thread(() -> {
			flag = false;
		});

		t1.start();
		t2.start();

		System.out.println("END ==> " + Thread.currentThread().getState());

	}

}
