package com.codegnan.service2;
import java.util.Scanner;
public class sumofelements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row size");
		int row = sc.nextInt();
		System.out.println("Enter col Size");
		int col = sc.nextInt();
		int a[][] = new int[row] [col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.println("Enter element of index" +i+""+j);
				a[i][j]=sc.nextInt();
			}
		}
		int sum=0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				sum = sum+a[i][j];
			}
		}
		System.out.println(sum+" ");

	}

}
