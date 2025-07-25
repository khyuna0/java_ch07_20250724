package com.khyuna0.ch07.part03;

public class Circle extends Shape{
	
	private int radius;
	public static final double PI=3.141592;
	
	
	
	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Circle(int radius) {
		super();
		this.radius = radius;
	}



	public int getRadius() {
		return radius;
	}



	public void setRadius(int radius) {
		this.radius = radius;
	}



	@Override
	public double getArea() { //원의 면적 출력으로 오버라이딩
		// TODO Auto-generated method stub
		return radius * radius * PI;
	}



	@Override
	public void getColor(String color) {
		System.out.println("원 색깔:"+color);
		
	}

}
