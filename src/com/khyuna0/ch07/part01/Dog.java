package com.khyuna0.ch07.part01;

public class Dog extends Animal {
	
	String dogTail;
	
	public Dog() {
		super(); // 부모 클래스의 생성자 호출 super class -> 부모
		// TODO Auto-generated constructor stub
	}	
	
	
	public Dog(String dogTail) {
		super();
		this.dogTail = dogTail;
	}

	public Dog(String name, int age) {
		super(name , age); // 형식이 같은 부모 생성자 호출 -> "멍멍" , 5를 가진 객체 생성
	}

	public void dogRun() {
		System.out.println("강아지 달리기");
	}
	
}
