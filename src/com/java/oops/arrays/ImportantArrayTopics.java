package com.java.oops.arrays;

import java.util.Arrays;

public class ImportantArrayTopics {

	public static void main(String[] args) {

//		call(10);

		int[] arr = { 34, 65, 23, 65, 456, 9 };// 6

//		int[] arr2 = new int[arr.length];
//		
//		for (int i = 0; i < arr2.length; i++) {//cloning
//			arr2[i] = arr[i];
//		}

		int[] arr2 = arr.clone();// clones only 1D array

		System.out.println(arr2);
		change(arr2);

		System.out.println(Arrays.toString(arr));// [34, 65, 23, 65, 456, -1]

	}

	static int call(int i) {// infinite recursion, merge sort, tree DS, graph, DP
		if (i == 0)
			return 0;

		System.out.println(i);
		return call(i - 1);
	}

	static void change(int[] x) {// pass by ref
		System.out.println(x);
		x[x.length - 1] = -1;

		System.out.println(Arrays.toString(x));// [34, 65, 23, 65, 456, -1]
	}
}
