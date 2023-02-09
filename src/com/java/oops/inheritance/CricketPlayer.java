package com.java.oops.inheritance;

public class CricketPlayer extends Player {// A class can only extend one class
	// So multiple Inheritance in not possible  in Java
	boolean isBatsMan;
	boolean isAllRounder;
	boolean isBowler;
	float strikeRate;
	int test = 90;
	//int test = 10;

	public CricketPlayer(String name, int jerseyNo, int age, int matchesPlayed, boolean isBatsMan, boolean isAllRounder,
			boolean isBowler, float strikeRate) {
		super(name, jerseyNo, age, matchesPlayed);//// super method is used to call the parent constructor
		this.isBatsMan = isBatsMan;
		this.isAllRounder = isAllRounder;
		this.isBowler = isBowler;
		this.strikeRate = strikeRate;
	}

//	public CricketPlayer() {
//		this();
//	}
	
//	void sayMyAge() {//inehrited

	void isAllRounder() {// this is a specialized method
		System.out.println(this.isAllRounder);
		test();// call the current one
		super.test();// call the parent one
//		System.out.println(secret);
	}

	@Override // Annotations
	public String toString() {
		return "CricketPlayer [isBatsMan=" + isBatsMan + ", isAllRounder=" + isAllRounder + ", isBowler=" + isBowler
				+ ", strikeRate=" + strikeRate + ", name=" + name + ", jerseyNo=" + jerseyNo + ", age=" + age
				+ ", matchesPlayed=" + matchesPlayed + "]";
	}
	

	@Override//resolved in Runtime | Runtime Polymorphism
//	Oveloading is resolved in compile time | Compile time Polymorphism
	void test(){
		System.out.println("test(0 from thge Cricket Player");
		System.out.println(test);
		System.out.println(this.test);
		System.out.println(super.test);//through super you acn only access immediate PARENT only
	}

}
