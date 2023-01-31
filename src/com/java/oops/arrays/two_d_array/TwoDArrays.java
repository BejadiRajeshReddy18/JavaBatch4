package com.java.oops.arrays.two_d_array;

import java.util.Arrays;

public class TwoDArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = new int[8][4];

//		System.out.println(Arrays.toString(arr));

		arr[5][3]=-1;
		for (int i = 0; i < arr.length; i++) {// arr.length will give you the rows no = 8 = 8 1D array
			for (int j = 0; j < arr[j].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
