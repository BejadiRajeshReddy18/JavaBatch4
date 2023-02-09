package com.java.oops.inheritance;

public class Player{

	int test = 10;
	String name;
	int jerseyNo;
	int age;
	int matchesPlayed;
	private float secret = 908.99f;//private entities cannot be inherited

	private void sayMyAge() {
		System.out.println("AGE ==> " + this.age);
	}

	public Player(String name, int jerseyNo, int age, int matchesPlayed) {
		super();//super method is used to call the parent constructor
		this.name = name;
		this.jerseyNo = jerseyNo;
		this.age = age;
		this.matchesPlayed = matchesPlayed;
	}
	
	void test(){
		System.out.println("Test from Player");
		System.out.println(test);
		System.out.println(this.test);
		//Parent cannot accsess child things
		//through super you acn only access immediate PARENT only
	}

}
