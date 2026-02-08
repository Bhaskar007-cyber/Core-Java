package Arrays;
import java.util.Scanner;
public class SearchanElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter search element");
		int searchele = sc.nextInt();
		System.out.println("Enter array size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter Array Elements");
		for(int i=0;i<=size-1;i++) {
			System.out.println("Enter array elements for index" + i);
			arr[i] = sc.nextInt();
		}
		boolean flag = false;
		int pos = -1;
		for(int i=0;i<=arr.length;i++) {
			if(searchele == arr[i]) {
				pos = i;
				flag = true;
						break;
			}
		}
		if(flag) {
			System.out.println("Element found at :" + pos);
		}

	}

}
