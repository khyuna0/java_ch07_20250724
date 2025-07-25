package com.khyuna0.ch07.part03_Exer;

public class BankAccount {

	 private double balance;

	 public double getBalance() {
		 return balance;
	 }

	 public void setBalance(double balance) {
		 if ( balance < 0 ) {
			 this.balance = 0;
			 return;
		 } else {
			 this.balance = balance;
		 } 
	 }
}
