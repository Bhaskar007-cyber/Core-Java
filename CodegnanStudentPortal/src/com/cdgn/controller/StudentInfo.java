package com.cdgn.controller;
import java.util.Scanner;

import com.cdgn.service.StudentService;

public class StudentInfo {
	public static void main(String[] args) {
		StudentService service = new StudentService();
		int choice= 0;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("**************** \n"
					+ "Enter Your Choice: \n"
					+ "1. Create Customer \n"
					+ "2. Create Account \n"
					+ "3. Deposite Amount\n"
					+ "4. Withdraw Amount \n"
					+ "5. View Balance\n"
					+ "6. View Account By ID \n"
					+ "7. View All Accounts \n"
					+ "8. Exit \n"
					+ "***************");
		 choice = scanner.nextInt();
		switch (choice) {
		case 1->{
			System.out.println("Enter Customer Id");
			int s_id = scanner.nextInt();
			System.out.println("Enter Name");
			String name = scanner.next();
			service.CreateStudent(s_id,name);
		}
		case 2->{
			System.out.println("Enter Account Id");
			int acc_id = scanner.nextInt();
			System.out.println("Enter Type of Account");
			String type = scanner.next();
			System.out.println("Enter Customer Id");
			int s_id = scanner.nextInt();
			System.out.println("Enter Balance");
			double balance = scanner.nextDouble();
			service.Student(acc_id, type, s_id, balance);
		}
		case 3->{
			System.out.println("Enter Account Id");
			int acc_id = scanner.nextInt();
			System.out.println("Enter Amount to deposit");
			double Student = scanner.nextDouble();
			service.deposit(acc_id,Student);
		}
		case 4->{
			System.out.println("Enter Account Id");
			int acc_id = scanner.nextInt();
			System.out.println("Enter Amount to withdraw");
			double Student = scanner.nextDouble();
			service.withdraw(acc_id,Student);
		}
		case 5->{
			System.out.println("Enter Student Id");
			int s_id = scanner.nextInt();
			service.viewBalance(s_id);
		}
		case 6->{
			System.out.println("Enter Student Id");
			int s_id = scanner.nextInt();
			service.viewAccountById(s_id);
		}
		case 7->{
			service.viewAllCounts();
			
		}
		case 8->{
			System.out.println("Thank you for visiting us");
			System.exit(1);
		}
		default->{
			System.out.println("Invalid choice");
		}
		}
		}while(choice != 8);
	}

}
