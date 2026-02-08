package com.cdgn.model;

public class CurrentAccount extends Account{
	private double OVER_DRAFT = 5000;
	public CurrentAccount(int id, Customer customer, double balance) {
		super(id, customer, balance);
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
