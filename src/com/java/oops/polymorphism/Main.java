package com.java.oops.polymorphism;

public class Main {

	public static void main(String[] args) {
		
		float x = 6.7f;
		Shape shape = new Shape();
		shape.areaOfCircle(7.0f);
		shape.areaOfSquare(7);
		
		PolymorphicShape polymorphicShape = new PolymorphicShape();
		polymorphicShape.shape(7);
		polymorphicShape.shape(7.0f,14);
		polymorphicShape.shape(14,7.0f);
		
		System.out.println();
	}
}
