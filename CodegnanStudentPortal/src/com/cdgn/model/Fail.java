package com.cdgn.model;

public class Fail extends Student{
	private double OVER_DRAFT = 60;
	public Fail(int id, Student student, double balance) {
		super(id, student, balance);
	}

	@Override
	public boolean withdraw(double amount) {
		if(balance - amount >= -OVER_DRAFT) {
			balance = balance-amount;
			return true;
			
		}
		else {
		return false;
		}
	}

}
