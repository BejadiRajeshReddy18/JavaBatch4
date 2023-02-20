package com.java.oops.io.serialization.multithreading;

public class Main {

	public static void main(String[] args) {// GO LANG
		System.out.println(Thread.currentThread());

		System.out.println("START");

		// 1 USING THREAD CLASS | Thread is a worker
//		Looper l1 = new Looper();
//		Looper l2 = new Looper();
//		Looper l3 = new Looper();
//		Looper l4 = new Looper();

		// 2 Using RUNNABLE Interface | RUNNABLE Is a work
		Thread l1 = new Thread(new Looper2());
		Thread l2 = new Thread(new Looper2());
		Thread l3 = new Thread(new Looper2());
		Thread l4 = new Thread(new Looper2());
		

		
		
		
		l1.setName("l1");
		l2.setName("l2");
		l3.setName("l3");
		l4.setName("l4");

		
		//DEFAULT Priority is 5 
		l3.setPriority(10);
		l2.setPriority(2);
		System.out.println(l1.getState());
		System.out.println(l2.getState());
		System.out.println(l3.getState());
		System.out.println(l4.getState());

		l1.start();
		l2.start();
		l3.start();
		l4.start();

		System.out.println(l1.getState());
		System.out.println(l2.getState());
		System.out.println(l3.getState());
		System.out.println(l4.getState());
		System.out.println("END");
	}

}

//1
class Looper extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(i + " ===> " + Thread.currentThread());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}

class Looper2 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			try {
				Thread.sleep(100);
				System.out.println(i + " ===> " + Thread.currentThread());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

}