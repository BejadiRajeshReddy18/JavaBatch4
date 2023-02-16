package com.java.oops.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {

		int[] arr = { 43, 342, 42, 2345, 234, 434 };
		System.out.println(Arrays.toString(arr));

		// String and a Integr and Email in a single Array
		Object[] arr2 = { "Java", 76, true };

		// ArrayList
		ArrayList listOfThings = new ArrayList();
		listOfThings.ensureCapacity(30);
		listOfThings.add("Java");
		listOfThings.add(423);
		listOfThings.add(arr);// It is Dynamic

		System.out.println(listOfThings);
//		listOfThings.remove(0);
		System.out.println(listOfThings);
		boolean contains = listOfThings.contains("Java");
		System.out.println(contains);

		ArrayList<Integer> arrayListOfIntegers = new ArrayList<Integer>();// Generics
		arrayListOfIntegers.add(7);
		arrayListOfIntegers.add(45);
		arrayListOfIntegers.add(7);
		arrayListOfIntegers.add(0);
		arrayListOfIntegers.add(-1);
//		arrayListOfIntegers.add(null);

		System.out.println(arrayListOfIntegers);
//		Collections.sort(arrayListOfIntegers);// Collections is an utility class for Collection
//		Collections.shuffle(arrayListOfIntegers);
		arrayListOfIntegers.set(0, 100);// replacement
		System.out.println(arrayListOfIntegers);
		arrayListOfIntegers.add(0, 1000);// addition this is costly operation
		arrayListOfIntegers.add(-8);
		System.out.println(arrayListOfIntegers);
		System.out.println(arrayListOfIntegers.get(arrayListOfIntegers.size() - 1));

		// Iteration
//		for (int i = 0; i < arrayListOfIntegers.size(); i++) {// worst way to iterate over collection - modification is
//																// allowed while iteration
//			arrayListOfIntegers.add(i);
//			System.out.print(arrayListOfIntegers.get(i) + " ~ ");
//		}

		int num = 0;
		// 2. Using For each
		for (Integer element : arrayListOfIntegers) {// java.util.ConcurrentModificationException
//			arrayListOfIntegers.add(num);
			System.out.print(element + " - ");
		}

		// Using iterator
		Iterator<Integer> iterator = arrayListOfIntegers.iterator();// -1

		System.out.println();
//		1000  ~ 100 ~ 45 ~ 7 ~ 0 ~ -1 ~ -8 ~ i
		while (iterator.hasNext()) {
//			arrayListOfIntegers.add(num);
			Integer integer = (Integer) iterator.next();
			System.out.print(integer + " - ");

		}

	}

}
