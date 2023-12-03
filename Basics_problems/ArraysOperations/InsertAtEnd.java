package ArraysOperations;

import java.util.Arrays;

public class InsertAtEnd {
	
	static int[] insert(int arr[],int n, int newElement) {
		int newArray[]=new int[n+1];
		for(int i=0;i<n;i++) {
			newArray[i]=arr[i];
		}
		newArray[n]=newElement;
		return newArray;
	}
	
    public static void main(String[] args) {
    	int[] arr = {1, 2, 3, 4, 5};
    	int n=arr.length;
        int newElement = 99; 
        int res[]=insert(arr, n, newElement);
        System.out.println(Arrays.toString(res));
    	
    }
    

}
