package dynamic_Programming;

import java.util.ArrayList;

public class RecusrionDP_II {

	public static void main(String[] args) {
		int arr[]= {1,2,3, 5, 4};
		System.out.println(printSequence(arr, 5));

	}
	public static int printSequence(int arr[], int k){
		return getSum(arr, k, 0, 0);
	}
	static int getSum(int arr[], int k, int currSum, int index) {
		if(index==arr.length) {
			if(currSum==k) {
				return 1;
			}
			return 0;
		}
		int left=getSum(arr, k, currSum+arr[index], index+1);
		int right=getSum(arr, k, currSum-arr[index], index+1);
		return left+right;
	}

}
