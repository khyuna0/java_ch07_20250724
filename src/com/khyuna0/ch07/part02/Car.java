package com.khyuna0.ch07.part02;

public class Car { 
	
	//필드
	String carName;
	int maxSpeed;
	int year;
	int carPrice;
	
//	Tire frontTire = new KumhoTire(); //앞바퀴->금호타이어
//	Tire rearTire = new HankookTire(); //뒤바퀴->한국타이어
	
	Tire frontTire; //앞 바퀴
	Tire rearTire; //뒤 바퀴
	
	//매개변수에 인수로 금호타이어 객체가 들어오면->금호, 한국타이어 객체가 들어오면->한국 식으로 출력하는 메소드
	public void tirePrint(Tire tire) { 
		//타이어의 이름을 출력
		tire.tireName();
		
	}
}