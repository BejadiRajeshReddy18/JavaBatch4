package com.java.oops.arrays.two_d_array;

import java.util.Arrays;

public class AdditonOfTwoMatrices {// sub, mutliplication, determinant, transpose, spiral printing

	public static void main(String[] args) {

		int[][] matrixA = { { 3, 7, 8 }, { 8, 3, 23 }, { 4, 65, 75 }, { 4, 54, 65 } };// 4*3
		int[][] matrixB = { { 6, 7, 8 }, { 8, 44, 243 }, { 3, 45, 345 }, { 44, 3454, 4365 } };// 4*3
//		int[][] matrixB = { { 6, 7, 8 }, { 8, 44, 243 }, { 3, 45, 345 } };// 3*3

		additionOfTwoMatrices(matrixA, matrixB);

	}

	// Assumption that the matrix are regular
	private static void additionOfTwoMatrices(int[][] matrixA, int[][] matrixB) {

		if (matrixA.length != matrixB.length
				|| matrixA[matrixA.length - 1].length != matrixB[matrixB.length - 1].length) {
			System.out.println("Not eligible for addition");
			return;
		}

		int[][] result = new int[matrixA.length][matrixA[matrixA.length - 1].length];

		for (int i = 0; i < result.length; i++) {// will traverse via rows or individual 1d array
			for (int j = 0; j < result[result.length - 1].length; j++) {// will traverse within the 1d arrays
				result[i][j] = matrixA[i][j] + matrixB[i][j];
			}
		}

		for (int i = 0; i < result.length; i++) {
			System.out.println(Arrays.toString(result[i]));
		}

//		MERN
	}

}
