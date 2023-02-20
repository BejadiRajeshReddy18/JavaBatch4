package com.java.oops.io;

import java.io.File;
import java.io.IOException;

public class FileHandling {
	
	public static void main(String[] args) {
		String path = "/JavaBatch4/notes/notes1.txt";
		String absolutePath ="C:/Users/suman/eclipse-workspace/JavaBatch4/notes/io.txt";
		File file = new File(absolutePath);
		
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(file.exists());
		
		if(file.exists()) {
			System.out.println(file.getName());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.canRead());
			System.out.println(file.canWrite());
			System.out.println(file.getParent());
			
		}
		
		boolean delete = file.delete();
		System.out.println(delete);
	}

}
