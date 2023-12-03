package ArraysOperations;

import java.util.Arrays;

public class InserAtPosition {
	static int[] insertAtpos(int arr[],int n, int pos, int data) {
		int newArray[]=new int[n+1];
		for(int i=0;i<n;i++) {
			newArray[i]=arr[i];
			
		}
		for(int i=n-1;i>=pos-1;i--) {
			newArray[i+1]=newArray[i];
		}
		newArray[pos-1]=data;
		return newArray;
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
    	int n=arr.length;
    	int pos=3;
        int newElement = 99; 
        System.out.println(Arrays.toString(arr));
        int res[]=insertAtpos(arr, n, pos, newElement);
        System.out.println(Arrays.toString(res));
	}

}
