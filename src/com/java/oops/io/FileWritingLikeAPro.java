package com.java.oops.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWritingLikeAPro {

	public static void main(String[] args) {

		String absolutePath = "C:/Users/suman/eclipse-workspace/JavaBatch4/notes/io.txt";
		String msg ="Last day of Java";
		try (FileOutputStream fop = new FileOutputStream(absolutePath)) {
			fop.write(msg.getBytes());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		

	}

}
