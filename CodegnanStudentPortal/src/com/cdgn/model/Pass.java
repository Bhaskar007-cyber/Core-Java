package com.cdgn.model;

public class Pass extends Student{
	private double MINIMUM_BALANCE = 50;	

	public Pass(int id, Student student, double balance) {
		super(id, student, balance);
	}

	@Override
	public boolean withdraw(double amount) {
		if(balance - amount >= MINIMUM_BALANCE) {
			balance = balance-amount;
			return true;
		}
		else {
			return false;
		}
		
	}

}
