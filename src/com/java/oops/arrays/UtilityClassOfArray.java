package com.java.oops.arrays;

import java.util.Arrays;

public class UtilityClassOfArray {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 2423, 73, 42, 424, 5 };
		System.out.println(nums.length);

		System.out.println(nums);// hashCode
		System.out.println(Arrays.toString(nums));// Arrays is a utility class of Array

//		Arrays.fill(nums, -1);
		System.out.println(Arrays.toString(nums));

		Arrays.sort(nums);//buuble sort (optimization), merge sort, insertion sort, quick sort
		System.out.println(Arrays.toString(nums));

		System.out.println();

	}
}
