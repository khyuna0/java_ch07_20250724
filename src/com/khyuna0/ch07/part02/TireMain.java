package com.khyuna0.ch07.part02;

public class TireMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tire tire;
		
		String tireName; // 타이어 규격
		int tirePrice; // 타이어 종류
		
		// new 연산자로 번지수 지정
		tire = new KumhoTire(); // 자동 형변환 -> up casting / 부모에 자식이 들어감
		
		// tire.tireCompantKumho -> 자식 필드인 tireCompantKumho는 사용 불가
		
		Tire tire2 = new Tire();
		
		KumhoTire kum;
		kum = (KumhoTire) tire2; // 강제 형변환 -> down casting / 자식에 부모가 들어감
		
		// han.tireName = "스노우 타이어"; 
	}

}
