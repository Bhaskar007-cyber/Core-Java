package com.cdgn.service;

import java.util.HashMap;
import java.util.Map;

import com.cdgn.model.Account;
import com.cdgn.model.CurrentAccount;
import com.cdgn.model.Customer;
import com.cdgn.model.SavingsAccount;


public class BankService {
	HashMap<Integer, Customer> customers = new HashMap<Integer, Customer>();
	HashMap<Integer, Account> accounts = new HashMap<Integer, Account>();
	public void createCustomer(int c_id, String name) {
		Customer customer = new Customer(c_id, name);
		customers.put(c_id,  customer);
		System.out.println("Customer Created Successfully......");
		
		
	}
	public void createAccount(int acc_id, String type, int c_id, double balance) {
		if(customers.containsKey(c_id)) {
			if(type.equalsIgnoreCase("Savings")) {
				SavingsAccount account = new SavingsAccount(acc_id, customers.get(c_id), balance);
				accounts.put(acc_id, account);
				System.out.println("Savings Account Created Successfully......");
			} 
			else {
				if(type.equalsIgnoreCase("current")) {
					CurrentAccount account = new CurrentAccount(acc_id, customers.get(c_id), balance);	
					accounts.put(acc_id, account);
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
	public void deposit(int acc_id, double amount) {
		if(accounts.containsKey(acc_id)) {
			Account account = accounts.get(acc_id);
			account.deposit(amount);
			System.out.println("Amount Deposited Now Total Balance : "+account.getBalance());
		}
		else {
			System.out.println("Invalid Account Id");
		}
	}
	public void withdraw(int acc_id, double amount) {
		if(accounts.containsKey(acc_id)) {
			Account account = accounts.get(acc_id);
			
			if(account.withdraw(amount)) {
				//account.withdraw(amount);
				System.out.println("Amount withdrwan TotalBalance: "+ account.getBalance());
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
			Account account = accounts.get(acc_id);
			System.out.println("Total Balance : "+account.getBalance());
		}
		else {
			System.out.println("Invalid Account Id");
		}
		
	}
	public void viewAccountById(int acc_id) {
		if(accounts.containsKey(acc_id)) {
			Account account = accounts.get(acc_id);
			System.out.println("Account Details : "+account);
		}
		else {
			System.out.println("Invalid Account Id");
		}

		
	}
	public void viewAllCounts() {
		for(Map.Entry<Integer, Account> acco: accounts.entrySet()) {
			System.out.println(acco);
		}
	
	}

}
