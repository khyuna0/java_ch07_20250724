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
		
		// 5. 
		
	}

}
