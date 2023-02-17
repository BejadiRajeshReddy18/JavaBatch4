package com.java.oops.collections.custom_sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {

		ArrayList<Bike> arrayListOfBikes = new ArrayList<>();
		arrayListOfBikes.add(new Bike(7843, "Apache"));
		arrayListOfBikes.add(new Bike(4343, "R1"));
		arrayListOfBikes.add(new Bike(8643, "Panigale"));
		arrayListOfBikes.add(new Bike(9243, "Aprillia"));
		arrayListOfBikes.add(new Bike(7843, "Yamaha"));
		arrayListOfBikes.add(new Bike(4343, "CBR"));

		// Bike numberPlate, Descending

		arrayListOfBikes.stream().forEach(System.out::println);

		Collections.sort(arrayListOfBikes, new NumberPlateSorter());
//		Collections.sort(arrayListOfBikes, new BikeNameSorter());

		System.out.println("AFTER SORTING");

		arrayListOfBikes.stream().forEach(System.out::println);

		ArrayList<Car> arrayListOfCars = new ArrayList<>();
		arrayListOfCars.add(new Car("Maruti Jimny", 6758));
		arrayListOfCars.add(new Car("Maruti Jimny", 6758));
		arrayListOfCars.add(new Car("Thar", 6858));
		arrayListOfCars.add(new Car("Kushaq", 6988));
		arrayListOfCars.add(new Car("Harriew", 6756));
		arrayListOfCars.add(new Car("Lamborghini", 6758));
		arrayListOfCars.add(new Car("Mc Laren", 6758));

		System.out.println("BEFORE SORTING CARS");

		arrayListOfCars.stream().forEach(System.out::println);
		Collections.sort(arrayListOfCars);
		System.out.println("AFTER SORTING CARS");

		arrayListOfCars.stream().forEach(System.out::println);// double colon operator

	}

}

class NumberPlateSorter implements Comparator<Bike> {

	@Override
	public int compare(Bike b1, Bike b2) {
		if (b1.numberPlate == b2.numberPlate)
			return 0;
		else if (b1.numberPlate > b2.numberPlate)
			return 1;
		else
			return -1;

	}

}

class BikeNameSorter implements Comparator<Bike> {

	@Override
	public int compare(Bike b1, Bike b2) {// Dictiopnary
		return b1.brand.compareTo(b2.brand);
	}

}
