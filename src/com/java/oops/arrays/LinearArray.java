package com.java.oops.arrays;

import java.util.Scanner;

public class LinearArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num");
		int num = sc.nextInt();

		
		
		int x, y = 9, z, w[];

//		int num = 10;
		int[] squareOfIndices = new int[num];// 10 [0-9]

		num = 1000;
		
		int length = squareOfIndices.length;
		System.out.println("Len ==> "+length);
		for (int i = 0; i < squareOfIndices.length; i++) {
			System.out.print(" " + squareOfIndices[i]);
		}
		
		System.out.println();
		num = 100;

		for (int i = 0; i < squareOfIndices.length; i++) {//Squaring and String
			squareOfIndices[i] = i * i;
		}

		for (int i = 0; i < squareOfIndices.length; i++) {//Printing
			System.out.print(" " + squareOfIndices[i]);
		}

	}

}
