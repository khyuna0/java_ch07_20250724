package com.khyuna0.ch07.part01;

public class Student extends Person {

	int grade; // 학년
	
	public Student(String name, int grade ,int age) {
		super(name, age); // 부모생성자 호출하면서 name 값을 부모 생성자의 필드값으로 넘김 (필수)
		this.grade = grade;
	}
}
 