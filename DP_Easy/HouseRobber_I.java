package DP_Easy;

import java.util.Arrays;

public class HouseRobber_I {

	public static void main(String[] args) {
		int[]nums = {1,2,3,1};
		System.out.println(rob(nums));
	}
	public static int rob(int[] nums) {
		int dp[]=new int[nums.length+1];
		Arrays.fill(dp, -1);
        return findMaxMoney(nums, nums.length-1, dp);
    }
	static int findMax(int arr[], int index,int []dp) {
		if(index==0) {
			return arr[index];
		}
		
        if(index<0)return 0;
        if(dp[index]!=-1)return dp[index];
		int left=Integer.MIN_VALUE;
		int right=Integer.MIN_VALUE;
        left=findMax(arr, index-2, dp) +arr[index];
        right=findMax(arr, index-1,dp)+ 0;
		return dp[index]=Math.max(left, right);
	}
	static int findMaxMoney(int arr[], int index,int []dp) {
		dp[0]=arr[0];
		dp[1]=Math.max(dp[0], arr[1]);
		for(int i=2;i<=arr.length-1;i++) {
			int left=findMaxMoney(arr, index-2, dp) +arr[index];
	        int =findMaxMoney(arr, index-1,dp)+ 0;
			dp[index]=Math.max(left, right);
		}
		return dp[arr.length-1];
	}

}
