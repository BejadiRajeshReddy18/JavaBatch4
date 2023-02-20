package com.java.oops.io.serialization.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class SnchronizedVariable {

//	static int x = 1;
	static AtomicInteger at = new AtomicInteger(1);

	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(() -> {
			at.getAndIncrement();
		});

		Thread t2 = new Thread(() -> {
			at.getAndIncrement();
		});

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println(at);
		System.out.println("END");

	}

}
