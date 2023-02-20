package com.java.oops.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingASImpleFile {

	public static void main(String[] args) {
		String path = "C:\\Users\\suman\\eclipse-workspace\\JavaBatch4\\notes\\notes1.txt";
		File file = new File(path);
		try (Scanner sc = new Scanner(System.in)) {
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}

		try (Scanner scan = new Scanner(System.in)) {//5th try combo

		}
	}

}
