package com.khyuna0.ch07.part03;

public abstract class Shape {
	
	String shapeName;
	
	public abstract double getArea(); //추상 메소드 -> 메소드의 선언부만 존재하는 메소드
	
	public abstract void getColor(String color); //추상 메소드
}
