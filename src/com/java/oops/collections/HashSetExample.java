package com.java.oops.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {

//		i/p ==> hash fn ==> o/p[index] = it takes too much space

		int[] arr = { 43, 342, 42, 2345, 234, 434 };
		HashSet<Integer> hashSet = new HashSet<Integer>(800, 0.75f);// 640 = 1600
		
		// No Duplicates
		// Searching is very fast

		// Insertion Order is not maintained
		// Index access is not allowed
		hashSet.add(6);
		hashSet.add(234);
		hashSet.add(234);
		hashSet.add(3);
		hashSet.add(32);
		hashSet.add(-88);
		hashSet.add(-848);
		hashSet.add(-8328);
		hashSet.add(-8238);
		System.out.println(hashSet);

		System.out.println(hashSet.contains(-88));
		for (Integer integer : hashSet) {
			System.out.println(integer);
		}

		Iterator<Integer> iterator = hashSet.iterator();

	}

}
