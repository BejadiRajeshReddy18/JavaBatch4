package com.java.oops.collections.streaming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.java.oops.collections.custom_sort.Bike;

public class Main {
	public static void main(String[] args) {

		ArrayList<Bike> arrayListOfBikes = new ArrayList<>();
		arrayListOfBikes.add(new Bike(7843, "Apache"));
		arrayListOfBikes.add(new Bike(4348, "R1"));
		arrayListOfBikes.add(new Bike(8642, "Panigale"));
		arrayListOfBikes.add(new Bike(9243, "Aprillia"));
		arrayListOfBikes.add(new Bike(7840, "Yamaha"));
		arrayListOfBikes.add(new Bike(4343, "CBR"));

//		 I want all the bikes with wvenb numnber plates in a seperate arraylist
//		1
		ArrayList<Bike> arrayListOfBikesWithEvenNumbers = new ArrayList<>();

		for (Bike bike : arrayListOfBikes) {
			if (bike.numberPlate % 2 == 0)
				arrayListOfBikesWithEvenNumbers.add(bike);
		}
		System.out.println(arrayListOfBikesWithEvenNumbers);

//		2
		List<Bike> collect = arrayListOfBikes.stream().filter(b -> b.numberPlate % 2 == 0).collect(Collectors.toList());
		List<Bike> collect2 = arrayListOfBikes.stream().filter(b -> b.brand.startsWith("A"))
				.collect(Collectors.toList());

		List<Integer> asListNumbers = Arrays.asList(43, 54, 65, 5, 34, 43, 5, 99);
		Set<Integer> collectAsCubbes = asListNumbers.stream().map(e -> e * e * e).collect(Collectors.toSet());
		System.out.println(collect2);
		System.out.println(collectAsCubbes);
	}
}
