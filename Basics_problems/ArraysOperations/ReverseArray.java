package ArraysOperations;

import java.util.Arrays;

class ReverseArray {
    
	 public static int[] reverseArray(int[] arr) {
		 int end=arr.length-1;
		 int start=0;
		 int temp;
		 while(start<end) {
	    	  temp=arr[start];
	    	  arr[start]=arr[end];
	    	  arr[end]=temp;
	    	  start++;
	    	  end--;
	      }
	      return arr;
	        
	 }
	
    public static void main(String a[]) {
    	int arr[]= {1,2,3,4,5,6};
    	int res[]=reverseArray(arr);
    	System.out.println(Arrays.toString(res));
	}
}