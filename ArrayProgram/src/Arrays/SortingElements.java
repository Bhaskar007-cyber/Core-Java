package Arrays;

public class SortingElements {

	public static void main(String[] args) {
		int []a = {10,30,40,20,44,35,70,90,100,5,2,55};
		//Arrays.sort(a);
		//System.out.println(a.toString());	
		for(int i = 0;i<a.length-1;i++) {
			for(int j = 0;j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
	}

}
