package com.java.oops.abstraction;

public class Main {

	public static void main(String[] args) {
//		Bank bank = new Bank();//abtract class cannot be directly instantiated

		Bank db = new DenaBank();

		System.out.println(db.checkBalance(7979));
		db.enquireLoan();
//		db.enquireFD();

		// Create an object for abstratc class also
		Bank bandhanBank = new Bank() {// Annnymous Inner Class

			@Override
			long checkBalance(int ID) {
				System.out.println("BALANCEc ==> " + 78789);
				return 78789;
			}
		};
		
		long balance = bandhanBank.checkBalance(778);
		System.out.println(balance);

	}
}
