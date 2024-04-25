package Binary_Search;

import java.util.Arrays;

public class FIrstLaastOccurence {

	public static void main(String[] args) {
		int arr[]= {3,4,6, 6,7, 7,7,7,9,12,16,17, 17, 17};
		int n=arr.length;
		int res[]=firstLastIndex(arr, n, 6);
		System.out.println(Arrays.toString(res));

	}
	static int[] firstLastIndex(int arr[], int n , int x) {
		int lb=lowerBound(arr, n, x);
		if(lb==n||arr[lb]!=x)return new int[] {-1,-1};
		return new int[] {lb, upperBound(arr, n, x)-1};
		
	}
	
	static int lowerBound(int arr[], int n, int x) {
		int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high) {
        	int mid=low+(high-low)/2;
        	if(arr[mid]>=x) {
        		ans=mid;
        		high=mid-1;
        	}
        	else {
        		low=mid+1;
        	}
        }
        return ans;
	}
	
	
	public static int upperBound(int []arr, int n, int x) {
		int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high) {
        	int mid=low+(high-low)/2;
        	if(arr[mid]>x) {
        		ans=mid;
        		high=mid-1;
        	}
        	else {
        		low=mid+1;
        	}
        }
        return ans;
    }
}
