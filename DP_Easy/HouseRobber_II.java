package DP_Easy;

import java.util.Arrays;

import javax.sql.rowset.JoinRowSet;

public class HouseRobber_II {

	public static void main(String[] args) {
		int[]nums = {1,2,3,1};
		System.out.println(rob(nums));

	}
	public static int rob(int[] nums) {
		int temp1[]=new int[nums.length-1];
		int temp2[]=new int[nums.length-1];
		for(int i=0;i<nums.length;i++) {
			if(i!=0) {
				temp1[i-1]=nums[i];
			}
			if(i!=nums.length-1) {
				temp2[i]=nums[i];
			}
		}
		int dp[]=new int[nums.length+1];
		Arrays.fill(dp, -1);;
        return Math.max(maxRob(temp1, temp1.length-1, dp),maxRob(temp2, temp2.length-1, dp));
    }
//	static int maxRobber(int arr[], int index, int[] dp) {
//		if(index==0) {
//			return arr[0];
//		}
//		if(index<0)return 0;
//		if(dp[index]!=-1)return dp[index];
//		int left=Integer.MIN_VALUE;
//		int right=Integer.MIN_VALUE;
//		
//		left=maxRob(arr, index-2, dp)+arr[index];
//		right=maxRob(arr, index-1, dp)+0;
//		return dp[index]=Math.max(left, right);
//	}
	static int maxRob(int arr[], int  index, int[] dp) {
		dp[0]=arr[0];
		for(int i=1;i<arr.length;i++) {
			int left=arr[i];
			if(i>1) {
				left+=dp[i-2];
			}
			int right=dp[i-1]+0;
			dp[i]=Math.max(left, right);
		}
		return dp[arr.length-1];
	}

}
