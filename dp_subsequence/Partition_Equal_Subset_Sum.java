package dp_subsequence;

import java.util.Arrays;

public class Partition_Equal_Subset_Sum {

	public static void main(String[] args) {
		

	}
	public static boolean canPartition(int[] nums) {
		int target=0;
			for(int i=0;i<nums.length;i++) {
				target+=nums[i];
			}
			if(target%2==1)return false;
			int dp[][]=new int[201][20001];
			for(int d[]:dp) {
				Arrays.fill(d, -1);
			}
	        return findPartition(nums.length-1, nums, target/2,dp);
	    }
		static boolean findPartition(int index, int arr[], int target, int dp[][]) {
			if(index==0)return arr[0]==target;
			if(target==0)return true;
			boolean take=false;
			if(dp[index][target]!=-1)return dp[index][target]==1?true:false;
			if(target>=arr[index]) {
				take=findPartition(index-1, arr, target-arr[index], dp);
			}
			boolean nottake=findPartition(index-1, arr, target, dp);
			dp[index][target]=take||nottake==true?1:0;
			return dp[index][target]==1;
		}
		static boolean tabulation(int arr[], int target) {
			int dp[][]=new int[201][20001];
			dp[0][target]=1;
		}

}
