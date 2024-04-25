package Binary_Search_On_Answers;

import java.util.Arrays;

public class Aggressive_Cows {

	public static void main(String[] args) {
		 int[] stalls = {0, 3, 4, 7, 10, 9};
	     int k = 4;
	     System.out.println(findMinDist(stalls, k));
		
	}
	static int findMinDist(int arr[], int cows) {
		int low=0;
		int n=arr.length;
		Arrays.sort(arr);
		int high=arr[n-1]-arr[0];
		while(low<=high) {
			int mid=(low+high)/2;
			if(canWeplace(arr, mid, cows)) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		return high;
		
	}
	static boolean canWeplace(int arr[], int dist, int cows) {
		int n=arr.length;
		int last=arr[0];
		int cowCnt=1;
		for(int i=1;i<n;i++) {
			if((arr[i]-last)>=dist) {
				cowCnt+=1;
				last=arr[i];	
			}
		}
		if(cowCnt>=cows)return true;
		return false;
		
	}
	

}
