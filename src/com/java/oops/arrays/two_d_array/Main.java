package com.java.oops.arrays.two_d_array;

import java.util.Arrays;

class Main {

	// The control flow will only start from ==> public static void main(String[]
	// suman)
	public static void main(String... suman) {// args is a dynamic array whichj is used to pass the agruments dusringg
												// runtiime
		System.out.print("Hello, Java was so easy");
		System.out.print("\n" + suman.length);

		int i = 0;

		if (suman.length > 0) {
			System.out.print("\n" + suman[i]);
			int parseInt = Integer.parseInt(suman[i]);
			System.out.println(parseInt * parseInt);

		}

		Integer[] arr = new Integer[3];
		main(1, 3);

	}

	public static void main(Integer... suman) {// ... ==> var agrs
		System.out.println("MAIn 2");
		System.out.println(Arrays.toString(suman));
	}

}
