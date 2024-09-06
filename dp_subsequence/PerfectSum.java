package dp_subsequence;

import java.util.Arrays;

public class PerfectSum {

	public static void main(String[] args) {
		int arr[]= {9 ,7, 0, 3 ,9 ,8, 6, 5 ,7, 6};
		System.out.println(perfectSum(arr, arr.length, 31));

	}
	public static int perfectSum(int arr[],int n, int sum) 
	{ 
		int dp[][]=new int[n+1][sum+1];
		for(int[] d:dp) {
			Arrays.fill(d, -1);
		}
	   return findAllWays(n-1, arr,  sum, dp);
	}
	
	static int findAllWays(int index, int arr[]  , int target, int dp[][]) {

		if(index==0) {
            if (target == 0 && arr[0] == 0) return 2; 
            if(target==0||arr[0]==target)return 1;
			return 0;
		}
		
		if(dp[index][target]!=-1)return dp[index][target];
		int take=0;
		if(arr[index]<=target) {
			take=findAllWays(index-1, arr, target-arr[index], dp);
		}
		int notTake=findAllWays(index-1, arr, target, dp);
		
		return dp[index][target]=(take+notTake)%1000000007;
	}

}
