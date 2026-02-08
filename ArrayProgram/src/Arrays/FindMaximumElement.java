package Arrays;
import java.util.Scanner;

public class FindMaximumElement {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Array Size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter Array Elements");
		for(int i=0;i<=arr.length-1;i++) {
		System.out.println("Enter element for " +i);
		arr[i] = sc.nextInt();
	}
	int max = arr[0];
	for(int i=1;i<=arr.length;i++) {
		if(arr[i]>max) {
			max = arr[i];
		}
	}
	System.out.println("Maximum Element Of An Array " + max);
	}

}
