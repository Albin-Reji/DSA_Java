package dp_LIS;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		 int[] nums = {10,9,2,5,3,7,101,18};
		 System.out.println(lengthOfLIS(nums));
		 System.out.println(tabulation(nums));

	}
	public static int lengthOfLIS(int[] nums) {
		int dp[][]=new int[nums.length][nums.length];
		for(int d[]:dp) {
			Arrays.fill(d, -1);
		}
        return getLongest(0, -1, nums, dp);
    }
	static int getLongest(int index, int prev, int nums[], int [][]dp) {
		if(index==nums.length)return 0;		
		if(dp[index][prev+1]!=-1)return dp[index][prev+1];
		int take=0;
		if(prev==-1||nums[index]>nums[prev]) {
			take=1+getLongest(index+1, index, nums, dp);
		}
		int notTake=0+getLongest(index+1, prev, nums, dp);
		
		return dp[index][prev+1]=Math.max(take, notTake);
	}
	static int tabulation(int nums[]) {
		int dp[]=new int[nums.length];
		Arrays.fill(dp, 1);
		int lis=0;
		for(int index=0;index<=nums.length-1;index++) {
			for(int prev=0;prev<index;prev++) {
				if(nums[prev]<nums[index]) {
					dp[index]=Math.max(dp[prev]+1,dp[index] );
				}
			}
			lis=Math.max(lis, dp[index]);
		}
		
		
		return lis;
	}

}
