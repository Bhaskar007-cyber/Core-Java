package com.codegnan.service2;

import java.util.Scanner;

public class DynamicArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row size");
		int row = sc.nextInt();
		System.out.println("Enter Col Size");
		int col = sc.nextInt();
		int[][] arr = new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==j)
				System.out.println("Enter element for inder" + i + j);
				arr[i][j] = sc.nextInt();
			}
		}
		for(int itr[] : arr) {
			for(int j : itr) {
				System.out.print((j+" "));
			}
			System.out.println();
		}
		
	}

}
