package com.java.oops.collections.custom_sort;

public class Bike {

	public int numberPlate;
	public String brand;

	public Bike(int numberPlate, String brand) {
		super();
		this.numberPlate = numberPlate;
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Bike [numberPlate=" + numberPlate + ", brand=" + brand + "]";
	}

}
