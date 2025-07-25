package com.khyuna0.ch07.part01_Exer;

public class Student extends Person{
	int grade;
	int classNum; // 반
	
	public void print() {
		super.print();
		System.out.println(this.age);
		System.out.println(this.gender);
	}
}
