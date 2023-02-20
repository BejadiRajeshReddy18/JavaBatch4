package com.java.oops.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadinAFileLikeAPro {

	public static void main(String[] args) {
		char x = 'a';
		int x_ = x;
		System.out.println(x_);
		String path = "C:\\Users\\suman\\eclipse-workspace\\JavaBatch4\\notes\\notes1.txt";

		try (FileInputStream fileInputStream = new FileInputStream(path)) {
			int read;
			while ((read = fileInputStream.read()) != -1) {
				System.out.print((char) read);

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
