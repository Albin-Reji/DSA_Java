package BinarySearch_problems;

import java.util.Arrays;

public class SearchRange {

	public static void main(String[] args) {
//		int arr[]= {2,3,1,5,6,7,8,4,5,6,70,98,67,43};
		int arr2d[][]= {
				{1,2,4},
				{4,5,8,9},
				{8,90,56,43}
		};
		int a2d[][]= {};
//		int res[]=findminmax(arr);
//		System.out.println(Arrays.toString(res));
		int ans[]=search2Darray(a2d, 43);
		System.out.println(Arrays.toString(ans));

	}
	static int searchRange(int arr[], int start, int end, int target) {
		if (arr.length==0)
			return -1;
		for(int i=start; i<=end;i++) {
			if (arr[i]==target)
				return i;
		}
		return -1;
	}
	///search in 2D arrays
//	
	static int[] search2Darray(int arr[][], int target) {
		if(arr.length==0)
			return new int[] {-1,-1};
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				if(arr[row][col]==target)
					return new int[] {row, col};
			}
		}
		return new int[] {-1,-1};
	}
	//min and max in an array
	static int[] findminmax(int arr[]) {
		int min=arr[0];
		int max=arr[0];
		if(arr.length==0)
			return new int[] {-1};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min)
				min=arr[i];
			if(arr[i]>max)
				max=arr[i];
			
		}
		return new int[] {min,max};
		
	}
}
