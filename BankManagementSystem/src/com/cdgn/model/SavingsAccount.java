package com.cdgn.model;

public class SavingsAccount  extends Account{
private double MINIMUM_BALANCE = 3000;	

	public SavingsAccount(int id, Customer customer, double balance) {
		super(id, customer, balance);
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
