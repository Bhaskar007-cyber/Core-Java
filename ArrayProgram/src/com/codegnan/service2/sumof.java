package com.codegnan.service2;
import java.util.Scanner;
public class sumof {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row size");
		int row = sc.nextInt();
		System.out.println("Enter col Size");
		int col = sc.nextInt();
		int a[][] = new int[row] [col];
		int b[][] = new int[row] [col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.println("Enter element of index" +i+""+j);
				a[i][j]=sc.nextInt();
				b[i][j]=sc.nextInt();
	}

}
		int c[][]=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}

	}
}
