package com.java.oops.io.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MainSerialization {

	public static void main(String[] args) throws IOException {
		
		Student sandeep = new Student(3, "Sandeep", 40);
		String absolutePath = "C:/Users/suman/eclipse-workspace/JavaBatch4/notes/io.txt";

		FileOutputStream fop = new FileOutputStream(absolutePath);

		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fop);

		objectOutputStream.writeObject(sandeep);
		objectOutputStream.flush();//IMPORTANT
		
		//OPTIONAL
		objectOutputStream.close();
		fop.close();
		

	}
}
