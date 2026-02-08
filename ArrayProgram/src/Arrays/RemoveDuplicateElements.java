package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Array Size");
		int size = sc.nextInt();
		int a[] = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter an element for index "+ i);
			a[i] = sc.nextInt();
		}
		int temp[] = new int[a.length];
		int index =0;
		for(int i=0;i<a.length;i++) {
			boolean isduplicate = false;
			for(int j=0;j<temp.length;j++) {
				if(a[i]==temp[j]) {
					isduplicate = true;
					break;
					
				}
				
			}
			if(!isduplicate) {
				temp[index++]=a[i];
			}
		}
		for(int itr : temp) {
			if(itr !=0) {
				System.out.println(itr +" ");
				
			}
		}
		//for (int i=0;i<temp;length++);

	}

}
