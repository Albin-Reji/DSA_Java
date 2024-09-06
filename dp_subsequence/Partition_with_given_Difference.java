package dp_subsequence;

import java.util.Arrays;

public class Partition_with_given_Difference {

	public static void main(String[] args) {
		
		int arr[] =  { 5, 2, 6, 4};
		System.out.println(countPartitions(arr.length, 3, arr));
	}
	public static int countPartitions(int n, int d, int[] arr) {
        int totSum=0;
        for(int i=0;i<n;i++) {
        	totSum+=arr[i];
        }
        if(totSum-d<0||(totSum-d)%2==1)return 0;
		return perfectSum(arr, n, (totSum-d)/2);
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
