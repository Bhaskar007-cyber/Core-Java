package com.cdgn.service;

import java.util.HashMap;
import java.util.Map;

import com.cdgn.model.CreateStudent;
import com.cdgn.model.Student;
import com.cdgn.model.Fail;
import com.cdgn.model.Pass;


public class StudentService {
	HashMap<Integer, CreateStudent> CreateStudent = new HashMap<Integer, CreateStudent>();
	HashMap<Integer, Student> Student = new HashMap<Integer, Student>();
	public void CreateStudent(int s_id, String name) {
		CreateStudent createstudent = new CreateStudent(s_id, name);
		CreateStudent.put(s_id,  createstudent);
		System.out.println("Customer Created Successfully......");
		
		
	}
	public void createAccount(int acc_id, String type, int c_id, double balance) {
		if(CreateStudent.containsKey(c_id)) {
			if(type.equalsIgnoreCase("Savings")) {
				Pass account = new Pass(s_id, CreateStudent.get(c_id), balance);
				Student.put(acc_id, account);
				System.out.println("Savings Account Created Successfully......");
			} 
			else {
				if(type.equalsIgnoreCase("current")) {
					Fail Student = new Fail(s_id, CreateStudent.get(c_id), balance);	
					Student.put(acc_id, Student);
					System.out.println("Current Account Created Sucssfully.....");
				}
				else {
					System.out.println("Invalid Account type");
				}
			}
		}
		else {
			System.out.println("Invalid Customer Id");
		}
	}
	public void deposit(int s_id, double Student) {
		if(Student.containsKey(s_id)) {
			Student student = Student.get(s_id);
			student.Enter(Student);
			System.out.println("Amount Deposited Now Total Balance : "+student.getBalance());
		}
		else {
			System.out.println("Invalid Account Id");
		}
	}
	public void withdraw(int s_id, double amount) {
		if(Student.containsKey(s_id)) {
			Student student = students.get(s_id);
			
			if(student.withdraw(amount)) {
				//account.withdraw(amount);
				System.out.println("Amount withdrwan TotalBalance: "+ student.getBalance());
			}
			else {
			System.out.println("Insufficient Balance ...");
			}
		
		}
		else {
			System.out.println("Invalid Account Id");
		}
		
	}
	public void viewBalance(int acc_id) {
		if(accounts.containsKey(acc_id)) {
			Student student = accounts.get(acc_id);
			System.out.println("Total Balance : "+student.getBalance());
		}
		else {
			System.out.println("Invalid Account Id");
		}
		
	}
	public void viewAccountById(int acc_id) {
		if(accounts.containsKey(acc_id)) {
			Student student = accounts.get(acc_id);
			System.out.println("Account Details : "+student);
		}
		else {
			System.out.println("Invalid Account Id");
		}

		
	}
	public void viewAllCounts() {
		for(Map.Entry<Integer, Student> stu: accounts.entrySet()) {
			System.out.println(stu);
		}
	
	}
	public void Student(int acc_id, String type, int c_id, double balance) {
		// TODO Auto-generated method stub
		
	}

}
