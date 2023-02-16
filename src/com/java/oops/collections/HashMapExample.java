package com.java.oops.collections;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {

		HashMap<Integer, String> hashMapOfStudents = new HashMap<>(30, 0.8f);
		hashMapOfStudents.put(1, "John");
		hashMapOfStudents.put(6, "Jane");
		hashMapOfStudents.put(6, "Mary");
		hashMapOfStudents.put(9, "Bill");
		hashMapOfStudents.put(0, "Tom");// [key:value] --> entry [key cannot be duplcate key should be immutable
		hashMapOfStudents.put(20, "Tom");
		hashMapOfStudents.put(40, "Tom");
		hashMapOfStudents.put(70, "Tom");

		System.out.println(hashMapOfStudents.size());
		System.out.println(hashMapOfStudents);
		System.out.println(hashMapOfStudents.containsKey(9));
		System.out.println(hashMapOfStudents.containsValue("Jane"));
		System.out.println(hashMapOfStudents.isEmpty());
		System.out.println(hashMapOfStudents.remove(0));
		System.out.println(hashMapOfStudents);

		for (Entry<Integer, String> student : hashMapOfStudents.entrySet()) {
			System.out.println(student);

		}

		Set<Integer> keySet = hashMapOfStudents.keySet();
		System.out.println(keySet);

	}

}
