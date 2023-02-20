package com.java.oops.io.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MainDesrialzation {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String absolutePath = "C:/Users/suman/eclipse-workspace/JavaBatch4/notes/io.txt";

		FileInputStream fileInputStream = new FileInputStream(absolutePath);
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

		Object readObject = objectInputStream.readObject();
		// Downcasting

		Student s = (Student) readObject;

		System.out.println(s);

	}

}
