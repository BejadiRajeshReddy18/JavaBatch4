package com.java.oops.abstraction.interfaces.special;

public class Student implements Cloneable {

	String name;// Immutable
	int id;
	Email email;// Mutable

	public Student(String name, int id, Email email) {
		super();
		this.name = name;
		this.id = id;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", email=" + email + "]";
	}

//	@Override// Shallow Copy
//	protected Object clone() throws CloneNotSupportedException {// shallow copy
//		return super.clone();
//	}

	@Override // Deep Copy
	protected Object clone() throws CloneNotSupportedException {// deep copy
		Student cloned = (Student) super.clone();
		cloned.email = new Email(email.emailId, email.pwd);
		return cloned;
	}

}

class Email {
	String emailId;
	String pwd;

	public Email(String emailId, String pwd) {
		super();
		this.emailId = emailId;
		this.pwd = pwd;
	}

	public Email() {
		super();
	}

	@Override
	public String toString() {
		return "Email [emailId=" + emailId + ", pwd=" + pwd + "]";
	}

}
