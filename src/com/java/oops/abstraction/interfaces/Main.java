package com.java.oops.abstraction.interfaces;

public class Main {
	int x;

	public static void main(String[] args) {

		SBIBank sbiBank = new SBIBank();
		sbiBank.checkBalance(86876);
		sbiBank.enquireLoan();

		System.out.println(sbiBank.IFSC);
		System.out.println(sbiBank.name);

//		sbiBank.name = "";

		System.out.println(SBIBank.IFSC);
		System.out.println(Bank.IFSC);

		Bank sbi2 = new Bank() {

			@Override
			public void enquireLoan() {
				System.out.println("Loan processing");

			}

			@Override
			public long checkBalance(int id) {
				System.out.println("Balane ==> " + Math.random());
				return 0;
			}
		};

		sbi2.getHolidayList();
		Bank.rbiGuideLines();
	}

}
