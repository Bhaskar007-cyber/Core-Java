package com.cdgn.model;

public abstract class Student {
	protected Student(int id, Student student, double balance) {
		super();
		this.id = id;
		this.student = student;
		this.balance = balance;
	}
	private int id;
	private Student student;
	protected double balance;
	public  Student() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Student getCustomer() {
		return student;
	}
	public void setCustomer(Student student) {
		this.student = student;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + "\n student=" + student + "\n balance=" + balance + "]\n";
	}
	public void Enter(double student) {
		balance = balance + student;
	}
	public abstract boolean withdraw(double student);
	public Student get(int s_id) {
		
		return null;
	}
}
