package com.java.oops.arrays.two_d_array;

import java.util.Arrays;

import com.java.oops.intro.Car;

public class Question {

	public static void main(String[] args) {

		int[] arr = new int[8];// int 0
		String[] arr1 = new String[8];// Strings
		Car[] arr2 = new Car[8];// Cars
		Object[] arr3 = new Object[8];// Object arrays can store anything ==> Inheritance
		arr3[0] = 9;
		arr3[1] = new Car();

		System.out.println(Arrays.toString(arr3));
	}

}
