package com.khyuna0.ch07.part02;

public class chap07_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a; // 8byte
		int b = 10; // 4byte
		a = b; // 자동 형변환	
		b= (int) a; // 강제 형변환
		
//		String c = "100";
//		int d = Integer.parseInt(c); 문자열을 정수로 변환
		
		Person person = new Person();
		Student student = new Student();
		Soldier soldier =new Soldier();
		
		person = student; // 부모 클래스는 항상 자식 클래스를 받을 수 있음
		person = soldier; 
		
		student = (Student) person; // -> 자식 클래스는 부모 클래스를 받을 수 없음 (강제 형변환 필요)
//		soldier = student;  -> 자식 - 자식 형변환 불가 / 참조 번지, 필드 ... 가 다르기 때문 (형변환 불가)
		
		// 쓰는 방법
		
		Person person2 = new Student(); // 부모 -> 자식 인스턴스 만들기
		person2 = new Soldier();
		
		
		System.out.println("=================");
		
		Car mycar = new Car();
		
		mycar.carName = "소나타";
		mycar.year = 2010;
		
		mycar.frontTire = new KumhoTire(); // 객체 타입 
		mycar.rearTire = new HankookTire(); // 값 변경 할 때 객체만 바꿔주면 됨 
		
		HankookTire han = new HankookTire();
		KumhoTire kum = new KumhoTire();
		
		mycar.tirePrint(han);
		
		
	}

}
