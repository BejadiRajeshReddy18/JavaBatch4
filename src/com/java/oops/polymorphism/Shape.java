package com.java.oops.polymorphism;

public class Shape {

	void areaOfSquare(int side) {
		System.out.println("AREA of sqr with side = " + side + " is ==> " + (side * side));
	}

	void areaOfTriangle(int base, int height) {
		System.out.println("AREA of triangle with = " + (0.5 * base * height));
	}

	void areaOfCircle(float radius) {
		System.out.println("AREA of circle with radius = " + radius + " is ==> " + (Math.PI * radius * radius));
	}

}


class PolymorphicShape {

	//shape method is overloaded 4 times - Method Overloading
	void shape(int side) {
		System.out.println("AREA of sqr with side = " + side + " is ==> " + (side * side));
	}

	void shape(float base, int height) {
		System.out.println("AREA of triangle with = " + (0.5 * base * height));
	}

	void shape(float radius) {
		System.out.println("AREA of circle with radius = " + radius + " is ==> " + (Math.PI * radius * radius));
	}
	
	
	void shape( int height, float base) {
		System.out.println("AREA of parallelogram with = " + ( base * height));
	}
	
	
//no of paramter
// parameter type
// parameter postion
	
	
	//return mtypoe will not matter

}
