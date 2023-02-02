package com.java.oops.arrays.two_d_array;

public class CloneATwoDArray {

	public static void main(String[] args) {

//		coding bat
		//Oracle, Apple, MMT, Google
		int[] arr = { 43, 45, 34, 24, 53, 34, 8 };

		int[] cloneOfArr = arr.clone();// this is only possible for 1D arrays

		int[][] jagged2Darray = { { 3, 5, 6 }, { 3 }, { 54, 65, 354, 65 }, { 34, 34 } };

		int[][] cloneOf2Darray = jagged2Darray.clone();//

		cloneOf2Darray[0][0] = -1;
		
		System.out.println(jagged2Darray[0][0]);
		
		int[][] trueCloneOf2Darray =new int[jagged2Darray.length][];
		
		for (int i = 0; i < trueCloneOf2Darray.length; i++) {
			trueCloneOf2Darray[i]= jagged2Darray[i].clone();
		}

	}

}
