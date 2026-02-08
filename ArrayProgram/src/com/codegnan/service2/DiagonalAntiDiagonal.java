package com.codegnan.service2;
import java.util.Scanner;
public class DiagonalAntiDiagonal {

	public static void main(String[] args) {
		int [][] a = {{1,2,3},
					  {2,3,4},
					  {5,6,7}
					  };
		
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(i==j || i+j==2) {
					System.out.println(a[i][j]+" ");
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}

	}

}
