package com.khyuna0.ch07.part03;

public class MainClass {

	public static void main(String[] args) {
		
		// Shape shape = new Shape(); //추상클래스->메모리에 객체를 생성할 수 없다.(인스턴스 생성 x)
		
		Rectangle rectangle = new Rectangle(10, 20); //생성자로 초기화
		System.out.println("사각형의 넓이:" + rectangle.getArea());
		
		Circle circle = new Circle();
		circle.setRadius(10); //반지름 10->setter로 초기화
		System.out.println("원의 넓이:" + circle.getArea());
		
		Shape shape = new Triangle(10, 20); //업캐스팅
		System.out.println("삼각형의 넓이:" + shape.getArea());
		
		Triangle tri;
		tri = (Triangle) shape; //다운캐스팅
		tri.getArea();
		System.out.println("삼각형의 넓이:" + tri.getArea());
	}

}
