package com.khyuna0.ch07.part01;

public class ch07Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle = new Rectangle();
		rectangle.height = 10;
		rectangle.width = 10;
		rectangle.recArea = 50.5;
		
		
	System.out.println("===================");
		
	Dog dog1 = new Dog();
	Dog dog2 = new Dog("작은꼬리");
	Dog dog3 = new Dog("멍멍", 5);
	
	System.out.println("===================");
	
	Student student = new Student("홍길동", 3 , 15); 
	System.out.println(student.name);
	
	System.out.println("===================");
	
	Triangle triangle = new Triangle();
	triangle.width = 10;
	triangle.height = 5;
	triangle.color = "red";
	
	//삼각형의 면적
	System.out.println(triangle.area());
	
	System.out.println("===================");
	
	
	// 상속 -> 일관성, 통일성, 메모리 절약...
	// 메소드 오버라이딩이 불필요한경우 자식 클래스에 안 써도 가능
	
	
	}
}
