package com.khyuna0.ch07.part01;

public class ch07Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle = new Rectangle();
		rectangle.height = 10;
		rectangle.width = 10;
		rectangle.recArea = 50.5;

	
	Dog dog1 = new Dog();
	Dog dog2 = new Dog("작은꼬리");
	Dog dog3 = new Dog("멍멍", 5);
	
	Student student = new Student("홍길동", 3 , 15); 
	System.out.println(student.name);
	
	}
}
