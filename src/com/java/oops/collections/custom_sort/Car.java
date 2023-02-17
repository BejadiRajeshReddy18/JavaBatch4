package com.java.oops.collections.custom_sort;

public class Car implements Comparable<Car> {

	String model;
	int number;

	@Override
	public String toString() {
		return "Car [model=" + model + ", number=" + number + "]";
	}

	public Car(String model, int number) {
		super();
		this.model = model;
		this.number = number;
	}

	@Override
	public int compareTo(Car c) {
		if (c.number == this.number)
			return 0;
		else if (c.number > this.number)
			return -1;
		else
			return 1;
	}

}
