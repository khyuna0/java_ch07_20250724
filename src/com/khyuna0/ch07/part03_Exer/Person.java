package com.khyuna0.ch07.part03_Exer;

public abstract class Person {
	
	 String name;
	 
	    public Person(String name) {
	        this.name = name;
	    }
	    
	    public abstract void sayHello();
	    
	    public static void printHi() {
	    	System.out.println("안녕하세요. 반갑습니다!");
	    }
	}


