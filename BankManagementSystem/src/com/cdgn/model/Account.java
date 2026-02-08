package com.cdgn.model;

public abstract class Account {
	protected Account(int id, Customer customer, double balance) {
		super();
		this.id = id;
		this.customer = customer;
		this.balance = balance;
	}
	private int id;
	private Customer customer;
	protected double balance;
	public  Account() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + "\n customer=" + customer + "\n balance=" + balance + "]\n";
	}
	public void deposit(double amount) {
		balance = balance + amount;
	}
	public abstract boolean withdraw(double amount);
}
