package com.khyuna0.ch07.part02.test;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ************** Upcasting *************
		Animal animal = new Dog(); //업 캐스팅
		animal.name = "똘똘이";
		// animal.age = 4; // 자식 클래스의 필드는 접근 불가 -> 에러발생!
		animal.sound(); //멍멍 -> 오버라이딩된 메서드가 실행됨
		
		// ************** Downcasting *************
		Dog dog;
		dog = (Dog) animal; //다운 캐스팅
		dog.age = 10;
		dog.name = "멍멍이";
		dog.sound(); //멍멍 -> 오버라이딩된 메서드가 실행됨
		
		Animal animal2 = new Animal(); // 인스턴스화 -> 실제 객체가 Animal 클래스로 만들어 짐
		// Dog dog2 = (Dog) animal2; // ClassCastException 오류 발생!
		
		
		// *********** 업캐스팅과 다운캐스팅 자식 접근 연습 ************
		Animal animal3 = new Cat(); // 업 캐스팅
		// animal3.eat(); // 자식 메서드 접근불가 -> 오류발생!
		Cat cat = (Cat) animal3; // 다운 캐스팅
		cat.eat(); // 자식 메서드 접근 가능
		
		Dog dog3;
		// 다운캐스팅 할때 instanceof 연산자로 확인 후 다운 캐스팅을 하면 안전하게 다운 캐스팅 가능 
		if(animal instanceof Dog) { //true -> animal이 Dog클래스로 만든 객체를 참조하고 있다는 것을 확인 
			dog3 = (Dog) animal; //다운 캐스팅
			dog3.sound();
		}
	}

}
