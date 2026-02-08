package com.codegnan.service2;
import java.util.Scanner;

public class TransposeofMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter row size");
		int row=sc.nextInt();
		System.out.println("enter col size");
		int col=sc.nextInt();
		int a[][]=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.println("enter array elements"+i+""+j);
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		int temp[][]=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				temp[j][i]= a[i][j];
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(temp[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}