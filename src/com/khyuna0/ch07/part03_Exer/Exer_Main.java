package com.khyuna0.ch07.part03_Exer;

public class Exer_Main {
	
	public static void main(String[] args) {
		
		// 1. BankAccount
		
		BankAccount bankAccount1 = new BankAccount();
		BankAccount bankAccount2 = new BankAccount();
		
		// 음수
		bankAccount1.setBalance(-1000.0);
		System.out.println(bankAccount1.getBalance()); // 음수 입력하면 0.0 출력?
		
		//양수
		bankAccount2.setBalance(1000.0);
		System.out.println(bankAccount2.getBalance());
		
		
		System.out.println("=================");
		
		// 2. Instrument
		
		Piano piano = new Piano();
		Guitar guitar = new Guitar();
		
		piano.play();
		guitar.play();
		
		System.out.println("=================");
		
		// 3. Employee
		
		Developer developer = new Developer();
		Designer designer = new Designer();
		
		developer.work();
		designer.work();
		
		System.out.println("=================");
		
		// 4. Vehicle
		
		Bus bus = new Bus();
		Truck truck = new Truck();
		
		bus.stop();
		bus.move();;
		truck.stop();
		truck.move();
		
		System.out.println("=================");
		
		// 5. Computer
		
		Laptop laptop = new Laptop();
		Desktop desktop = new Desktop();
		
		laptop.turnOn();
		laptop.turnOff();
		
		desktop.turnOn();
		desktop.turnOff();
		
		System.out.println("=================");
		
		// 6. Person
		
		// 6-1 Person 클래스의 실체 클래스에서 super() 키워드로 Person 클래스의 매개변수를 초기화하면 사용할 수 있게 됩니다.
		// 실체 클래스 생성 -> super() 사용, 생성자 호출 후 초기화 -> 자식 객체(인스턴스?) 생성 -> 부모 타입으로 업캐스팅
		// static 메소드는 객체 생성 하지 않고 클래스명.메소드명으로 호출
		
		Student student = new Student("이름");
		Person person = new Student("이름"); // 같은 인스턴스 참조?
		
		student.sayHello();
		Person.printHi();
		
	}

}
