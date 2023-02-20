package com.java.oops.io.serialization.multithreading;

public class JoinMethod {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("START");

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 20; i++) {
				try {
					Thread.sleep(100);
					System.out.println(i + " ===> " + Thread.currentThread());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});

		t1.setName("t1");
		t1.start();
		t1.join();

		System.out.println("END");

	}

}
