package com.java.oops.access_modifiers;

import java.sql.Date;

public class Student {

	private int id;
	String name;
	private Date dob;
	
	
	
	public int getId() {
		return id;
	}


	public Student(int id, String name, Date dob) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dob=" + dob + "]";
	}
	
	

}
