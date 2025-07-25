package com.khyuna0.ch07.part02;

public class Car {
	
	// 필드
	String carName;
	int maxSpeed;
	int year;
	int carPrice;
	
//	Tire frontTire = new KumhoTire(); // 앞 -> 금호
//	Tire rearTire  = new HankookTire(); // 뒤 -> 한국

	Tire frontTire;
	Tire rearTire;
	
	// 매개변수의 인수로 금호타이어 객체가 들어오면 "금호" , 한국타이어 객체가 들어오면 "한국" 출력하는 메소드
	
	public void tirePrint(Tire tire) {  
		// 타이어의 이름 출력
		tire.tireName();
	}
	
	
	
}
