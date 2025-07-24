package com.khyuna0.ch07.part01_Exer;

public class Circle extends Shape {

	static final double PI = 3.14;
	double r;
	
	public double area() {
		double circleArea = r * r * PI; 
		return circleArea;
	}
	
}
