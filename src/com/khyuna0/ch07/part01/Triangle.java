package com.khyuna0.ch07.part01;

public class Triangle extends Shape {

	@Override // 오버라이딩 명시
	public double area() { 
		double area = width * height * 0.5;
		return area;
	}
	
	// 메소드 오버라이딩 -> 메소드 재정의하기
	// 부모의 메소드와 동일한 타입, 메소드 이름, 매개변수 목록 필수
	
//	public double area() {
//		double area = width * height * 0.5;
//		return area;
//	}
	
	// super.area(); 부모 메소드 호출하기 형식 : super.부모메소드이름();
	
	
	
	
}
