package ArraysOperations;

import java.util.Arrays;

public class RemoveElement {
	
	static int remove(int arr[], int n, int pos) {
		if (n==0) {
			System.out.println("Null ");
		}
		else {
			for(int i=pos;i<=n-1;i++) {
				arr[i-1]=arr[i];
			}
		}
		return n-1;
	}
	
	static int removeEnd(int arr[], int n) {
		if (n==0)
			return 0;
		return n-1;
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
    	int n=arr.length;
    	int pos=3;
//    	System.out.println(Arrays.toString(arr));
//    	int num=remove(arr, n, pos);
//    	for(int i=0;i<num;i++) {
//			System.out.println(arr[i]);
//		}
    	n=removeEnd(arr, n);
    	for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}

	}

}
