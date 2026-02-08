package com.codegnan.service2;

public class TwoDimensionArray {

	public static void main(String[] args) {
		int [][]arr= {{10,20,30},
					  {40,50,60},
					  {70,80,90},
						};
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
			System.out.print(arr[i][j] + " ");	
			}
			System.out.println();
		}
		//foreach method
		System.out.println("**************");
		for(int itr[]:arr) {
			for(int j : itr) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
