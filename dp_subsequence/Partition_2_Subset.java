package dp_subsequence;

import java.util.Arrays;

public class Partition_2_Subset {

	public static void main(String[] args) {
		int nums[]= {1,1, 6};
		System.out.println(minimumDifference(nums));
		

	}
	public static int minimumDifference(int[] nums) {
        int totSum=0;
        for(int i=0;i<nums.length;i++) {
        	totSum+=nums[i];
        }
        boolean dp[][]=dpAns(nums, totSum);
        int minDiff=Integer.MAX_VALUE;
        for(int i=0;i<=totSum/2;i++) {
        	minDiff=dp[nums.length-1][i]==true?Math.min(minDiff, Math.abs(i-(totSum-i))):minDiff;
        }
        return minDiff;
        
    }
	static boolean[][] dpAns(int nums[], int totSum) {
		boolean dp[][]=new boolean[nums.length][totSum+1];
		dp[0][nums[0]]=true;
		for(int i=0;i<nums.length;i++) {
			dp[i][0]=true;
		}
		for(int ind=1;ind<nums.length;ind++) {
			for(int target=1;target<=totSum;target++) {
				boolean take=false;
				if(nums[ind]<=target) {
					take=dp[ind-1][target-nums[ind]];
				}
				boolean nottake=dp[ind-1][target];
				
				dp[ind][target]=take||nottake;
			}
		}
		return dp;
	}
}
