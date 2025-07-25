package com.khyuna0.ch07.part02;

import com.khyuna0.ch07.part01_Exer.Solider;

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
		
		person = student;
		person = soldier;
		
//		soldier = person;
//		soldier = student;
		
		
	}

}
